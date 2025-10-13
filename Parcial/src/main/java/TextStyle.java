package main.java;

public class TextStyle {
    private final String fontName;
    private final int fontSize;
    private final String color;

    public TextStyle(String fontName, int fontSize, String color) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.color = color;
    }

    // Método que actúa sobre el estado único (extrínseco)
    public void operation(String uniqueText) {
        System.out.println("Renderizando texto: '" + uniqueText + "' con estilo [" 
            + fontName + ", " + fontSize + "px, " + color + "]");
    }

    // Getters
    public String getFontName() { return fontName; }
    public int getFontSize() { return fontSize; }
    public String getColor() { return color; }
}