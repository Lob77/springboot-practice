package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteContoller {

    //http://localhost:8080/api/v1/delete-api/{String 값}
    @DeleteMapping(value ="/{varible}")
    public String DeleteVariable(@PathVariable String variable){
        return variable;
    }

    //http://localhost:8080/api/v1/delete-api/request1?email=value
    @DeleteMapping(value ="/request1")
    public String getRequestParam1(@RequestParam String email){
        return "e-mail : " + email;
    }
}
