package com.example.orm_exercise.repositories;

import com.example.orm_exercise.models.Address;
import com.example.orm_exercise.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}