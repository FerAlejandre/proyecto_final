package com.finalproject.resume.repository;

import com.finalproject.resume.model.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumesRepository extends MongoRepository<Resume,String>{

}
