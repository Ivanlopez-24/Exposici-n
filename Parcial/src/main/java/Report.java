/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public abstract  class Report {
    protected final Exporter exporter;

    protected Report(Exporter exporter) {
        this.exporter = exporter;
    }

    public abstract String getTitulo();

    public abstract String getCuerpo();


    public String export() {
        return exporter.export(getTitulo(), getCuerpo());
    }
}
