package com.example.jurnalAppDemo.repository;

import com.example.jurnalAppDemo.model.JournalEntryModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntryModel, ObjectId> {
}
