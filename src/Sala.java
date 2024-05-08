import java.util.ArrayList;
import java.util.List;

public class Sala {

    private int lugares;
    private String numSala;
    private List<Sessao> sessaoList;

    public Sala(String numSala, int lugares){
        sessaoList = new ArrayList<>();
        setLugares(lugares);
        setNumSala(numSala);
    }

    public void imprimirSessoes(){
        for(Sessao sessao : sessaoList){
            System.out.println(sessao);
        }
    }

    public void criarSessao(Filme filme, int limitePessoa, String horario){
        Sessao sessao = new Sessao(filme,limitePessoa, horario);
        sessaoList.add(sessao);
    }

    public void deletarSessao(int index){
        sessaoList.remove(index);
    }

    public void alterarSessao(int index){

    }


    public void addSessao(Sessao sessao){
        sessaoList.add(sessao);
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public List<Sessao> getSessaoList() {
        return sessaoList;
    }

    public void setSessaoList(List<Sessao> sessaoList) {
        this.sessaoList = sessaoList;
    }
}
