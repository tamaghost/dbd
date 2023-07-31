package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Libro;
import ProyectoDBD.Services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }
}