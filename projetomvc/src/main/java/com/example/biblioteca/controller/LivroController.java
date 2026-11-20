package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private final List<Livro> livros = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("livros", livros);
        return "livros/livro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Livro livro) {
        livros.add(livro);
        return "redirect:/livros";
    }
}
