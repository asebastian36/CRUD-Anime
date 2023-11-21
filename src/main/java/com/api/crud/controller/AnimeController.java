package com.api.crud.controller;

import com.api.crud.model.*;
import com.api.crud.repository.GenreRepository;
import com.api.crud.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/api/v2")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @Autowired
    private OpeningService openingService;

    @Autowired
    private EndingService endingService;

    @Autowired
    private GenreService genreService;

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping({"", "/", "index"})
    public String inicio(Model model) {
        List<Anime> animes = animeService.getAll();
        model.addAttribute("animes", animes);
        return "index";
    }

    @GetMapping("/anime/{id}")
    public String element(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);

        return "anime";
    }

    @GetMapping("/anime/new")
    public String formNew(Model model) {
        model.addAttribute("anime", new Anime());
        return "formNew";
    }

    @GetMapping("/anime/edit/{id}")
    public String formEdit(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimesById(id).get(0);
        model.addAttribute("anime", anime);
        return "formEdit";
    }

    @PostMapping("/anime/save")
    public String save(Anime anime) {
        animeService.add(anime);
        return "redirect:/api/v2/";
    }

    @GetMapping("/anime/delete/{id}")
    public String delete(@PathVariable long id) {
        animeService.delete(id);
        return "redirect:/api/v2/";
    }
}
