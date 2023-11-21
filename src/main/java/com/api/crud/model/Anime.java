package com.api.crud.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAnime;
    private String name;
    private String status;
    private String image;
    private String nameJapanese;

    @Column(length = 1500)
    private String synopsis;

    @OneToMany(mappedBy = "anime")
    private Set<Opening> openings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<Ending> endings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<GenreAnime> genreAnime = new HashSet<>();

    public Anime(String name, String status, String image, String nameJapanese, String synopsis) {
        this.name = name;
        this.status = status;
        this.image = image;
        this.nameJapanese = nameJapanese;
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "idAnime=" + idAnime +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", image='" + image + '\'' +
                ", nameJapanese='" + nameJapanese + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", openings=" + openings +
                ", endings=" + endings +
                ", genres=" + genreAnime +
                '}';
    }
}
