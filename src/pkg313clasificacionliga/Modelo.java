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
public class Modelo {
    private Partido[] laJornada;
    private Equipo[] losEquipos;

    public Partido[] getLaJornada() {
        return laJornada;
    }

    public Equipo[] getLosEquipos() {
        return losEquipos;
    }

    public Modelo() {
    }
    
    private void actualizarResultadosPartidoJornada(Partido unPartido){
        unPartido.getEquipoLocal().setGf(unPartido.getEquipoLocal().getGf()+unPartido.getResultadoLocal());
        unPartido.getEquipoVisitante().setGf(unPartido.getResultadoVisitante());
        unPartido.getEquipoLocal().setGc(unPartido.getResultadoVisitante());
        unPartido.getEquipoVisitante().setGc(unPartido.getResultadoVisitante());
    }
    
    public void generarJornada(){
        
    }
}
