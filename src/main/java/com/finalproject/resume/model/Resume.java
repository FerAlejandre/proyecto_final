package com.finalproject.resume.model;

import com.finalproject.resume.domain.CreateResumeRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@ToString
@Document(collection = "resumes")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String _id;
    private String firstName;
    private String lastName;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;

    /*private CreateResumeRequest.Skills skills;

    @Getter
    @Setter
    @ToString
    public static class Skills{
        private String name;
        private Byte percentaje;
    }
    */

}
