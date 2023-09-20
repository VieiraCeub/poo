package heranca;

class Onibus extends Veiculo {
    private int numAssentos;

    public Onibus(String _marca, String _modelo, int _ano, String _cor, double _preco, int numAssentos) {
        super(_marca, _modelo, _ano, _cor, _preco);
        this.numAssentos = numAssentos;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void abrirBagageiro() {
       System.out.println("Bagageiro aberto.");
    }
}
