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

import com.day5.Model.BusModel;
import com.day5.Service.BusService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class BusController {
	@Autowired
    public BusService bserv;
	 
	 @Tag(name = "Get Details",description = "get all details")
	 @PostMapping("/postTicket")
    public String postTicket(@RequestBody BusModel bm) {
   	 bserv.saveTicket(bm);
   	 return "Data Saved Sucessfully";
    }
	 @Tag(name = "Display Details",description = "display all details")
	 @GetMapping("/getTicket")
    public List<BusModel> getTicket(){
   	 return bserv.getTicket();
    }
	 @Tag(name = "Update Details",description = "If you want to update details")
	 @PutMapping("/updateTicket")
    public BusModel updateTicket(@RequestBody BusModel tu) {
   	 return bserv.updateTicket(tu);
    }
	 @Tag(name = "Delete Details",description = "If you want to Delete details by id")
	 @DeleteMapping("/delete/{busid}")
	 	public String deleteds(@PathVariable("busid")int busid) {
	 		bserv.deleteTicket(busid);
	 		return "Data in the  "+busid+"th row is deleted....";
	 	}
	 @Tag(name = "Delete Details",description = "If you want to Delete details by id if present otherwise display msg")
	 @DeleteMapping("/deleteTicketbyid/{busid}")
	 	public ResponseEntity<String> deleteGiftInfo(@PathVariable int busid){
	 		boolean deleted = bserv.deleteTicketbyid(busid);
	 		
	 		if (deleted) {
	 			return ResponseEntity.ok("Data in the " + busid+ "th row is deleted successfully...");
	 		}
	 		
	 		else{
	 			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(busid+ "th row is not found...");
	 		}
	 		
	 	}
	 @Tag(name = "Display Details",description = "If you want to Display details by id if present otherwise display msg")
	 @GetMapping("/users/{bus_id}")
	 	public ResponseEntity<?>getUserId(@PathVariable int bus_id)
	 	{
	 	Optional<BusModel>ticket=bserv.getUserId(bus_id);
	 	if(ticket!=null) {
	 		return ResponseEntity.ok(ticket); 
	 	}
	 	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not available in "+bus_id+"th row");
	 		
	 	}
	 @Tag(name = "Display Details",description = "If you want to Display details by id")
	 	@GetMapping("/getticket")
	 	public List<BusModel> getGiftDetails()
	 	{
	 		return bserv.getDetails();
	 	}
	 @Tag(name = "Sort by ascending ",description = "sort the table by ascending order")
	//Sorting by ascending
     @GetMapping("/sortingasc/{name}")
   public List<BusModel> sortingasc(@PathVariable("name") String name){
    	 return bserv.sortbyasc(name);
     }
	 @Tag(name = "Sort by decending ",description = "sort the table by decending order")
   //Sorting by descending
     @GetMapping("/sortingdsc/{name}")
   public List<BusModel> sortingdsc(@PathVariable("name") String name){
    	 return bserv.sortbydsc(name);
     }
	 @Tag(name = "Pagination",description = "Pagination")
   //Pagination
     @GetMapping("/pagination/{num}/{size}")
     public List<BusModel> pagination(@PathVariable("num")int num,@PathVariable("size")int size){
    	 return bserv.pagination(num, size);
     }
	 @Tag(name = "Pagination And Sort by ascending",description = "Pagination And sort the table by ascending order")
   //Pagination and sort by asc
     @GetMapping("/paginationasc/{num}/{size}/{name}")
     public List<BusModel> paginationandsortasc(@PathVariable("num")int num,@PathVariable("size")int size,@PathVariable("name") String name){
    	 return bserv.paginationandsortingasc(num, size,name);
     }
	 @Tag(name = "Pagination And Sort by decending",description = "Pagination And sort the table by deccending order")
   //Pagination and sort by dsc
     @GetMapping("/paginationdsc/{num}/{size}/{name}")
     public List<BusModel> paginationandsortdsc(@PathVariable("num")int num,@PathVariable("size")int size,@PathVariable("name") String name){
    	 return bserv.paginationandsortingdsc(num, size,name);
     }
	 //Native Query
	//get All rows
		@GetMapping("/getallrows")
		public List<BusModel> getallrows(){
			return bserv.getAllrows();
		}

}
