package polimorfismo;

public class Main {
	public static void main(String[] args) {
		Onibus meuBus = new Onibus("Volvo", "Torino", 2010, "Branco", 40000.0, 44);
	    Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "verde", 75000.0, 4, true);
	    meuBus.exibirInformacoes();
	    meuBus.abastecer();
	    
	    meuCarro.exibirInformacoes();
	    meuCarro.abastecer();
	    meuCarro.abastecer("gasolina");
	    
	}
}
