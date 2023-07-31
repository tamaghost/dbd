package ProyectoDBD.Models;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name="tp_usuario")
public class TPUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tp_user")
    private long idTP;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario idUser;

    @ManyToOne
    @JoinColumn(name ="id_tipouser")
    private TipoDeUser id_tipo;


}
