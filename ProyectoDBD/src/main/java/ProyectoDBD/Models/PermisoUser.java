package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@Table(name="permisouser")
public class PermisoUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permisouser")
    private long id_permisoUser;

    //Faltan llaves foraneas
}
