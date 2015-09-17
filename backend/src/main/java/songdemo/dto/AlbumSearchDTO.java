package songdemo.dto;

import songdemo.service.MySQLAccess;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.*;
import java.util.Vector;

@XmlRootElement
public class AlbumSearchDTO {

    private Vector<AlbumDTO> albums;

    public AlbumSearchDTO()
    {
        try {
            this.albums = getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Vector<AlbumDTO> getAll() throws SQLException {
        Vector<AlbumDTO> resultItems = new Vector<>();

        Connection connection = MySQLAccess.getInstance().getConnection();

        if (connection == null)
            return null;

        Statement s = connection.createStatement();

        ResultSet result = s.executeQuery("select m.title, t.name from album m " +
                "join albumartist v on v.album = m.id " +
                "join artist t on v.artist=t.id ");

        while (result.next()) {
            AlbumDTO newAlbum = new AlbumDTO(result.getString(1), result.getString(2));
            resultItems.add(newAlbum);
        }

        s.close();
        connection.close();

        return resultItems;
    }

    public Vector<AlbumDTO> getAlbums() {
        return albums;
    }

    public void setAlbums(Vector<AlbumDTO> albums) {
        this.albums = albums;
    }
}
