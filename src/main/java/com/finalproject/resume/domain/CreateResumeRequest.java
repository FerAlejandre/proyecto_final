package com.finalproject.resume.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@ToString
@ApiModel(description = "Request for PostResume operation")
public class CreateResumeRequest {

    @ApiModelProperty(value = "Resume firstName", example = "Fernando Jesus")
    private String firstName;
    @ApiModelProperty(value = "Resume lastName", example = "Alejandre Ojeda")
    private String lastName;
    @ApiModelProperty(value = "Resume job", example = "BigData Intern")
    private String job;
    @ApiModelProperty(value = "Resume city", example = "Ciudad de Mexico")
    private String city;
    @ApiModelProperty(value = "Resume country", example = "Mexico")
    private String country;
    @ApiModelProperty(value = "Resume email", example = "falejandre11@hotmail.com")
    private String email;
    @ApiModelProperty(value = "Resume phoneNumber", example = "1234567890")
    private String phoneNumber;

    private List<Skill> skills;
    private List<Language> languages;
    private List<Workexperience> workexperiences;
    private Education education;
    private List<Challenge> challenges;
    private SocialMedia socialMedia;
    private Config config;


}
