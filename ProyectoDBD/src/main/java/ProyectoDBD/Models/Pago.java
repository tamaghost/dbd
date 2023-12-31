package ProyectoDBD.Models;

import javax.persistence.*;

@Entity
@SuppressWarnings("ALL")
@Table(name="pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pago")
    private long codPago;

    @Column(name = "comprobante")
    private long comprobante;

    @Column(name = "mediopago")
    private long promedio;

    @ManyToOne
    @JoinColumn(name = "carrito_user")
    private Carrito carritoUser;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Usuario idUser;

}
