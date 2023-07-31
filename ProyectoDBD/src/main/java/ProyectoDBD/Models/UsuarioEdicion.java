package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="edicionusuario")
public class UsuarioEdicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarioedicion")
    private long codValor;

    //Faltan llaves foraneas

}
