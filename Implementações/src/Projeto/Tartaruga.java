package Projeto;

public class Tartaruga {
    private Direcao direction;
    
    public void setDirection(Direcao direction) {
        this.direction = direction;
    }

    public void mover(int n) {
        direction.mover(n);
    }

}


