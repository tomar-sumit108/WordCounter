package com.example.WordCounter.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class WordInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String word;

    public WordInfo(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public WordInfo(String word) {
        super();
        this.word = word;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "WordInfo{" +
                "id=" + this.id +
                ", word='" + this.word + '\'' +
                '}';
    }






}
