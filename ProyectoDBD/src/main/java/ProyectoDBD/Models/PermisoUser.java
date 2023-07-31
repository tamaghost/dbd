package ProyectoDBD.Models;


import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="permisouser")
public class PermisoUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permisouser")
    private long id_permisoUser;

    @ManyToOne
    @JoinColumn(name = "id_permisos")
    private Permiso id_permiso;

    @ManyToOne
    @JoinColumn(name = "id_tipouser")
    private PermisoUser id_tipo;
}
