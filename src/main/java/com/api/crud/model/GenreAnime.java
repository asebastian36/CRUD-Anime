package com.api.crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class GenreAnime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGenreAnime;

    @ManyToOne()
    @JoinColumn(name = "idAnime")
    Anime anime;

    @ManyToOne()
    @JoinColumn(name = "idGenre")
    Genre genre;

    public GenreAnime(Anime anime, Genre genre) {
        this.anime = anime;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "GenreAnime{" +
                "idGenreAnime=" + idGenreAnime +
                ", anime=" + anime +
                ", genre=" + genre +
                '}';
    }
}
