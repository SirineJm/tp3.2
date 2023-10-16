package com.example.recyclerview.model;

import javax.sql.DataSource;

public class Word {

    private String mWord;

    public Word(String word){
        this.mWord = word;
    }

    public void setWord(String word) {
        this.mWord = word;
    }

    public String getWord() {
        return mWord;
    }
}
