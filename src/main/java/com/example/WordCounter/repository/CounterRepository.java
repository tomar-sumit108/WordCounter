package com.example.WordCounter.repository;

import com.example.WordCounter.models.WordInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CounterRepository extends JpaRepository<WordInfo, Integer> {
//    public static final String GET_BOOK_COUNT = "SELECT t.count FROM WordInfo t WHERE t.word = :word ";
//
//    @Query(value = GET_BOOK_COUNT, nativeQuery = true)
//    public int getCount(@Param("word") String word);

    int countByWord(String word);
}
