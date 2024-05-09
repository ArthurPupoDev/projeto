import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String cinema;
    private List<Sala> salaList;
    private List<Filme> filmeList;
    private Float valorIngressosVendidos;

    public Float getValorIngressosVendidos() {
        return valorIngressosVendidos;
    }

    public void setValorIngressosVendidos(Float valorIngressosVendidos) {
        this.valorIngressosVendidos = this.valorIngressosVendidos + valorIngressosVendidos;
    }

    public Cinema(){
        setCinema("projeto cinema");
        salaList = new ArrayList();
        filmeList = new ArrayList();
        valorIngressosVendidos = 0f;

        for (int i = 0; i < 1; i++) {
            Filme filme = new Filme("A volta de quem não foi", "Tristeza");
            filmeList.add(filme);
            Filme filme2 = new Filme("Sexta-Feira 13 e Santa", "Comédia");
            filmeList.add(filme2);
            Filme filme3 = new Filme("Koe No Katachi", "Drama");
            filmeList.add(filme3);
        }


        for(int i = 0; i < 3; i++){
            Sala sala = new Sala("A"+i, 1);
            sala.criarSessao(filmeList.get(i), sala.getLugares(), "2"+i+":00");
            salaList.add(sala);
        }

    }

    public void imprimirFilmes(){
        int i = 0;
        for(Filme filme: filmeList ){
            System.out.println(i+". "+filme);
            i++;
        }
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public List<Sala> getSalaList() {
        return salaList;
    }

    public Sala getSala(int i) {
        return salaList.get(i);
    }

    public void setSalaList(List<Sala> salaList) {
        this.salaList = salaList;
    }

    public List<Filme> getFilmeList() {
        return filmeList;
    }

    public void setFilmeList(List<Filme> filmeList) {
        this.filmeList = filmeList;
    }

    public void criarFilme(String titulo, String genero){
        Filme filme = new Filme(titulo, genero);
        filmeList.add(filme);
    }

    public void alterarFilme(String titulo, String genero, int indexFilme){
        Filme filme = new Filme(titulo, genero);
        filmeList.set(indexFilme,filme);
    }

    public void deletarFilme(int index){
        filmeList.remove(index);
    }


}
