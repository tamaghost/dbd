package ProyectoDBD.Models;


import jakarta.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private long idDir;

    @Column(name = "pais")
    private long pais;

    @Column(name = "ciudad")
    private long ciudad;

    @Column(name = "calle")
    private long calle;

    @Column(name = "tipo_domicilio")
    private long domicilio;

    @Column(name = "numero")
    private long numero;

    @Column(name="fecha_creacion")
    private long creacion;

    //Faltan cosas
}
