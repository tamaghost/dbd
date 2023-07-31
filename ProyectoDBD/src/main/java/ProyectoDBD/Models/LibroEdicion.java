package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="edicionlibro")
public class LibroEdicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libroedicion")
    private long libroEdicion;

    //Faltan llaves foraneas
}
