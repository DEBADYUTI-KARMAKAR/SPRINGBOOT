package com.example.journal.controller;

import com.example.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {
//    private Map<Long, JournalEntry> journalEntries= new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//    @GetMapping("/{myId}")
//    public JournalEntry getById(@PathVariable Long myId){
//        return journalEntries.get(myId);
//    }
//    @PutMapping("/{myId}")
//    public JournalEntry updateData(@PathVariable Long myId,@RequestBody JournalEntry myEntry){
//        return  journalEntries.put(myId,myEntry);
//    }
//    @DeleteMapping("/{myId}")
//    public JournalEntry deleteJournalEntry(@PathVariable Long myId){
//        return journalEntries.remove(myId);
//    }
}
