package com.finalproject.resume.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(description = "Request for PostResume operation")
public class SocialMedia {

    private String facebook;
    private String instagram;
    private String snapchat;
    private String pinterest;
    private String twitter;
    private String linkedin;

}
