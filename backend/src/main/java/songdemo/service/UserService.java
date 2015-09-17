package songdemo.service;

import songdemo.dto.AlbumSearchDTO;

public class UserService {

    public AlbumSearchDTO getDefaultUser() {
            return new AlbumSearchDTO();
    }
}
