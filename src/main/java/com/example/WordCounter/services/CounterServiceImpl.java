package com.example.WordCounter.services;

import com.example.WordCounter.models.WordInfo;
import com.example.WordCounter.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {

    @Autowired
    CounterRepository counterRepository;

    public int getWordCount(String word) {
        return counterRepository.countByWord(word);
    }

    public void putWord(String word) {
        counterRepository.save(new WordInfo(word));
    }

//    public void createTable() {
//        counterRepository.createTable()
//    }



}
