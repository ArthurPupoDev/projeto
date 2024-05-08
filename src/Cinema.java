import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String cinema;
    private List<Sala> salaList;
    private List<Filme> filmeList;

    public Cinema(){
        setCinema("projeto cinema");
        salaList = new ArrayList();
        filmeList = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            Filme filme = new Filme("A volta de quem não foi", "Tristeza");
            filmeList.add(filme);
            Filme filme2 = new Filme("Sexta-Feira 13 e Santa", "Comédia");
            filmeList.add(filme2);
            Filme filme3 = new Filme("Koe No Katachi", "Drama");
            filmeList.add(filme3);
        }

        for(int i = 0; i < 3; i++){
            Sala sala = new Sala("A"+i, 10);
            Sessao sessao = new Sessao(filmeList.get(i),sala.getLugares(),"2"+i+":00");
            salaList.add(sala);
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

    public void setSalaList(List<Sala> salaList) {
        this.salaList = salaList;
    }
}
