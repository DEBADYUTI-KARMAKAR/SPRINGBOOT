package com.example.JournalCrud.repository;

import com.example.JournalCrud.model.JournalEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntity, String> {
}
