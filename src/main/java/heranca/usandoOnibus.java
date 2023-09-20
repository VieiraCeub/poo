package heranca;

public class usandoOnibus {
    public static void main(String[] args) {
        // Criar uma instância de Carro
        Onibus meuBus = new Onibus("Volvo", "Torino", 2010, "Branco", 40000.0, 44);

        meuBus.exibirInformacoes();

        // Acessar os atributos específicos de Carro
        System.out.println("Número de assentos: " + meuBus.getNumAssentos());
        
        // Chamar um método específico de Carro
        meuBus.abrirBagageiro();
    }
}