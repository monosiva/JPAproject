package com.day5.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day5.Model.BusModel;
import com.day5.Repository.Busrepo;




@Service
public class BusService {
	 @Autowired
	 public Busrepo brepo;
	//post data
		 public String saveTicket(BusModel b) {
			 brepo.save(b);
			 return "Data saved Successfully";
		 }
	//Get data
		 public List<BusModel>getTicket(){
			 return brepo.findAll();
		 }
	//Update Data
		 public BusModel updateTicket(BusModel tb) {
			 return brepo.saveAndFlush(tb);
		 }
	//delete data
		 public void deleteTicket(int bus_id) {
			 System.out.print("Deleted by Id Successfully");
			 brepo.deleteById(bus_id);
		 }
	 //delete by id
		 public boolean deleteTicketbyid(int bus_id) {
				if(brepo.existsById(bus_id)) {
					brepo.deleteById(bus_id);
					return true;
				}
				return false;
			}
		 //get by id
		 public Optional<BusModel> getUserId(int bus_id)
		   {
			   Optional<BusModel>ticket=brepo.findById(bus_id);
			   if(ticket.isPresent())
			   {
				   return ticket;
			   }
			   return null;
		   }
		 
		public List<BusModel> getDetails()
		{
			return brepo.findAll();
		}
		 //Sorting by ascending 
		 public List<BusModel> sortbyasc(String name){
			 return brepo.findAll(Sort.by(name).ascending());
		 }
		//Sorting by descending 
			 public List<BusModel> sortbydsc(String name){
				 return brepo.findAll(Sort.by(name).descending());
			 }
		//Pagination
			 public List<BusModel> pagination(int pageNu,int pagesize){
				 Page<BusModel> cont=brepo.findAll(PageRequest.of(pageNu, pagesize));
				 return cont.getContent();
			 }
		//pagination and sorting asc
			 public List<BusModel>paginationandsortingasc(int pagNu,int pagesize,String name)

				{

					Page<BusModel> cont=brepo.findAll(PageRequest.of(pagNu, pagesize,Sort.by(name).ascending()));

					return cont.getContent();

				}

			//pagination and sorting dsc
			 public List<BusModel>paginationandsortingdsc(int pagNu,int pagesize,String name)

				{

					Page<BusModel> cont=brepo.findAll(PageRequest.of(pagNu, pagesize,Sort.by(name).ascending()));

					return cont.getContent();

				}
			 
	        //Native Query
			 //get all rows
			 public List<BusModel> getAllrows(){
				 return brepo.getAllRows();
			 }
}
