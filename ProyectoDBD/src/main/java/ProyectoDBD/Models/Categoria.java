package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_categoria")
    private long categoria;

    @Column(name = "tipos")
    private String tipos;
}
