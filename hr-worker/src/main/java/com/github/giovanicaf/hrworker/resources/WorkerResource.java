package com.github.giovanicaf.hrworker.resources;

import com.github.giovanicaf.hrworker.entities.dto.WorkerDto;
import com.github.giovanicaf.hrworker.repositories.WorkerRepository;
import com.github.giovanicaf.hrworker.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/workers")
public class WorkerResource {

	private static Logger logger = LoggerFactory.getLogger( WorkerResource.class );

	public final Environment env;
	public final WorkerRepository repository;
	public final WorkerService service;

	@GetMapping
	public ResponseEntity<List<WorkerDto>> findAll(){		
		
		List<WorkerDto> lista = service.findByWorker( repository.findAll() );
		return ResponseEntity.ok(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkerDto> findById(@PathVariable Long id){

//        try {
//            Thread.sleep(3000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        logger.info( "PORT = " + env.getProperty("local.server.port") );

		WorkerDto dto = service.findByWorker( repository.findById(id).get() );
		return ResponseEntity.ok( dto );
	}
}
