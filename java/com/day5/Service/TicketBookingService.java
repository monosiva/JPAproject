package com.day5.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.Model.TicketBookingModel;
import com.day5.Repository.TicketBookingRepo;

@Service
public class TicketBookingService {
	 @Autowired
	 public TicketBookingRepo trepo;
	 //post data
	 public String saveTicket(TicketBookingModel t) {
		 trepo.save(t);
		 return "Data saved Successfully";
	 }
	 //Get data
	 public List<TicketBookingModel>getTicket(){
		 return trepo.findAll();
	 }
	 //Update Data
	 public TicketBookingModel updateTicket(TicketBookingModel tb) {
		 return trepo.saveAndFlush(tb);
	 }
	 //delete data
	 public void deleteTicket(int Cusid) {
		 System.out.print("Deleted by Id Successfully");
		 trepo.deleteById(Cusid);
	 }
	 //delete by id
	 public boolean deleteTicketbyid(int cusid) {
			if(trepo.existsById(cusid)) {
				trepo.deleteById(cusid);
				return true;
			}
			return false;
		}
     //get by id
	 public Optional<TicketBookingModel> getUserId(int userId)
	   {
		   Optional<TicketBookingModel>ticket=trepo.findById(userId);
		   if(ticket.isPresent())
		   {
			   return ticket;
		   }
		   return null;
	   }
	 
	public List<TicketBookingModel> getDetails()
	{
		return trepo.findAll();
	}
}
