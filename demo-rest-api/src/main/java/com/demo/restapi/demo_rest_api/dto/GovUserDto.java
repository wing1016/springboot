package com.demo.restapi.demo_rest_api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GovUserDto {  
    private String name;
    private String email;


}
