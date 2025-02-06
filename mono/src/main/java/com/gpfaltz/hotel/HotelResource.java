package com.gpfaltz.hotel;

import java.util.List;

import com.gpfaltz.flight.Flight;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hotel")
public class HotelResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Hotel> hotels() {
		return Hotel.listAll();
	}

	@GET
	@Path("findById")
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel findById(@QueryParam("id") long id) {
		return Hotel.findById(id);

	}
	
	@Transactional
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel newHotel(Hotel hotel) {
		hotel.id = null;
		hotel.persist();
		
		return hotel;
	}

	@Transactional
	@DELETE
	@Path("deleteById")
	public void deleteById(@QueryParam("id") long id) {
		
		Hotel hotel = Hotel.findById(id);
		if (hotel != null) {
			hotel.delete();
		}
	}
}
