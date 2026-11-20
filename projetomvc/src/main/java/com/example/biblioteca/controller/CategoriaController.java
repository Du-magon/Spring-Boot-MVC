package com.example.biblioteca.controller;

import com.example.biblioteca.model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    private final List<Categoria> categorias = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("categoria", new Categoria());
        model.addAttribute("categorias", categorias);
        return "categorias/categorias";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Categoria categoria) {
        categorias.add(categoria);
        return "redirect:/categorias";
    }
}
