package ProyectoDBD.Models;
import javax.persistence.*;

@Entity
@Table(name="tipodeuser")
public class TipoDeUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipouser")
    private long id_tipo;

    @Column(name = "tipo")
    private long tipo;

    //Falta?
}
