package h.reposicion.liga.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import h.reposicion.liga.modelos.Equipo;
import h.reposicion.liga.modelos.Posiciones;
import h.reposicion.liga.repositorios.EquipoRepository;
import h.reposicion.liga.repositorios.PosicionesRepository;
import h.reposicion.liga.servicios.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PosicionesRepository posicionesRepository;

    @Override
    public Equipo crearEquipo(Equipo nvoEquipo) {
        return equipoRepository.save(nvoEquipo);        
    }

    @Override
    public String eliminarEquipoPorId(int codigoEquipo) {
        Equipo equipoEliminar = this.equipoRepository.findById(codigoEquipo).get();
        Boolean posicionEquipo = this.posicionesRepository.existsById(codigoEquipo);

        if(equipoEliminar != null && posicionEquipo == false){
            this.equipoRepository.delete(equipoEliminar);
            return "Se ha eliminado el Equipo: " + equipoEliminar.getCodigoEquipo(); 
        }

        return "No existe el Equipo con el codigo o ya esta en competencia ";
    }


    
}
