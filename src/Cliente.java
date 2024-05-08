public class Cliente {

    private String nome;
    private String CPF;

    public Cliente (String nome, String CPF){
        setNome(nome);
        setCPF(CPF);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
