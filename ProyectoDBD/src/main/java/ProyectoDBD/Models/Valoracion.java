package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="valoracion")
public class Valoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_valor")
    private long codValor;

    @Column(name = "puntaje")
    private long puntaje;

    @Column(name = "chequear")
    private long chequear;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario idUser;

    @ManyToOne
    @JoinColumn(name ="id_libro")
    private Libro idLibro;


}
