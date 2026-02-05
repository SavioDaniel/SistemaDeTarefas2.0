package ProjetoPrincipal.test;

import ProjetoPrincipal.dominio.GerenciadorTarefas;
import java.util.Scanner;

public class TarefasTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        while (true) {

            System.out.println("\n--------- MENU ---------");
            System.out.println("1. Criar tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Excluir tarefa");
            System.out.println("4. Listar tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    gerenciador.criarTarefa();
                    break;

                case 2:
                    gerenciador.concluirTarefa();
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa: ");
                    int num = scanner.nextInt();

                    // CORRIGIDO AQUI
                    gerenciador.remover(num - 1);

                    break;

                case 4:
                    gerenciador.listarTarefas();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
