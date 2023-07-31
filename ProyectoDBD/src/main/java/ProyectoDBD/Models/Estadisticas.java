package ProyectoDBD.Models;

import jakarta.persistence.*;

@Entity
@Table(name="estadisticas")
public class Estadisticas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_est")
    private long idEst;

    @Column(name = "promedio")
    private long promedio;

    @Column(name = "des_estandar")
    private long devEstandar;

    //Faltan mas cosas
}
