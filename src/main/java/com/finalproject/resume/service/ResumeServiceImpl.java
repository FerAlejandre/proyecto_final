package com.finalproject.resume.service;

import com.finalproject.resume.domain.CreateResumeRequest;
import com.finalproject.resume.domain.CreateResumeResponse;
import com.finalproject.resume.model.Resume;
import com.finalproject.resume.repository.ResumesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class ResumeServiceImpl implements ResumeService{

    private final ResumesRepository repository;

    @Autowired
    public ResumeServiceImpl(ResumesRepository repository){
        this.repository = repository;
    }

    @Override
    public CreateResumeResponse createResume(CreateResumeRequest request) {
        CreateResumeResponse response = new CreateResumeResponse();
        Resume resume = this.requestToResume(request);
        repository.save(resume);
        log.info("Resume saved with id: {}", resume.get_id());
        response.setId(resume.get_id().toString());
        return response;
    }

    private Resume requestToResume(CreateResumeRequest request){
        Resume resume = new Resume();
        resume.setFirstName(request.getFirstName());
        resume.setLastName(request.getLastName());
        resume.setJob(request.getJob());
        resume.setCity(request.getCity());
        resume.setCountry(request.getCountry());
        resume.setEmail(request.getEmail());
        resume.setPhoneNumber(request.getPhoneNumber());
        return resume;
    }

    public List<Resume> getResumes() {

        return repository.findAll();
    }

}

