package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="librocategoria")
public class LibroCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librocategoria")
    private long LibroCategoria;

    //Faltan llaves foraneas
}
