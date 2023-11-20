package com.api.crud.service;

import com.api.crud.model.Ending;
import com.api.crud.repository.EndingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndingService {
    @Autowired
    private EndingRepository repositorio;

    public List<Ending> getAll() {
        return repositorio.findAll();
    }

    public Ending add(Ending ending) {
        return repositorio.save(ending);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }
}
