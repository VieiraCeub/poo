package heranca;

class Caminhao extends Veiculo {
    private int cargaMaxima;

    public Caminhao(String _marca, String _modelo, int _ano, String _cor, double _preco, int cargaMaxima) {
        super(_marca, _modelo, _ano, _cor, _preco);
        this.cargaMaxima = cargaMaxima;
    }
    
    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void destravarBau() {
       System.out.println("Baú destravado.");
    }
}
