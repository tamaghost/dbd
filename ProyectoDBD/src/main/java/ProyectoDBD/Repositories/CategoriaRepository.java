package ProyectoDBD.Repositories;

import ProyectoDBD.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Categoria findCategoriaByTipos(String tipos);

}
