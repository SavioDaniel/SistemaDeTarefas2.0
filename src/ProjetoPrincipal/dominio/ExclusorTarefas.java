package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class ExclusorTarefas {

    private Scanner scanner = new Scanner(System.in);

    public void excluir(Tarefa[] tarefas, int total) {

        if (total == 0) {
            System.out.println("Nenhuma tarefa para excluir.");
            return;
        }

        // Mostrar tarefas
        for (int i = 0; i < total; i++) {

            String status = tarefas[i].isConcluida()
                    ? "Concluída"
                    : "Pendente";

            System.out.println(
                    (i + 1) + " - " +
                            tarefas[i].getNome() +
                            " [" + status + "]"
            );
        }

        System.out.print("Digite o número da tarefa: ");
        int num = scanner.nextInt();

        if (num < 1 || num > total) {
            System.out.println("Número inválido!");
            return;
        }

        Tarefa tarefa = tarefas[num - 1];

        // Confirmação
        if (!tarefa.isConcluida()) {

            scanner.nextLine();

            System.out.print("A tarefa não está concluída. Tem certeza? (s/n): ");
            String resp = scanner.nextLine();

            if (!resp.equalsIgnoreCase("s")) {
                System.out.println("Exclusão cancelada.");
                return;
            }
        }

        // Remover (organizar array)
        for (int i = num - 1; i < total - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }

        tarefas[total - 1] = null;

        System.out.println("Tarefa excluída!");
    }
}
