import java.util.Scanner;

public class Grafico {

    public void menuCinema(Cinema cinema) {
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento do Cinema                   |");
        System.out.println("| 1.Gerenciar Sessões                            |");
        System.out.println("| 2.Gerenciar Filmes catalogados                 |");
        System.out.println("| 3.Vender ingressos                             |");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {

            case 1:
                menuSala(cinema);
                break;

            case 2:
                menuFilmes();
                break;

            case 3:
                menuVenda();
                break;
        }
    }

    public void menuSala(Cinema cinema){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Escolher Sala                             |");
        System.out.println("| 1.A0                                           |");
        System.out.println("| 2.A1                                           |");
        System.out.println("| 3.A2                                           |");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        Sala sala;
        switch (opcao) {
            case 1:
                sala = cinema.getSalaList().get(0);
                menuSessoes(cinema, sala);
                break;
            case 2:
                sala = cinema.getSalaList().get(1);
                menuSessoes(cinema, sala);
                break;
            case 3:
                sala = cinema.getSalaList().get(2);
                menuSessoes(cinema, sala);
                break;
        }
    }

    public void menuSessoes(Cinema cinema, Sala sala){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento de Sessoes                  |");
        System.out.println("| 1.Criar Sessão                                 |");
        System.out.println("| 2.Deletar Sessão                               |");
        System.out.println("| 3.Alterar Sessão                               |");
        System.out.println("| 4.Listar Sessões                               |");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                criarSessao(cinema, sala);
                break;
            case 2:
                deletarSessao(cinema, sala);

                break;
            case 3:

                break;
        }

    }

    public void criarSessao(Cinema cinema, Sala sala){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Horario (padrão ex:22:30)                      |");
        System.out.println("--------------------------------------------------");
        String horario = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Filme                                 |");
        System.out.println("--------------------------------------------------");
        cinema.imprimirFilmes();
        int i = scanner.nextInt();
        Filme filme = cinema.getFilmeList().get(i);
        sala.criarSessao(filme, sala.getLugares(),horario);
    }

    public void deletarSessao(Cinema cinema, Sala sala){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Sessao a ser Deletada                 |");
        System.out.println("--------------------------------------------------");
        sala.imprimirSessoes();
        int i = scanner.nextInt();
        sala.removeSessaoList(i);
    }

    public void menuFilmes(){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento de Filmes                   |");
        System.out.println("| 1.Catalogar Filme                              |");
        System.out.println("| 2.Descatalogar Filme                           |");
        System.out.println("| 3.Alterar Descrição de Filme                   |");
        System.out.println("| 4.Listar Filmes Catalogados                    |");
        System.out.println("--------------------------------------------------");

    }

    public void menuVenda(){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento de Venda de Ingresso        |");
        System.out.println("| 1.Vender                                       |");
        System.out.println("--------------------------------------------------");
    }




}
