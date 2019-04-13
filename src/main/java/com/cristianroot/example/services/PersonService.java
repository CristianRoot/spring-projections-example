package com.cristianroot.example.services;

import com.cristianroot.example.entities.Person;
import com.cristianroot.example.repositories.PersonRepository;
import com.cristianroot.projections.Projection;
import com.cristianroot.projections.Projector;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Projection<Person>> findAll(List<String> projectionRequest) {
		return personRepository.findAll()
							   .stream()
							   .map(person -> Projector.project(person, projectionRequest))
							   .collect(Collectors.toList());
	}

}
