package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="edicion")
public class Edicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_registro")
    private long cod_reg;

    @Column(name = "registro")
    private long registro;

    //Falta??
}
