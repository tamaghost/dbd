package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="librocategoria")
public class LibroCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librocategoria")
    private long LibroCategoria;

    @ManyToOne
    @JoinColumn(name ="id_libro")
    private Libro idLibro;

    @ManyToOne
    @JoinColumn(name ="cod_categoria")
    private Categoria categoria;
}
