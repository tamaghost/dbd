package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long idUser;

    @Column(name = "contraseña")
    private long contraseña;

    @Column(name = "nombre_user")
    private long nombre;

    @Column(name = "año_nacimiento")
    private long añoNacimiento;

    @Column(name = "cant_publicado")
    private long liBrosPublicados;

    @Column(name="fecha_creacion")
    private long creacion;

    @Column(name="correo")
    private long correo;

    //Faltan mas cosas
}
