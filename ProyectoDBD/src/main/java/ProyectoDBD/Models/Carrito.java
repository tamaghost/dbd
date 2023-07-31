package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrito_user")
    private long carritoUser;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario idUser;


}
