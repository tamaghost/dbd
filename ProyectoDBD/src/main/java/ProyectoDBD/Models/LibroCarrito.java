package ProyectoDBD.Models;

import javax.persistence.*;


@Entity
@Table(name="librocarrito")
public class LibroCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librocarrito")
    private long libroCarrito;

    //Faltan llaves foraneas
}
