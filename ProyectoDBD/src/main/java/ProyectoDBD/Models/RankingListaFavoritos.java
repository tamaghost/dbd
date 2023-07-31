package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="rankinglistafavoritos")
public class RankingListaFavoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_rankingl")
    private long codRankingL;

    @Column(name = "posiciorl")
    private long posicion;

    @Column(name = "nombre_librorl")
    private long libroRL;

}
