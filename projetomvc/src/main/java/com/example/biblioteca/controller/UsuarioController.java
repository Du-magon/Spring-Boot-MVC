package com.example.biblioteca.controller;

import com.example.biblioteca.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("usuarios", usuarios);
        return "usuarios/usuarios";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Usuario usuario) {
        usuarios.add(usuario);
        return "redirect:/usuarios";
    }
}
