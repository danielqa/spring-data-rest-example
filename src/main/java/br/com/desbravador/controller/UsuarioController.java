package br.com.desbravador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Daniel Queiroz
 */
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @RequestMapping("/{id}")
    public String usuarioForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("id", id);
        return "usuarioForm";
    }

}
