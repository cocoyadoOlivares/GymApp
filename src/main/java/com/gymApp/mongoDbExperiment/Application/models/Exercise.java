package com.gymApp.mongoDbExperiment.Application.models;


import lombok.Data;

@Data
public class Exercise {

    private String id;
    private String name;
    private String description;
    private int reps;
    private double weight;
}
