package ProyectoDBD.Services;

import ProyectoDBD.Models.Categoria;
import ProyectoDBD.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriaServices {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
