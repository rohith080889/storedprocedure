package com.example.practice015.storedprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice015.storedprocedure.dao.ticketdao;
import com.example.practice015.storedprocedure.model.Ticket;
import com.example.practice015.storedprocedure.repo.ticketrepo;

@RestController
public class ticketcontroller {

	@Autowired
	private ticketdao dao;
	
	@Autowired
	private ticketrepo repo;
	
	@GetMapping("/tickets")
	public List<Ticket> findTickets(){
		
		return dao.getTicketinfo();
		
	//	return (List<Ticket>) repo.getTickets();
	
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/tickets/{category}")
	public List<Ticket> findTicketsByCatgeory (@PathVariable String category)
	{
		//return (List<Ticket>) repo.getTicketsByCategory(category);
		
		return (List<Ticket>) dao.getTicketinfo2(category);
		
	}
	
	@RequestMapping("/random")
	@ResponseBody
	public int senrandom() {
		
		return 20;
	}
	
	@GetMapping("/tickets2")
	public List<Ticket> findTickets2(){
		
		return dao.getTicketinfo3();
		
	//	return (List<Ticket>) repo.getTickets();
	
	}
	
	
	
}
