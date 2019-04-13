package com.cristianroot.example.repositories;

import com.cristianroot.example.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
