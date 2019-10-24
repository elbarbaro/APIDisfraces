package com.barbaro.apidisfraces.config;

import com.barbaro.apidisfraces.resources.ArticuloResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class ApiConfig extends Application{

    /*@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(com.barbaro.apidisfraces.resources.ArticuloResource.class);
        return resources;
    }*/    
}
