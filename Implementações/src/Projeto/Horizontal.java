package Projeto;

public class Horizontal implements Direcao {

    @Override
    public void mover(int n) {
        // TODO Auto-generated method stub
        for (int i=0; i<n; i++)
            System.out.print("-");
        System.out.println();
    }
    
}
