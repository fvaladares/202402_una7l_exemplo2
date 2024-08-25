package data;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;


    public Endereco(String rua,
                    int numero,
                    String bairro,
                    String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
