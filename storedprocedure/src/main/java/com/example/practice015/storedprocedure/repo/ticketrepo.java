package com.example.practice015.storedprocedure.repo;


import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.practice015.storedprocedure.model.Ticket;

public interface ticketrepo extends CrudRepository<Ticket, Integer> {
	
	
	
	@Procedure(name="getTicketsByCategory")
	public <List>Ticket getTicketsByCategory(@Param("t") String t);
	

}
