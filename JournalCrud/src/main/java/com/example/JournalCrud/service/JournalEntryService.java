package com.example.JournalCrud.service;

import com.example.JournalCrud.model.JournalEntity;
import com.example.JournalCrud.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntity journalEntity){
        journalEntryRepository.save(journalEntity);
    }
    public List<JournalEntity> getAll(){
        List<JournalEntity> entries = journalEntryRepository.findAll();
        return entries;
    }
    public Optional<JournalEntity> findById(String id){
        return journalEntryRepository.findById(id);
    }
    public void deleteById(String id){
        journalEntryRepository.deleteById(id);
    }
}
