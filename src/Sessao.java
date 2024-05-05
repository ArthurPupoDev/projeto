import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private Filme filme;
    private String horario;
    private int limitePessoa;
    private List<Ingresso> listIngresso;

    public Sessao(Filme filme,int limitePessoa, String horario){
        setFilme(filme);
        setHorario(horario);
        listIngresso = new ArrayList<>();
    }

    public boolean addIngresso(Ingresso ingresso){
        if(listIngresso.size() < limitePessoa) {
            listIngresso.add(ingresso);
            return true;
        }
        else return false;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getLimitePessoa() {
        return limitePessoa;
    }

    public void setLimitePessoa(int limitePessoa) {
        this.limitePessoa = limitePessoa;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getListIngresso() {
        return listIngresso;
    }

    public void setListIngresso(List<Ingresso> listIngresso) {
        this.listIngresso = listIngresso;
    }

    @Override
    public String toString() {
        return filme.getTitulo() + " " + this.horario;
    }
}
