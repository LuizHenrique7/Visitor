public class Celular {

    private String marca;
    private String modelo;

    private Loja loja;

    public Celular(String marca, String modelo, Loja loja){
        this.marca = marca;
        this.modelo = modelo;
        this.loja = loja;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeLoja() {
        return this.loja.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCelular(this);
    }
}

