package com.finalproject.resume.model;

import com.finalproject.resume.domain.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

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
    private List<Skill>skills;
    private List<Language>languages;
    private List<Workexperience> workexperiences;
    private Education education;
    private List<Challenge> challenges;
    private SocialMedia socialMedia;
    private Config config;

    /*private CreateResumeRequest.Skill skills;

    @Getter
    @Setter
    @ToString
    public static class Skill{
        private String name;
        private Byte percentaje;
    }
    */

}
