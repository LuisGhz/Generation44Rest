package com.rest.services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/webapp")
public class RestApp {
	
	@GET
	public String msgGet()
	{
		return "This is GET";
	}
	
	@POST
	public String msgPost()
	{
		return "This is POST";
	}

	@PUT
	public String msgPut()
	{
		return "This is PUT";
	}
	
	@DELETE
	public String msgDelete()
	{
		return "This is DELETE";
	}
	
	@HEAD
	public String msgHead()
	{
		return "This is HEAD";
	}
	
	@OPTIONS
	public String msgOptions()
	{
		return "This is OPTIONS";
	}
	
	@GET
	@Path("/{p}")
	//						@QueryParam("nombre") = url:?nombre=luis
	public String msgName(@PathParam("p") String nombre)
	{
		return "This is " + nombre;
	}
	
	@GET
	@Path("/suma/{p}/{p2}")
	//						@QueryParam("nombre") = url:?nombre=luis
	public double msgSum(@PathParam("p") double p, @PathParam("p2") double p2)
	{
		return p + p2;
	}
	
	@GET
	@Path("/json/{p1}/{p2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String msgJson(@PathParam("p") double p, @PathParam("p2") double p2)
	{
		String myJson = "{";
		
		myJson += "\"Resta\" : " + (p - p2);
		
		myJson += "}";
		
		return myJson;
	}
	
}
