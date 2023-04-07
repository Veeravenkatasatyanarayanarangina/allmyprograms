package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Task;

@Repository
public interface TasksRepository extends JpaRepository<Task, Long>{
	
}
