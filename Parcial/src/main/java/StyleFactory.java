package main.java;
import java.util.ArrayList;
import java.util.List;

public class StyleFactory {
    private static final List<TextStyle> cache = new ArrayList<>();

    public static TextStyle getFlyweight(String fontName, int fontSize, String color) {
        for (TextStyle style : cache) {
            if (style.getFontName().equals(fontName) &&
                style.getFontSize() == fontSize &&
                style.getColor().equals(color)) {
                System.out.println("Reutilizando estilo existente " 
                    + fontName + ", " + fontSize + "px, " + color);
                return style; // reutiliza el existente
            }
        }

        // si no existe, crea uno nuevo y lo guarda
        TextStyle newStyle = new TextStyle(fontName, fontSize, color);
        cache.add(newStyle);
          System.out.println("Creando nuevo estilo " 
            + fontName + ", " + fontSize + "px, " + color);
        return newStyle;
    }
}


