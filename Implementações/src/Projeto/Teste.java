package Projeto;

public class Teste {

    public static void main(String[] args) {
        Direcao horizontal = new Horizontal();
        Direcao vertical = new Vertical();

        Tartaruga turtle = new Tartaruga();

        turtle.setDirection(horizontal);
        turtle.mover(5);
        turtle.setDirection(vertical);
        turtle.mover(7);
    }
    
}
