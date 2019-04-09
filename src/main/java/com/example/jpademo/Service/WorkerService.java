package com.example.jpademo.Service;

import java.util.List;

import com.example.jpademo.domain.Worker;
import com.example.jpademo.repository.workerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class WorkerService {

	@Autowired
	workerRepository workerRepository;

	@Transactional
	public List<Worker> getAllWorkers() {
		return (List<Worker>) workerRepository.findAll();
	}

	@Transactional
	public Worker getById(Integer id) {
		return workerRepository.getOne(id);
	}

	@Transactional
	public void deleteWorker(Integer WorkerId) {
		workerRepository.deleteById(WorkerId);
	}

	@Transactional
	public boolean addWorker(Worker Worker) {
		return workerRepository.save(Worker) != null;
	}

	@Transactional
	public boolean updateWorker(Worker Worker) {
		return workerRepository.save(Worker) != null;
	}
}
