package com.finalproject.resume.controller;

import com.finalproject.resume.domain.CreateResumeRequest;
import com.finalproject.resume.domain.CreateResumeResponse;
import com.finalproject.resume.service.ResumeService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;
@RequestMapping(value = "/api/v1")
@RestController
@Slf4j

public class CvvController {

    private final ResumeService service;

    @Autowired
    public CvvController(ResumeService service){
        this.service=service;
    }

    @GetMapping(value = "/resume")
    @ResponseStatus(HttpStatus.OK)
    public List getOperation() {
        log.info("Calling Get Operation");
        return service.getResumes();
    }

    @PostMapping(value ="/resume")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CreateResumeResponse> postResumes(
            @ApiParam(value = "Post resume request", required = true) @RequestBody CreateResumeRequest request){
        log.info("UniversityController.postResumes - operation request {}", request);
        CreateResumeResponse response=service.createResume(request);
        log.info("UniversityController.postResumes - operation response {}", response);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }


}