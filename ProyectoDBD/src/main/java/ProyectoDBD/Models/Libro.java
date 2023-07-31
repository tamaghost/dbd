package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private long idLibro;

    @Column(name = "nombre_libro")
    private long Libro;

    @Column(name = "descripcion")
    private long descripcion;

    @Column(name = "editorial")
    private long editorial;

    @Column(name = "precio")
    private long precio;

    @Column(name="stock")
    private long stock;

    @Column(name = "edicion")
    private long edicion;

    @Column(name="url")
    private long url;

    @ManyToOne
    @JoinColumn(name ="cod_locgeo")
    private LocalizacionGeografica Localizacion;

    @ManyToOne
    @JoinColumn(name ="cod_rankingl")
    private RankingListaFavoritos codRankingL;
    //Llave foránea ranking visualizados
}
