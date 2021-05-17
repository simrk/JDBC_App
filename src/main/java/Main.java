import model.Artist;
import model.Datasource;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Datasource datasource = new Datasource();
        if(!datasource.open())
        {
            System.out.println("Can't open database");
            return;
        }

        List<Artist> artists = datasource.getArtists(Datasource.ORDER_BY.ASC);
        if(artists == null)
        {
            System.out.println("No artists.");
            return;
        }
        for(Artist artist: artists)
        {
            System.out.println("ID = "+ artist.getId() + ", Name = "+ artist.getName());
        }
        datasource.close();

    }
}
