package com.api.crud.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "anime", fetch = FetchType.LAZY)
    private Set<Opening> openings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<Ending> endings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<Genre> genres = new HashSet<>();

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
                ", genres=" + genres +
                '}';
    }
}
