package mk.finki.ukim.mk.lab2.repository;

import mk.finki.ukim.mk.lab2.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab2.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    public List<Artist> findAll() {
        return DataHolder.artists;
    }

    public Optional<Artist> findById(Long id) {
        return DataHolder.artists
                .stream()
                .filter(artist -> artist.getId().equals(id))
                .findFirst();
    }
}
