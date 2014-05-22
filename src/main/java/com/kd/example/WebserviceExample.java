/**
 * 
 */
package com.kd.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author kuldeep.singh
 *
 */
@Path("/hello")
public class WebserviceExample {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();
 
	}
}
