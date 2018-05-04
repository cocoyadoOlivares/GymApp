package com.gymApp.mongoDbExperiment.Application.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class TrainingRecord {


    @Id
    private String id;
    private LocalDate date;
    private List<Exercise> exercisesList;
    private String userName;



}
