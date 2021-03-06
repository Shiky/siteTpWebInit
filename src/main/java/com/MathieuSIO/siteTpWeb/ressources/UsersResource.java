package com.MathieuSIO.siteTpWeb.ressources;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Users")
public class UsersResource {
    @Autowired
    private UsersRepository UsersRepository;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Users createUsers(Users A) {
        return UsersRepository.save(A);
    }
}
