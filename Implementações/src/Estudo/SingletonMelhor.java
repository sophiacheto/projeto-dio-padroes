package Estudo;
public class SingletonMelhor {

    public static SingletonMelhor instancia = new SingletonMelhor();

    private SingletonMelhor() {
        super();
    }

    public static SingletonMelhor getInstancia() {
        return instancia;
    }

}