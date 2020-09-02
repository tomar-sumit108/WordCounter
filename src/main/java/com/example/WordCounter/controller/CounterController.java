package com.example.WordCounter.controller;

import com.example.WordCounter.services.CounterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CounterController {

    @Autowired
    CounterServiceImpl counterService;

    @GetMapping("word/{word}")
    public int getCount(@PathVariable String word) {
        return counterService.getWordCount(word);
    }

    @PutMapping("word/{word}")
    public void putWord(@PathVariable String word) {
        counterService.putWord(word);
    }

//    @GetMapping("/")
//    public void createTable() {
//        counterService.createTable();
//    }

}
