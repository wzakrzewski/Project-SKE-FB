package com.example.demo.Fiszki.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class PutFlashcard {

    @Schema(description = "id",example = "1")
    private int id;
    @Schema(description = "front",example = "kotek")
    private String front;
    @Schema(description = "back",example = "kitty")
    private String back;

    public PutFlashcard(int id, String front, String back) {
        this.id = id;
        this.front = front;
        this.back = back;
    }

    public PutFlashcard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }
}
