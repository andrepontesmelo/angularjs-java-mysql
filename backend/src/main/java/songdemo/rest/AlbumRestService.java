package songdemo.rest;

import songdemo.dto.AlbumSearchDTO;
import songdemo.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/album")
public class AlbumRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AlbumSearchDTO getDefaultUserInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }
}
