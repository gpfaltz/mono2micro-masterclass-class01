package com.gpfaltz.travelorder;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("travelorder")
public class TravelOrderResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TravelOrder> travelorders() {
		return TravelOrder.listAll();
	}

	@GET
	@Path("findById")
	public TravelOrder findById(@QueryParam("id") long id) {
		return TravelOrder.findById(id);
	}

	@Transactional
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TravelOrder newTravelOrder(TravelOrder travelOrder) {
		travelOrder.id = null;
		travelOrder.persist();

		return travelOrder;
	}

	@Transactional
	@DELETE
	@Path("deleteById")
	public void deleteById(@QueryParam("id") long id) {
		
		TravelOrder travelOrder = TravelOrder.findById(id);
		if (travelOrder != null) {
			travelOrder.delete();
		}
	}
}
