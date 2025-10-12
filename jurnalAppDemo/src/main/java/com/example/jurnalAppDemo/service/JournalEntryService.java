package com.example.jurnalAppDemo.service;

import com.example.jurnalAppDemo.model.JournalEntryModel;
import com.example.jurnalAppDemo.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntryModel journalEntryModel){
        journalEntryRepository.save(journalEntryModel);
    }
    public List<JournalEntryModel> getAll(){
        List<JournalEntryModel> entries = journalEntryRepository.findAll();
        return entries;
    }
    public Optional<JournalEntryModel> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
}
