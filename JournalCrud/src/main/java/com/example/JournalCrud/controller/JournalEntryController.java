package com.example.JournalCrud.controller;

import com.example.JournalCrud.model.JournalEntity;
import com.example.JournalCrud.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntity> getAll(){
        return journalEntryService.getAll();
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("/{myId}")
    public JournalEntity getById(@PathVariable String myId){
        return journalEntryService.findById(myId).orElse(null);
    }
    @PutMapping("/{myId}")
    public JournalEntity updateData(@PathVariable String myId,@RequestBody JournalEntity newEntry){
        JournalEntity old = journalEntryService.findById(myId).orElse(null);
        if (old!=null){
            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("")?newEntry.getTitle(): old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().equals("")?newEntry.getContent(): old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
    @DeleteMapping("/{myId}")
    public boolean deleteJournalEntry(@PathVariable String myId){
        journalEntryService.deleteById(myId);
        return true;
    }
}
