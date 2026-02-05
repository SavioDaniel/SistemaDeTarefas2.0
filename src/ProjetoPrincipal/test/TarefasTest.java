package ProjetoPrincipal.test;

import ProjetoPrincipal.dominio.GerenciadorTarefas;
import ProjetoPrincipal.dominio.ExclusorTarefas;

import java.util.Scanner;

public class TarefasTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GerenciadorTarefas ger = new GerenciadorTarefas();
        ExclusorTarefas exclusor = new ExclusorTarefas();

        while (true) {

            System.out.println("\n------ MENU ------");
            System.out.println("1 - Criar");
            System.out.println("2 - Concluir");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int op = scanner.nextInt();

            switch (op) {

                case 1:
                    ger.criarTarefa();
                    break;

                case 2:
                    ger.concluirTarefa();
                    break;

                case 3:
                    exclusor.excluir(ger);
                    break;

                case 4:
                    ger.listarTarefas();
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
