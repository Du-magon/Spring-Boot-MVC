package com.example.biblioteca.controller;

import com.example.biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {
    private final List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("autor", new Autor());
        model.addAttribute("autores", autores);
        return "autores/autores";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autores";
    }
}
