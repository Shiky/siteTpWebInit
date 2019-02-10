package com.MathieuSIO.siteTpWeb.config;

import com.MathieuSIO.siteTpWeb.ressources.CategoriesResource;
import com.MathieuSIO.siteTpWeb.ressources.SiteTPWebresource;
import com.MathieuSIO.siteTpWeb.ressources.AnnouncesResource;
import com.MathieuSIO.siteTpWeb.ressources.UsersResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("api")
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration(){
        register(SiteTPWebresource.class);
       register(CategoriesResource.class);
       register(UsersResource.class);
        register(AnnouncesResource.class);

    }


}