package songdemo.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class AlbumDTO {

    private String albumTitle;
    private String artistName;

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public AlbumDTO(String albumTitle, String artistName) {

        this.albumTitle = albumTitle;
        this.artistName = artistName;
    }
}
