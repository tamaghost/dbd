package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
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

    //faltan llaves foraneas

}
