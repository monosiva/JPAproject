package com.day5.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day5.Model.BusModel;

public interface Busrepo extends JpaRepository<BusModel, Integer>{
         //Native Query
	@Query(value="SELECT * FROM bookingticket.tbl_bus",nativeQuery = true)
		public List<BusModel> getAllRows();
}
