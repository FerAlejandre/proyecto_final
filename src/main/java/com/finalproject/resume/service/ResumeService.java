package com.finalproject.resume.service;

import com.finalproject.resume.domain.CreateResumeRequest;
import com.finalproject.resume.domain.CreateResumeResponse;
import com.finalproject.resume.domain.UpdateResumeRequest;
import com.finalproject.resume.domain.UpdateResumeResponse;
import com.finalproject.resume.model.Resume;

import java.util.List;

public interface ResumeService {

    CreateResumeResponse createResume(CreateResumeRequest request);
    List<Resume> getResumes();
    UpdateResumeResponse updateResume(UpdateResumeRequest request, String id);
}
