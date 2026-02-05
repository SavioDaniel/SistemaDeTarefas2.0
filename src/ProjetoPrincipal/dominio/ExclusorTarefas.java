package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class ExclusorTarefas {

    private Scanner scanner = new Scanner(System.in);

    public void excluir(GerenciadorTarefas ger) {

        if (ger.total == 0) {
            System.out.println("Nenhuma tarefa para excluir.");
            return;
        }

        // Listar
        for (int i = 0; i < ger.total; i++) {

            String status = ger.tarefas[i].isConcluida()
                    ? "Concluída"
                    : "Pendente";

            System.out.println(
                    (i + 1) + " - " +
                            ger.tarefas[i].getNome() +
                            " [" + status + "]"
            );
        }

        System.out.print("Digite o número da tarefa: ");
        int num = scanner.nextInt();

        if (num < 1 || num > ger.total) {
            System.out.println("Número inválido!");
            return;
        }

        Tarefa tarefa = ger.tarefas[num - 1];

        // Confirmação
        if (!tarefa.isConcluida()) {

            scanner.nextLine();

            System.out.print("Tem certeza? (s/n): ");
            String resp = scanner.nextLine();

            if (!resp.equalsIgnoreCase("s")) {
                System.out.println("Exclusão cancelada.");
                return;
            }
        }

        // Remover
        for (int i = num - 1; i < ger.total - 1; i++) {
            ger.tarefas[i] = ger.tarefas[i + 1];
        }

        ger.tarefas[ger.total - 1] = null;
        ger.total--;

        System.out.println("Tarefa excluída com sucesso!");
    }
}
