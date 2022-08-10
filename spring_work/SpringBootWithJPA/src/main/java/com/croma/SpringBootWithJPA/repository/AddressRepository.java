package com.croma.SpringBootWithJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.croma.SpringBootWithJPA.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
