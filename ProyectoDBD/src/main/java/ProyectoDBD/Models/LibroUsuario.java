package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@Table(name="libro_usuario")
public class LibroUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro_usuario")
    private long libroUsuario;

    //Faltan llaves foraneas
}
