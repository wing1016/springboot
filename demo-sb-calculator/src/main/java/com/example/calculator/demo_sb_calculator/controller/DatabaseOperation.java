package com.example.calculator.demo_sb_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface DatabaseOperation {

    // Read Operation
    @GetMapping(value = "/database/string/{index}")
    String getString(@PathVariable int index);

    //Write Operation (Create new resource)
    @PostMapping(value = "/database/string/{newString}")
    String addString(@PathVariable String newString);
    

    @GetMapping(value = "/database/string/list")
    String getStringList();

    @GetMapping(value = "/database/string/size")
    int getSize();

    //sir version
}  