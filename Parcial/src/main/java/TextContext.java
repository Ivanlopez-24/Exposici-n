package main.java;

public class TextContext {
    private final String uniqueState; // texto único (extrínseco)
    private final TextStyle flyweight; // estilo compartido

    public TextContext(String repeatingStateFont, int repeatingStateSize, String repeatingStateColor, String uniqueState) {
        this.uniqueState = uniqueState;
        this.flyweight = StyleFactory.getFlyweight(repeatingStateFont, repeatingStateSize, repeatingStateColor);
    }

    public void operation() {
        flyweight.operation(uniqueState);
    }
}

