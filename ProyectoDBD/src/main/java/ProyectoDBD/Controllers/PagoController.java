package ProyectoDBD.Controllers;

import ProyectoDBD.Models.Pago;
import ProyectoDBD.Services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    private final PagoService pagoService;

    @Autowired
    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public Pago save(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }
}