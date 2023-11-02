package com.example.lab6.BAI3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    private String text;
    private TextWriter writer;

    @Autowired
    public TextEditor(@Qualifier("plainTextWriter") TextWriter writer)
    {
        this.writer = writer;
    }

    public void input(String text)
    {
        this.text = text;
    }

    public void save()
    {
        writer.write("result_Ex3_Lab6.txt", this.text);
    }


}