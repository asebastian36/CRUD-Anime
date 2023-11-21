package com.api.crud.service;

import com.api.crud.model.*;
import com.api.crud.repository.OpeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpeningService {
    @Autowired
    private OpeningRepository repositorio;

    public List<Opening> getAll() {
        return repositorio.findAll();
    }

    public Opening add(Opening opening) {
        return repositorio.save(opening);
    }


    public List<Opening> findByAnime(Anime anime) {
        return repositorio.findByAnime(anime);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }
}
