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

public class Education {

    @ApiModelProperty(value = "school name", example = "IPN")
    private String name;
    @ApiModelProperty(value = "carreer", example = "Computer engineering")
    private String career;
    @ApiModelProperty(value = "date from", example = "2016")
    private String from;
    @ApiModelProperty(value = "date to", example = "2020")
    private String to;
    @ApiModelProperty(value = "degree", example = "Bachelor")
    private String degree;

}
