public class Ingresso {

    private Sessao sessao;
    private Cliente cliente;
    private Sala sala;
    private Float preco;

    public Ingresso(Sala sala, Sessao sessao, Cliente cliente, Float preco){
        setCliente(cliente);
        setSessao(sessao);
        setSala(sala);
        setPreco(preco);
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
