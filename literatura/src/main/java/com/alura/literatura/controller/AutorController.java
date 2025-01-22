package com.alura.literatura.controller;


import com.alura.literatura.model.Autor;
import com.alura.literatura.service.AutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping("/autores")
    public List<Autor> obtenerAutores() {
        return autorService.obtenerAutores();
    }
}
