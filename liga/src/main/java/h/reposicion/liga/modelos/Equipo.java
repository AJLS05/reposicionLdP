package h.reposicion.liga.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="equipos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {

    @Id
    @Column(name="codigoEquipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoEquipo;

    @Column(name="nombre")
    private String nombre;

    @Column(name="atque")
    private double ataque;

    @Column(name="defensa")
    private double defensa;

}