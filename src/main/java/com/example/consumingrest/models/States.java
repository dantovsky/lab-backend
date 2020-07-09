/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumingrest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;

import java.util.List;

/**
 *
 * @author HParaense
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private Long time;
    private List<List<Object>> states;

    public States() {}

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<List<Object>> getStates() {
        return states;
    }

    public void setStates(List<List<Object>> states) {
        this.states = states;
    }

  }
