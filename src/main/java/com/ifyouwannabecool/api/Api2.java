package com.ifyouwannabecool.api;

import com.ifyouwannabecool.domain.persona.Persona;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api2")
public class Api2 {

    @GET
    public Persona get() {

        return new Persona();
    }
}
