package interfaces;

class Carro implements Veiculo {
	    public void ligar() {
	        System.out.println("Carro ligado.");
	    }

	    public void desligar() {
	        System.out.println("Carro desligado.");
	    }

	    public void acelerar(int velocidade) {
	        System.out.println("Acelerando o carro para " + velocidade + " km/h.");
	    }
}
