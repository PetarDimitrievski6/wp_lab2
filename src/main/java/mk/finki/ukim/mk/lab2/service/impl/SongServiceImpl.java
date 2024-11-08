package mk.finki.ukim.mk.lab2.service.impl;

import mk.finki.ukim.mk.lab2.model.Artist;
import mk.finki.ukim.mk.lab2.model.Song;
import mk.finki.ukim.mk.lab2.repository.SongRepository;
import mk.finki.ukim.mk.lab2.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId).orElseThrow(RuntimeException::new);
    }
}
