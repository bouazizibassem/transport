package com.example.demo.repository;
import com.example.demo.models.voyage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoyageRepository extends MongoRepository<voyage, String> {
}
