package com.gymApp.mongoDbExperiment.Application.Repositories;

import com.gymApp.mongoDbExperiment.Application.models.TrainingRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@RepositoryRestResource(collectionResourceRel = "records", path = "records")
public interface  TrainingRecordRepository  extends MongoRepository<TrainingRecord, String> {

     List<TrainingRecord> findByDate(@Param("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date );




}
