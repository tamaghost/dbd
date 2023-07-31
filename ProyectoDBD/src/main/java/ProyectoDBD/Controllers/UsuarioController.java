package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Usuario;
import ProyectoDBD.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }
}