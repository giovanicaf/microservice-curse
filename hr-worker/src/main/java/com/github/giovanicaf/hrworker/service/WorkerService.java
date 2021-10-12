package com.github.giovanicaf.hrworker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.giovanicaf.hrworker.entities.Worker;
import com.github.giovanicaf.hrworker.entities.dto.WorkerDto;
import com.github.giovanicaf.hrworker.mapper.WorkerMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WorkerService {

	private final WorkerMapper workertMapper;
	
	public List<WorkerDto> findByWorker(List<Worker> worker) {
		return workertMapper.toListWorkerDto(worker);
	}

	public WorkerDto findByWorker(Worker worker) {
		return workertMapper.toWorkerDto(worker);
	}



}
