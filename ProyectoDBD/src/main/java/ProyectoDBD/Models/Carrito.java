package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrito_user")
    private long carritoUser;

    //Faltan llaves foraneas
}
