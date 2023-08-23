package com.day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.Model.TicketBookingModel;

public interface TicketBookingRepo extends JpaRepository<TicketBookingModel, Integer> {

}
