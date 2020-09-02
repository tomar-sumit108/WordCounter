package com.example.WordCounter.services;

import com.example.WordCounter.models.WordInfo;

public interface CounterService {
    public int getWordCount(String word);
    public void putWord(String word);
}
