package com.day5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "BusTicketBooking App ",
				version = "1.1.7",
				description = "it is plateform of comfort`	",
				contact = @Contact(
						name = "Mano B",
						email = "727721euee046@skcet.ac.in"
						)
				)
		)
public class BusTicketBookingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketBookingProjectApplication.class, args);
	}

}
