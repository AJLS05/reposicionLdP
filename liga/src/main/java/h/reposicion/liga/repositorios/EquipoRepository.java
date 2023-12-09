package h.reposicion.liga.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import h.reposicion.liga.modelos.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer>{
    
}