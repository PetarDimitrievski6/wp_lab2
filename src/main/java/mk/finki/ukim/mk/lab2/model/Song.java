package mk.finki.ukim.mk.lab2.model;

import lombok.Data;

import java.util.List;

@Data
public class Song {
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers;

    public Song(String title, String genre, int releaseYear, List<Artist> performers) {
        this.trackId =  String.valueOf(Math.random() * 1000);
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers;
    }
}
