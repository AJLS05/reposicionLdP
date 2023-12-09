package h.reposicion.liga.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posiciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posiciones {

    @Id
    @JsonIgnore
    @OneToOne
    @JoinColumn(name="codigoEquipo", referencedColumnName = "codigoEquipo")
    private int equipo;

    @Column(name="empates")
    private int empates;

    @Column(name="ganados")
    private int ganados;

    @Column(name="perdidos")
    private int perdidos;

    @Column(name="golesFavor")
    private int golesFavor;

    @Column(name="golesContra")
    private int golesContra;

    @Column(name="puntos")
    private int puntos;

    

}