package csc480.rest;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {

}