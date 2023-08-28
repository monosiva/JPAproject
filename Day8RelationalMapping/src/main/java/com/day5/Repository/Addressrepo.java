package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.Address;

public interface Addressrepo extends JpaRepository<Address, Integer> {

}
