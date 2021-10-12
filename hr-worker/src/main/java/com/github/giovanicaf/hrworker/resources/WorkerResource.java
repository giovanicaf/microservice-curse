package com.github.giovanicaf.hrworker.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.giovanicaf.hrworker.entities.dto.WorkerDto;
import com.github.giovanicaf.hrworker.repositories.WorkerRepository;
import com.github.giovanicaf.hrworker.service.WorkerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/workers")
public class WorkerResource {

	public final WorkerRepository repository;
	public final WorkerService service;

	@GetMapping
	public ResponseEntity<List<WorkerDto>> findAll(){		
		
		List<WorkerDto> lista = service.findByWorker( repository.findAll() );
		return ResponseEntity.ok(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkerDto> findById(@PathVariable Long id){

		WorkerDto dto = service.findByWorker( repository.findById(id).get() );
		return ResponseEntity.ok( dto );
	}
}
