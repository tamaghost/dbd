package ProyectoDBD.Services;

import ProyectoDBD.Models.Valoracion;
import ProyectoDBD.Repositories.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValoracionService  {
    @Autowired
    ValoracionRepository valoracionRepository;

}