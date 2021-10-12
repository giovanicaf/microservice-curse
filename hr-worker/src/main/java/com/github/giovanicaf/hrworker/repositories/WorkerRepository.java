package com.github.giovanicaf.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.giovanicaf.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	

}
