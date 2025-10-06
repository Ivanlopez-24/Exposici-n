/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public class HTMLExporter implements Exporter {

    @Override
    public String export(String titulo, String cuerpo) {
      StringBuilder sb = new StringBuilder();
        sb.append("<html><head><meta charset=\"utf-8\"><title>").append(titulo).append("</title></head>");
        sb.append("<body>");
        sb.append("<h1>").append(titulo).append("</h1>");
        sb.append("<div>").append(cuerpo.replace("\n", "<br/>")) .append("</div>");
        sb.append("</body></html>");
        return sb.toString();
    }
    
    
}
