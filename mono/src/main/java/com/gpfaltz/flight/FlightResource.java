package com.gpfaltz.flight;

import java.util.List;

import com.gpfaltz.travelorder.TravelOrder;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("flight")
public class FlightResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> flights() {
		return Flight.listAll();
	}

	@GET
	@Path("findById")
	@Produces(MediaType.APPLICATION_JSON)
	public Flight findById(@QueryParam("id") long id) {
		return Flight.findById(id);

	}
	
	@Transactional
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Flight newFlight(Flight flight) {
		flight.id = null;
		flight.persist();
		
		return flight;
	}
		
	@Transactional
	@DELETE
	@Path("deleteById")
	public void deleteById(@QueryParam("id") long id) {
		
		Flight flight = Flight.findById(id);
		if (flight != null) {
			flight.delete();
		}
	}
}
