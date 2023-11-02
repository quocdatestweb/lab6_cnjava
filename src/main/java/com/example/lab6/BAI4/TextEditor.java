package com.example.lab6.BAI4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private String text;
    private TextWriter writer;

    @Autowired
    public TextEditor(@Qualifier("plainTextWriter") TextWriter writer) {
        this.writer = writer;
    }
    public void save() {
        writer.write("result_Ex4_Lab6.txt", this.text);
    }

    public void input(String text) {
        this.text = text;
    }
}
