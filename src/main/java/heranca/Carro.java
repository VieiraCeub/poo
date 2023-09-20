package heranca;

class Carro extends Veiculo {
    private int numPortas;
    private boolean arCondicionado;

    public Carro(String _marca, String _modelo, int _ano, String _cor, double _preco, int numPortas, boolean arCondicionado) {
        super(_marca, _modelo, _ano, _cor, _preco);
        this.numPortas = numPortas;
        this.arCondicionado = arCondicionado;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public boolean temArCondicionado() {
        return arCondicionado;
    }

    // Método específico para carros
    public void ligarArCondicionado() {
        if (arCondicionado) {
            System.out.println("Ar condicionado ligado.");
        } else {
            System.out.println("Este carro não possui ar condicionado.");
        }
    }
}
