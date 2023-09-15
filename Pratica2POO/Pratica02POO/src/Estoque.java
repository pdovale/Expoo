public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (qtdAtual >= qtde) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }

    public String mostra() {
        return "Nome do Produto: " + nome + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }
}