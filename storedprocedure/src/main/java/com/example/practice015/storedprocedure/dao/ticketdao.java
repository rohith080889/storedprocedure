package com.example.practice015.storedprocedure.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.practice015.storedprocedure.model.Ticket;

@Repository
public class ticketdao {
	
	@Autowired
	public EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketinfo(){
		
		return em.createStoredProcedureQuery("getTickets").getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
    public List<Ticket> getTicketinfo2(String input){
    	
    	System.out.println("Came here 1"+input);
		
		return em.createStoredProcedureQuery("getTicketsByCategory").setParameter("t", input).getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketinfo3(){
		
		return em.createStoredProcedureQuery("mixed").getResultList();
		
	}
	
	

}
