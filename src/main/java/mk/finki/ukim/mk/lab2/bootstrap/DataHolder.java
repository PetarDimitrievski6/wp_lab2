package mk.finki.ukim.mk.lab2.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab2.model.Artist;
import mk.finki.ukim.mk.lab2.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artists = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();

    @PostConstruct
    public void init() {
        Artist tupac = new Artist("Tupac", "Shakur", "An influential rapper known for his powerful lyrics on social issues.");
        Artist biggie = new Artist("Christopher", "Wallace", "Known as The Notorious B.I.G., a central figure in East Coast hip-hop.");
        Artist dre = new Artist("Andre", "Young", "Known as Dr. Dre, a rapper and producer who helped popularize West Coast rap.");
        Artist snoop = new Artist("Calvin", "Broadus", "Known as Snoop Dogg, a laid-back West Coast rapper with iconic hits.");
        Artist iceCube = new Artist("O'Shea", "Jackson", "Known as Ice Cube, a rapper, actor, and founding member of N.W.A.");
        artists.add(tupac);
        artists.add(biggie);
        artists.add(dre);
        artists.add(snoop);
        artists.add(iceCube);

        songs.add(new Song("California Love", "Hip-Hop", 1995, new ArrayList<>()));
        songs.add(new Song("Juicy", "Hip-Hop", 1994, new ArrayList<>()));
        songs.add(new Song("Nuthin' But a G Thang", "Hip-Hop", 1992, new ArrayList<>()));
        songs.add(new Song("It Was a Good Day", "Hip-Hop", 1992, new ArrayList<>()));
        songs.add(new Song("Hit 'Em Up", "Hip-Hop", 1996, new ArrayList<>()));
    }
}
