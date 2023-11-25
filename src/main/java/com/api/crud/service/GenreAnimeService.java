package com.api.crud.service;

import com.api.crud.model.*;
import com.api.crud.repository.GenreAnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreAnimeService {
    @Autowired
    GenreAnimeRepository repositorio;

    public void add(GenreAnime genre) {
        repositorio.save(genre);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public List<GenreAnime> getAll() {
        return repositorio.findAll();
    }

    public void update(GenreAnime genre) {
        repositorio.save(genre);
    }

    public List<GenreAnime> findByAnime(Anime anime) {
        return repositorio.findByAnime(anime);
    }

    public List<GenreAnime> findByGenre(Genre genre) {
        return repositorio.findByGenre(genre).stream().toList();
    }
}
