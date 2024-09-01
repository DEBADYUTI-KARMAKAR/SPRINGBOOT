package com.example.journal.controller;

import com.example.journal.entity.JournalEntry;
import com.example.journal.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("/{myId}")
    public JournalEntry getById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }
    @PutMapping("/{myId}")
    public JournalEntry updateData(@PathVariable ObjectId myId,@RequestBody JournalEntry newEntry){
        JournalEntry old = journalEntryService.findById(myId).orElse(null);
        if(old!=null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("")?newEntry.getTitle():old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("")?newEntry.getContent():old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
    @DeleteMapping("/{myId}")
    public boolean deleteJournalEntry(@PathVariable ObjectId myId){
         journalEntryService.deleteById(myId);
         return true;
    }
}
