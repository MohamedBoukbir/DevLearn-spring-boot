package com.devlearn.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TestController {
    @GetMapping("/test")
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public List<String> test(){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        return list;
    }
}
