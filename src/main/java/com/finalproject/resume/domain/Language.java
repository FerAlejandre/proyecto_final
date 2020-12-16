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

public class Language {

    @ApiModelProperty(value = "Language name", example = "English")
    private String name;
    @ApiModelProperty(value = "Skill percentage", example = "80%")
    private Byte percentage;
}
