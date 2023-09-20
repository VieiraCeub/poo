package interfaces;

public class UsandoCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.ligar();
        meuCarro.acelerar(60);
        meuCarro.desligar();
    }
}
