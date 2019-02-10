package com.MathieuSIO.siteTpWeb.ressources;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Categories")
public class CategoriesResource {
    @Autowired
    private CategoriesRepository CategoriesRepository;
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Categories createCategories(Categories A) {
        return CategoriesRepository.save(A);
    }
}