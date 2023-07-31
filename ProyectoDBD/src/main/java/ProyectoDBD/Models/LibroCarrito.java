package ProyectoDBD.Models;

import javax.persistence.*;


@Entity
@SuppressWarnings("ALL")
@Table(name="librocarrito")
public class LibroCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librocarrito")
    private long libroCarrito;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario id_user;

    @ManyToOne
    @JoinColumn(name ="carrito_user")
    private Carrito carritoUser;
}
