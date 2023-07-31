package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="localizacion_geografica")
public class LocalizacionGeografica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_locgeo")
    private long Localizacion;

    @Column(name = "pais")
    private long Pais;

    @Column(name = "ciudad")
    private long Ciudad;

    @Column(name = "region")
    private long Region;
}
