public class Ingresso {

    private Sessao sessao;
    private Cliente cliente;

    public Ingresso(Sessao sessao, Cliente cliente){
        setCliente(cliente);
        setSessao(sessao);
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
