package mk.finki.ukim.mk.lab2.repository;

import mk.finki.ukim.mk.lab2.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab2.model.Artist;
import mk.finki.ukim.mk.lab2.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository {
    public List<Song> findAll(){
        return DataHolder.songs;
    }
    public Optional<Song> findByTrackId(String trackId){
        return DataHolder.songs
                .stream()
                .filter(song -> song.getTrackId().equals(trackId))
                .findFirst();
    }
    public Artist addArtistToSong(Artist artist, Song song){
        song.getPerformers().removeIf(artist1 -> artist1.getId().equals(artist.getId()));
        song.getPerformers().add(artist);
        return artist;
    }
}
