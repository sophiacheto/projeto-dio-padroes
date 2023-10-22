package Estudo;

public class Test {
    
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println();

        SingletonMelhor melhor = SingletonMelhor.getInstancia();
        System.out.println(melhor);
        melhor = SingletonMelhor.getInstancia();
        System.out.println(melhor);
    }
}
