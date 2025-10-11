package main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public class MarkdownExporter implements Exporter{

    @Override
    public String export(String titulo, String cuerpo) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(titulo).append("\n\n");
        sb.append(cuerpo).append("\n");
        return sb.toString();
    }
    
}
