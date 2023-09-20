package heranca;

public class usandoCaminhao {
    public static void main(String[] args) {
    	Caminhao meuTruck = new Caminhao("Scania", "77OS", 2023, "Vermelho", 730000.0, 8000);
    	meuTruck.exibirInformacoes();
        System.out.println("Capacidade de carga (KG): " + meuTruck.getCargaMaxima());
        meuTruck.destravarBau();
    }
}