package com.day5.Controller;

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

import com.day5.Model.TicketBookingModel;
import com.day5.Service.TicketBookingService;

@RestController
public class TicketBookingController {
     @Autowired
     public TicketBookingService tserv;
     @PostMapping("/postTicket")
     public String postTicket(@RequestBody TicketBookingModel tm) {
    	 tserv.saveTicket(tm);
    	 return "Data Saved Sucessfully";
     }
     @GetMapping("/getTicket")
     public List<TicketBookingModel> getTicket(){
    	 return tserv.getTicket();
     }
     @PutMapping("/updateTicket")
     public TicketBookingModel updateTicket(@RequestBody TicketBookingModel tu) {
    	 return tserv.updateTicket(tu);
     }
     @DeleteMapping("/delete/{cusid}")
 	public String deleteds(@PathVariable("cusid")int cusid) {
 		tserv.deleteTicket(cusid);
 		return "Data in the  "+cusid+"th row is deleted....";
 	}
     @DeleteMapping("/deleteTicketbyid/{cusid}")
 	public ResponseEntity<String> deleteGiftInfo(@PathVariable int cusid){
 		boolean deleted = tserv.deleteTicketbyid(cusid);
 		
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
 	Optional<TicketBookingModel>ticket=tserv.getUserId(userId);
 	if(ticket!=null) {
 		return ResponseEntity.ok(ticket); 
 	}
 	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not available in "+userId+"th row");
 		
 	}
 	@GetMapping("/getticket")
 	public List<TicketBookingModel> getGiftDetails()
 	{
 		return tserv.getDetails();
 	}
 }
     
