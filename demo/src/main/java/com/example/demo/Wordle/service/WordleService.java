package com.example.demo.Wordle.service;

import com.example.demo.Fiszki.models.FlashcardSet;
import com.example.demo.Wordle.models.WordleGame;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface WordleService {

    ResponseEntity<?> newGame(FlashcardSet flashcardSet, String side, String user);

    List<WordleGame> getAllCurrentGames();

    ResponseEntity<?> getGivenGame(String gameID);

    ResponseEntity<?> makeGuess(Map<String, String> jsonWithIDandGuess) throws Exception;

}