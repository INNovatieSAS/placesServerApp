package com.innovatie.placeandroidapp.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.innoviatie.placeandroidapp.ws.rest.bean.User;


@Path("/webservice")
public class WebController {
	
	@POST
    @Path("/json/user/")
    @Consumes("application/json")
    @Produces("application/json")
    public User userJSON(User user){
        System.out.println("User:" + user.getUsername() + " mail: " + user.getMail() + " password: " + user.getPassword());
		return user;
    }
	
	@GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
        return "Hello World!!! dineshonjava";    
    }
	
	@POST
    @Path("/plain/user/")
    @Produces("application/json")
    public User userPlain(@FormParam("mail") String mail, @FormParam("username") String username, @FormParam("password") String password){
		System.out.println("1. mail:" + mail);
		System.out.println("+++++username: " + username);
		System.out.println("-----password: " + password);

		User user = new User();
		user.setMail("mail");
		user.setPassword("pass");
		user.setUsername("user");
		return user;
    }
}
