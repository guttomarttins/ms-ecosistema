package com.cams.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cams.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
