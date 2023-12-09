package h.reposicion.liga.servicios;

import h.reposicion.liga.modelos.Equipo;

public interface EquipoService {

    public Equipo crearEquipo(Equipo nvoEquipo);

    public String eliminarEquipoPorId(int codigoEquipo);
}
