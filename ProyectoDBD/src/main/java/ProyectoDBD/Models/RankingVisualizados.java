package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="rankingvisualizados")
public class RankingVisualizados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_rankingv")
    private long rankingV;

    @Column(name = "posiciorv")
    private long posicionRV;

    @Column(name = "nombre_librovl")
    private long nombre_librovl;
}
