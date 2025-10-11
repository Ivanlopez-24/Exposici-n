package main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public class ReporteDetallado extends Report {
private final String data;

public ReporteDetallado(Exporter exporter, String data) {
        super(exporter);
        this.data = data;
    }
    @Override
    public String getTitulo() {
        return "Reporte detallado";
    }

    @Override
    public String getCuerpo() {
      return "Este e sun reporte detallado con la información: \n " + data;
    }
    
}
