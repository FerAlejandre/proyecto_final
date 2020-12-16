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

public class Challenge {

    private String name;
    private String date;
    private String description;
    private String url;
}
