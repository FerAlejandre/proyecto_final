package com.finalproject.resume.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.DateFormat;

@Getter
@Setter
@ToString
@ApiModel(description = "Request for PostResume operation")

public class Workexperience {

    @ApiModelProperty(value = "title", example = "Intern")
    private String title;
    @ApiModelProperty(value = "company", example = "Agilethought")
    private String company;
    @ApiModelProperty(value = "date from", example = "21-09-2020")
    private String from;
    @ApiModelProperty(value = "date to", example = "18-12-2020")
    private String to;
    @ApiModelProperty(value = "current", example = "true")
    private Boolean current;
    @ApiModelProperty(value = "description", example = "Java Intern")
    private String description;
}
