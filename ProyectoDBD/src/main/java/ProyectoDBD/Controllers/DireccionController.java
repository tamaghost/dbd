package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Direccion;
import ProyectoDBD.Services.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/direcciones")
public class DireccionController {

    private final DireccionService direccionService;

    @Autowired
    public DireccionController(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    @PostMapping
    public Direccion save(@RequestBody Direccion direccion) {
        return direccionService.save(direccion);
    }

    // Puedes agregar otros métodos del controlador según tus necesidades
}