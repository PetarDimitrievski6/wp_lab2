package mk.finki.ukim.mk.lab2.service;

import mk.finki.ukim.mk.lab2.model.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> listArtists();
    Artist artistFindById(Long id);
}
