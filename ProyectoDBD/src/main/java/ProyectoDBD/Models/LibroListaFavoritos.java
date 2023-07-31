package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="libro_listafavorito")
public class LibroListaFavoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librolista")
    private long LibroLista;

    //faltan llaves foraneas


}
