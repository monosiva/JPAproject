package com.day5.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.Model.RapidoModel;
import com.day5.Repository.Rapidorepo;


@Service
public class RapidoService {
	 @Autowired
	 public Rapidorepo rrepo;
	//post data
		 public String saveTicket(RapidoModel r) {
			 rrepo.save(r);
			 return "Data saved Successfully";
		 }
	//Get data
		 public List<RapidoModel>getTicket(){
			 return rrepo.findAll();
		 }
	//Update Data
		 public RapidoModel updateTicket(RapidoModel tb) {
			 return rrepo.saveAndFlush(tb);
		 }
	//delete data
		 public void deleteTicket(int Cusid) {
			 System.out.print("Deleted by Id Successfully");
			 rrepo.deleteById(Cusid);
		 }
	 //delete by id
		 public boolean deleteTicketbyid(int cusid) {
				if(rrepo.existsById(cusid)) {
					rrepo.deleteById(cusid);
					return true;
				}
				return false;
			}
		 //get by id
		 public Optional<RapidoModel> getUserId(int userId)
		   {
			   Optional<RapidoModel>ticket=rrepo.findById(userId);
			   if(ticket.isPresent())
			   {
				   return ticket;
			   }
			   return null;
		   }
		 
		public List<RapidoModel> getDetails()
		{
			return rrepo.findAll();
		}
}
