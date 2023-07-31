package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@Table(name="tp_usuario")
public class TPUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tp_user")
    private long idTP;

    @Column(name = "id_user")
    private long idUser;

    @Column(name = "id_tipouser")
    private long id_tipo;

    //Faltan cosas?
}
