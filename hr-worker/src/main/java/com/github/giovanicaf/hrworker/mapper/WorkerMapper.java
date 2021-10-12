package com.github.giovanicaf.hrworker.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.github.giovanicaf.hrworker.entities.Worker;
import com.github.giovanicaf.hrworker.entities.dto.WorkerDto;

@Mapper(componentModel = "spring")
public interface WorkerMapper {
  
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "dailyIncome", target = "dailyIncome")

    WorkerDto toWorkerDto(Worker worker);

    List<WorkerDto> toListWorkerDto(List<Worker> worker);


}