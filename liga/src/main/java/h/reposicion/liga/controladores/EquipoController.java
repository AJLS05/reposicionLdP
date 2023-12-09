package h.reposicion.liga.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import h.reposicion.liga.modelos.Equipo;
import h.reposicion.liga.servicios.impl.EquipoServiceImpl;

@RestController
@RequestMapping("/api/equipo")
class resourceNameController {

    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    
    @PostMapping("/crear")
    public Equipo crearEquipo(@RequestBody Equipo nvoEquipo){     
        return this.equipoServiceImpl.crearEquipo(nvoEquipo);
    }

    @DeleteMapping("/eliminar")
    public String eliminarEquipoPorCodigo(@RequestParam(name="codigoEquipo") int codigoEquipo){
        return this.equipoServiceImpl.eliminarEquipoPorId(codigoEquipo);
    }
}