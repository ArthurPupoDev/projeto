import java.util.Scanner;

public class Grafico {

    public void menuCinema(Cinema cinema) {
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento do Cinema                   |");
        System.out.println("| 1.Gerenciar Sessões                            |");
        System.out.println("| 2.Gerenciar Filmes catalogados                 |");
        System.out.println("| 3.Vender ingressos                             |");
        System.out.println("| 4.Valor Ingressos Vendidos                     |");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {

            case 1:
                menuSala(cinema);
                break;

            case 2:
                menuFilmes(cinema);
                break;

            case 3:
                menuCatalogo(cinema);
                break;

            case 4:
                menuIngressosVendidos(cinema);
                break;
        }
    }

    public void menuIngressosVendidos(Cinema cinema){
        System.out.println("--------------------------------------------------");
        System.out.println("| Valor Ingressos Vendidos:"+cinema.getValorIngressosVendidos()+"$");
        System.out.println("--------------------------------------------------");
        menuCinema(cinema);
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
                sala = cinema.getSala(0);
                menuSessoes(cinema, sala);
                break;
            case 2:
                sala = cinema.getSala(1);
                menuSessoes(cinema, sala);
                break;
            case 3:
                sala = cinema.getSala(2);
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
        System.out.println("| 5.Menu Principal                               |");
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
                alterarSessao(cinema, sala);
                break;
            case 4:
                listarSessoes(cinema, sala);
                break;
            case 5:
                menuCinema(cinema);
                break;
        }

    }

    public void alterarSessao(Cinema cinema, Sala sala){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Sessao a ser Alterada                 |");
        System.out.println("--------------------------------------------------");
        sala.imprimirSessoes();
        int indexSessoes = scanner.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("| Novo Horario (padrão ex:22:30)                 |");
        System.out.println("--------------------------------------------------");
        scanner.nextLine();
        String horario = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Novo Filme                            |");
        System.out.println("--------------------------------------------------");
        cinema.imprimirFilmes();
        int i = scanner.nextInt();
        Filme filme = cinema.getFilmeList().get(i);
        sala.alterarSessao(filme, sala.getLugares(), horario, indexSessoes);
        menuCinema(cinema);

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
        menuCinema(cinema);

    }

    public void deletarSessao(Cinema cinema, Sala sala){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Sessao a ser Deletada                 |");
        System.out.println("--------------------------------------------------");
        sala.imprimirSessoes();
        int i = scanner.nextInt();
        sala.removeSessaoList(i);
        menuCinema(cinema);
    }

    public void listarSessoes(Cinema cinema, Sala sala){
        System.out.println("--------------------------------------------------");
        System.out.println("| Sessoes Encontradas da Sala                    |");
        System.out.println("--------------------------------------------------");
        sala.imprimirSessoes();
        menuSessoes(cinema,sala);
    }

    public void menuFilmes(Cinema cinema){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento de Filmes                   |");
        System.out.println("| 1.Catalogar Filme                              |");
        System.out.println("| 2.Retirar Filme                                |");
        System.out.println("| 3.Alterar Descrição de Filme                   |");
        System.out.println("| 4.Listar Filmes Catalogados                    |");
        System.out.println("| 5.Menu Principal                               |");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                catalogarFilme(cinema);
                break;
            case 2:
                retirarFilme(cinema);
                break;
            case 3:
                alterarFilme(cinema);
                break;
            case 4:
                listarFilmes(cinema);
                break;
            case 5:
                menuCinema(cinema);
        }
    }

    public void alterarFilme(Cinema cinema){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Filme a ser alterado                  |");
        System.out.println("--------------------------------------------------");
        cinema.imprimirFilmes();
        int indexFilme = scanner.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("| Novo Titulo                                    |");
        System.out.println("--------------------------------------------------");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("| Novo Genero do Filme                           |");
        System.out.println("--------------------------------------------------");
        String genero = scanner.nextLine();
        cinema.alterarFilme(titulo,genero,indexFilme);
        menuCinema(cinema);
    }

    public void catalogarFilme(Cinema cinema){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Titulo do Filme:                               |");
        System.out.println("--------------------------------------------------");
        String titulo = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("| Genero Filme   :                               |");
        System.out.println("--------------------------------------------------");
        String genero = scanner.nextLine();
        cinema.criarFilme(titulo,genero);
        menuCinema(cinema);
    }

    public void retirarFilme(Cinema cinema){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Filme a ser Retirado                  |");
        System.out.println("--------------------------------------------------");
        cinema.imprimirFilmes();
        int i = scanner.nextInt();
        cinema.deletarFilme(i);
        menuCinema(cinema);

    }

    public void listarFilmes(Cinema cinema){
        System.out.println("--------------------------------------------------");
        System.out.println("| Filmes Disponiveis                             |");
        System.out.println("--------------------------------------------------");
        cinema.imprimirFilmes();
        menuFilmes(cinema);

    }

    public void menuVenda(Cinema cinema){
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento de Venda de Ingresso        |");
        System.out.println("| 1.Vender                                       |");
        System.out.println("--------------------------------------------------");
    }

    public void menuCatalogo(Cinema cinema) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("| Sessoes Disponiveis                            |");
        System.out.println("--------------------------------------------------");
        Sala sala = cinema.getSalaList().get(0);
        System.out.println("Sala A0 -");
        sala.imprimirSessoes();
        sala = cinema.getSalaList().get(1);
        System.out.println("Sala A1 -");
        sala.imprimirSessoes();
        sala = cinema.getSalaList().get(2);
        System.out.println("Sala A2 -");
        sala.imprimirSessoes();
        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Escolher Sala                             |");
        System.out.println("| 1.A0                                           |");
        System.out.println("| 2.A1                                           |");
        System.out.println("| 3.A2                                           |");
        System.out.println("--------------------------------------------------");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                sala = cinema.getSala(0);
                break;
            case 2:
                sala = cinema.getSala(1);
                break;
            case 3:
                sala = cinema.getSala(2);
                break;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher sessao                                |");
        System.out.println("--------------------------------------------------");
        sala.imprimirSessoes();
        int i = scanner.nextInt();
        Sessao sessao = sala.getSessaoList().get(i);
        System.out.println("--------------------------------------------------");
        System.out.println("| Escolher Tipo de Ingresso                      |");
        System.out.println("| 1.Meia                                         |");
        System.out.println("| 2.Inteira                                      |");
        System.out.println("--------------------------------------------------");
        opcao = scanner.nextInt();
        Float preco =0f;
        if(opcao == 1){
            preco = 10f;
        }
        else{
            preco = 20f;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("| Nome Cliente                                   |");
        System.out.println("--------------------------------------------------");
        scanner.nextLine();
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(nome);
        Ingresso ingresso = new Ingresso(sala, sessao, cliente, preco);
        boolean retorno = sessao.addIngresso(ingresso);
        if (retorno== true){
            System.out.println("| Ingresso comprado com sucesso                  |");
            cinema.setValorIngressosVendidos(preco);
        }
        else {
            System.out.println("| Numero limite de poltronas atingido            |");
        }
        menuCinema(cinema);
    }
}
