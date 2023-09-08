package com.nexitia.endrika.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private List<Api> db = List.of(new Api("1","Api.jpg"),new Api("2","Api.jpg"),new Api("3","Api.jpg"));

    @GetMapping("/")
    public String hello(){
        return "Hello Endrika";
    }

    @GetMapping("photos")
    public List<Api> get() {
        return db;
    }

}
