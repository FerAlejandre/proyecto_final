package com.finalproject.resume.service;

import com.finalproject.resume.domain.CreateResumeRequest;
import com.finalproject.resume.domain.CreateResumeResponse;
import com.finalproject.resume.domain.UpdateResumeRequest;
import com.finalproject.resume.domain.UpdateResumeResponse;
import com.finalproject.resume.model.Resume;
import com.finalproject.resume.repository.ResumesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        resume.setSkills(request.getSkills());
        resume.setLanguages(request.getLanguages());
        resume.setWorkexperiences(request.getWorkexperiences());
        resume.setEducation(request.getEducation());
        resume.setChallenges(request.getChallenges());
        resume.setSocialMedia(request.getSocialMedia());
        resume.setConfig(request.getConfig());
        return resume;
    }

    public List<Resume> getResumes() {
        return repository.findAll();
    }
    
    public UpdateResumeResponse updateResume(UpdateResumeRequest request, String resumeid){

        UpdateResumeResponse response = new UpdateResumeResponse();
        Optional<Resume> existResume = repository.findById(resumeid);

        if(existResume != null){
            Resume newResume = requestToUpdate(request, existResume.get());
            repository.save(newResume);
            response.setFirstName(newResume.getFirstName());
            response.setLastName(newResume.getLastName());
            response.setJob(newResume.getJob());
            response.setCity(newResume.getCity());
            response.setCountry(newResume.getCountry());
            response.setEmail(newResume.getEmail());
            response.setPhoneNumber(newResume.getPhoneNumber());
            response.setSkills(newResume.getSkills());
            response.setLanguages(newResume.getLanguages());
            response.setWorkexperiences(newResume.getWorkexperiences());
            response.setEducation(newResume.getEducation());
            response.setChallenges(newResume.getChallenges());
            response.setSocialMedia(newResume.getSocialMedia());
            response.setConfig(newResume.getConfig());
        }
        return response;
    }

    private Resume requestToUpdate(UpdateResumeRequest request, Resume saveResume){

        if(request.getFirstName() != null)
            saveResume.setFirstName(request.getFirstName());
        else if(request.getFirstName() != null && request.getFirstName().isEmpty())
            saveResume.setFirstName(null);

        if(request.getLastName() != null)
            saveResume.setLastName(request.getLastName());
        else if(request.getLastName() != null && request.getLastName().isEmpty())
            saveResume.setLastName(null);

        if(request.getJob() != null)
            saveResume.setJob(request.getJob());
        else if(request.getJob() != null && request.getJob().isEmpty())
            saveResume.setJob(null);

        if(request.getCity() != null)
            saveResume.setCity(request.getCity());
        else if(request.getCity() != null && request.getCity().isEmpty())
            saveResume.setCity(null);

        if(request.getCountry() != null)
            saveResume.setCountry(request.getCountry());
        else if(request.getCountry() != null && request.getCountry().isEmpty())
            saveResume.setCountry(null);

        if(request.getEmail() != null)
            saveResume.setEmail(request.getEmail());
        else if(request.getEmail() != null && request.getEmail().isEmpty())
            saveResume.setEmail(null);

        if(request.getPhoneNumber() != null)
            saveResume.setPhoneNumber(request.getPhoneNumber());
        else if(request.getPhoneNumber() != null && request.getPhoneNumber().isEmpty())
            saveResume.setPhoneNumber(null);

        if(request.getSkills() != null)
            saveResume.setSkills(request.getSkills());
        else if(request.getSkills() != null && request.getSkills().isEmpty())
            saveResume.setSkills(null);

        if(request.getLanguages() != null)
            saveResume.setLanguages(request.getLanguages());
        else if(request.getLanguages() != null && request.getLanguages().isEmpty())
            saveResume.setLanguages(null);

        if(request.getWorkexperiences() != null)
            saveResume.setWorkexperiences(request.getWorkexperiences());
        else if(request.getWorkexperiences() != null && request.getWorkexperiences().isEmpty())
            saveResume.setWorkexperiences(null);

        if(request.getEducation() != null)
            saveResume.setEducation(request.getEducation());

        if(request.getChallenges() != null)
            saveResume.setChallenges(request.getChallenges());
        else if(request.getChallenges() != null && request.getChallenges().isEmpty())
            saveResume.setChallenges(null);

        if(request.getSocialMedia() != null)
            saveResume.setSocialMedia(request.getSocialMedia());

        if(request.getConfig() != null)
            saveResume.setConfig(request.getConfig());

        return saveResume;
    }
}

