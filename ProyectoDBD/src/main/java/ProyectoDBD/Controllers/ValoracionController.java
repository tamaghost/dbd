package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Valoracion;
import ProyectoDBD.Services.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/valoraciones")
public class ValoracionController {

    private final ValoracionService valoracionService;

    @Autowired
    public ValoracionController(ValoracionService valoracionService) {
        this.valoracionService = valoracionService;
    }

    @PostMapping
    public Valoracion save(@RequestBody Valoracion valoracion) {
        return valoracionService.save(valoracion);
    }

    // Puedes agregar otros métodos del controlador según tus necesidades
}