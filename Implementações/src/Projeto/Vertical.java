package Projeto;

public class Vertical implements Direcao {

    @Override
    public void mover(int n) {
        // TODO Auto-generated method stub
        for (int i=0; i<n; i++)
            System.out.println("-");
    }
    
}
