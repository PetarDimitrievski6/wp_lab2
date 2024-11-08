package mk.finki.ukim.mk.lab2.service;

import mk.finki.ukim.mk.lab2.model.Artist;
import mk.finki.ukim.mk.lab2.model.Song;

import java.util.List;

public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    public Song findByTrackId(String trackId);
}
