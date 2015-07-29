package br.com.desbravador.controller;

import br.com.desbravador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Daniel Queiroz
 */
@RepositoryRestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/{id}")
    public String usuarioForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("usuario", usuarioRepository.findOne(id));
        return "usuarioForm";
    }

}
