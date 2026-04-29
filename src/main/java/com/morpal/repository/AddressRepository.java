package com.morpal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morpal.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
