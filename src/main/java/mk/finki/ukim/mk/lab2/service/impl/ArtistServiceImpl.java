package mk.finki.ukim.mk.lab2.service.impl;

import mk.finki.ukim.mk.lab2.model.Artist;
import mk.finki.ukim.mk.lab2.repository.ArtistRepository;
import mk.finki.ukim.mk.lab2.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist artistFindById(Long id) {
        return artistRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
