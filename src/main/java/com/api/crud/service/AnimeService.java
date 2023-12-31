package com.api.crud.service;

import com.api.crud.model.Anime;
import com.api.crud.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository repositorio;

    public void update(Anime anime) {
        System.out.println(anime.getIdAnime());
        repositorio.save(anime);
    }

    public List<Anime> getAll() {
        return repositorio.findAll();
    }

    public void add(Anime anime) {
        repositorio.save(anime);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public List<Anime> getAnimesById(Long id) {
        return repositorio.findById(id).stream().toList();
    }

    public Anime getAnimeById(Long id) {
        List<Anime> animes = repositorio.findById(id).stream().toList();
        return animes.get(0);
    }

    public List<Anime> findByName(String name) {
        String newName = "%" + name + "%";
        return repositorio.findByName(newName);
    }

    private boolean validation(Anime anime) {
        return repositorio.existsById(anime.getIdAnime());
    }
}
