package com.example.consumingrest.temp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueClass {

    private Long id;
    private String quote;

    public ValueClass() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"quote\": '" + quote + '\'' +
                '}';
    }
}