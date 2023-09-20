package heranca;

public class usandoCarro {
    public static void main(String[] args) {
        // Criar uma instância de Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "verde", 75000.0, 4, true);

       meuCarro.exibirInformacoes();

        // Acessar os atributos específicos de Carro
        System.out.println("Número de Portas: " + meuCarro.getNumPortas());
        System.out.println("Tem Ar Condicionado? " + meuCarro.temArCondicionado());

        // Chamar um método específico de Carro
        meuCarro.ligarArCondicionado();
    }
}