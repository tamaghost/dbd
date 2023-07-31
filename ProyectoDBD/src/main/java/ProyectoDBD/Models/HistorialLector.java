package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="historiallector")
public class HistorialLector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_historial")
    private long codHistorial;

    @Column(name = "registro")
    private long registro;

    @Column(name = "nombre_libro")
    private long nombrelibroH;

    @Column(name = "fechahistorial")
    private long fechaHistorial;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario idUser;

    @ManyToOne
    @JoinColumn(name ="id_libro")
    private Libro idLibro;
    //llave ranking visualizados
}
