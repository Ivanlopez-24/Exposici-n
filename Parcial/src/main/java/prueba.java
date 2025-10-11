package main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdieg
 */
public class prueba {
     public static void main(String[] args) {
        Exporter html = new HTMLExporter();
        Exporter md = new MarkdownExporter();

        Report detallado = new ReporteDetallado(html, "Ventas totales: $25.000.000; Nuevos clientes: 120; Devoluciones: 3%");
        Report ejecutivo = new ReporteEjecutivo(md, "El semestre anterior se mostro un crecimiento estable :v.");

        System.out.println("--- Detallado (HTML) ---");
        System.out.println(detallado.export());
        System.out.println();

        System.out.println("--- Ejecutivo (Markdown) ---");
        System.out.println(ejecutivo.export());

        // La estructura seria pues el report que tiene la abstracción
   // Las clases concretas de eso ya serían el detallado y el ejecutivo
   // exporter pues el implementor con el HTML y el markdown
        ReportContent basic = new ConcreteReport();
        ReportContent withHeader = new HeaderDecorator(basic);
        ReportContent fullReport = new FooterDecorator(withHeader);

        fullReport.execute();
   

    }
}
