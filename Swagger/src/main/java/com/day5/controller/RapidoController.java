package com.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.Model.RapidoModel;
import com.day5.Service.RapidoService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class RapidoController {
	 @Autowired
     public RapidoService rserv;
	 
	 @Tag(name = "Get User Details",description = "get user deatails")
	 @PostMapping("/postTicket")
     public String postTicket(@RequestBody RapidoModel tm) {
    	 rserv.saveTicket(tm);
    	 return "Data Saved Sucessfully";
     }
	 @GetMapping("/getTicket")
     public List<RapidoModel> getTicket(){
    	 return rserv.getTicket();
     }
	 @PutMapping("/updateTicket")
     public RapidoModel updateTicket(@RequestBody RapidoModel tu) {
    	 return rserv.updateTicket(tu);
     }
	 @DeleteMapping("/delete/{cusid}")
	 	public String deleteds(@PathVariable("cusid")int cusid) {
	 		rserv.deleteTicket(cusid);
	 		return "Data in the  "+cusid+"th row is deleted....";
	 	}
	 @DeleteMapping("/deleteTicketbyid/{cusid}")
	 	public ResponseEntity<String> deleteGiftInfo(@PathVariable int cusid){
	 		boolean deleted = rserv.deleteTicketbyid(cusid);
	 		
	 		if (deleted) {
	 			return ResponseEntity.ok("Data in the " + cusid+ "th row is deleted successfully...");
	 		}
	 		
	 		else{
	 			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cusid+ "th row is not found...");
	 		}
	 		
	 	}
	 @GetMapping("/users/{userId}")
	 	public ResponseEntity<?>getUserId(@PathVariable int userId)
	 	{
	 	Optional<RapidoModel>ticket=rserv.getUserId(userId);
	 	if(ticket!=null) {
	 		return ResponseEntity.ok(ticket); 
	 	}
	 	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not available in "+userId+"th row");
	 		
	 	}
	 	@GetMapping("/getticket")
	 	public List<RapidoModel> getGiftDetails()
	 	{
	 		return rserv.getDetails();
	 	}

}
