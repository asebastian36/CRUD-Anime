package com.api.crud.controller;

import com.api.crud.model.*;
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
    private GenreAnimeService genreAnimeService;

    @Autowired
    private GenreService genreService;

    @GetMapping({"", "/", "index"})
    public String inicio(Model model) {
        loadingInfo();
        List<Anime> animes = animeService.getAll();
        model.addAttribute("animes", animes);
        return "main/index";
    }

    @GetMapping("/anime/{id}")
    public String element(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);
        model.addAttribute("openings", openingService.findByAnime(anime));
        model.addAttribute("endings", endingService.findByAnime(anime));
        model.addAttribute("genres", genreAnimeService.findByAnime(anime));
        return "main/anime";
    }

    @GetMapping("/anime/new")
    public String formNew(Model model) {
        model.addAttribute("anime", new Anime());
        return "main/formNew";
    }

    @GetMapping("/anime/edit/{id}")
    public String formEdit(@PathVariable long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);
        return "main/formEdit";
    }

    @GetMapping("/anime/search")
    public String formSearch(Model model) {
        model.addAttribute("genres", genreService.getAll());
        return "main/search";
    }

    @PostMapping("/anime/send")
    public String search(String name, Model model) {
        model.addAttribute("animes", animeService.findByName(name));
        return "main/resultado";
    }

    @PostMapping("/anime/edit")
    public String edit(Anime anime) {
        animeService.update(anime);
        return "redirect:/api/v2/";
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

    private void loadingInfo() {

    }
}
