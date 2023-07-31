package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Categoria;
import ProyectoDBD.Services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/categoria/")


public class CategoriaCOntroller {
    @Autowired
    CategoriaServices categoriaServices;

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria){
        return categoriaServices.save(categoria);
    }
}
