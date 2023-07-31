package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="listafavoritos")
public class ListaFavoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lf")
    private long id_lista;

    @Column(name = "nombre_libro")
    private long nombreLibro;

    @ManyToOne
    @JoinColumn(name ="cod_rankingl")
    private RankingListaFavoritos codRankingl;

}
