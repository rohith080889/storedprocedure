package com.example.practice015.storedprocedure.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Ticket")
@Getter
@Setter
//@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name= "getTickets", procedureName="getTickets"), @NamedStoredProcedureQuery(name="getTicketsByCategory", procedureName="getTicketsByCategory", parameters= { @StoredProcedureParameter(mode= ParameterMode.IN, name="t", type=String.class) } )})

@NamedStoredProcedureQuery(
		name = "getTicketsByCategory", // name of stored procedure in the persistence unit
		procedureName = "getTicketsByCategory", //name of  stored procedure in the database
		parameters = //Parameters of the stored procedure
		{ 
			@StoredProcedureParameter(// A parameter,
					name = "t", //Name of the parameter
					mode = ParameterMode.IN, // Mode of the parameter
					type = String.class) // JDBC Type.		
		}
)
 



public class Ticket implements Serializable {
    
	@Id
	private int id;
	private int amount;
	private String category;
	
	
}
