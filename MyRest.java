package com.tap.rest.resource;

import java.util.List;

import com.resouce.Model;
import com.tap.rest.resource.service.MyService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/my")
public class MyRest 
{
	MyService ms=new MyService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Model> getIt()
	{
		return ms.get();
		
	}
}
