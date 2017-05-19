/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg313clasificacionliga;

/**
 *
 * @author sergio
 */
public class Partido {
    private int resultadoLocal;
    private int resultadoVisitante;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public Partido(int resultadoLocal, int resultadoVisitante, Equipo equipoLocal, Equipo equipoVisitante) {
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }
    
}
