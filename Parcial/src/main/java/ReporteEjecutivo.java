package main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public class ReporteEjecutivo extends Report {
    private final String resumen;

    public ReporteEjecutivo(Exporter exporter, String resumen) {
        super(exporter);
        this.resumen = resumen;
    }

    @Override
    public String getTitulo() {
        return "Resumen ejecutivo";
    }

    @Override
    public String getCuerpo() {
        return "Resumen ejecutivo:\n" + resumen;
    }
}
