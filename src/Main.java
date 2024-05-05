import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sala sala = new Sala("A1", 10);
        Filme filme = new Filme("A volta de quem não foi", "Strash");
        Sessao sessao = new Sessao(filme,sala.getLugares(),"22:00");
        sala.addSessao(sessao);
        Cliente cliente = new Cliente("Raul Gil Bolado","40028922");
        Ingresso ingresso = new Ingresso(sessao, cliente);
        sessao.addIngresso(ingresso);

        System.out.println("--------------------------------------------------");
        System.out.println("| Menu Gerenciamento do Cinema                   |");
        System.out.println("| 1.Vender Ingresso                              |");
        System.out.println("| 2.Agendar Sessões                              |");
        System.out.println("| 3.Ingressos Vendidos                           |");
        System.out.println("--------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Sessões disponiveis");
                sala.imprimirSessoes();
                System.out.println("Escolha uma entre as disponiveis");
                opcao = scanner.nextInt();
                break;

            case 2:


                break;

            case 3:


                break;

            case 4:


                break;

        }





    }
}