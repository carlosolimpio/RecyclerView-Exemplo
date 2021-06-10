package com.olimpio.study.exemplo1;

public class Hello {
    private final String text;
    private final int id;

    public Hello(String text, int id) {
        this.text = text;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hello! " + text + ", " + id;
    }
}
