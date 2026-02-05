package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class ExclusorTarefas {

    private Scanner scanner = new Scanner(System.in);

    public void excluir(GerenciadorTarefas ger) {

        if (ger.getTotal() == 0) {
            System.out.println("Nenhuma tarefa para excluir.");
            return;
        }

        for (int i = 0; i < ger.getTotal(); i++) {

            Tarefa t = ger.getTarefa(i);

            String status = t.isConcluida()
                    ? "Concluída"
                    : "Pendente";

            System.out.println(
                    (i + 1) + " - " +
                            t.getNome() +
                            " [" + status + "]"
            );
        }

        System.out.print("Digite o número da tarefa: ");
        int num = scanner.nextInt();

        if (num < 1 || num > ger.getTotal()) {
            System.out.println("Número inválido!");
            return;
        }

        Tarefa tarefa = ger.getTarefa(num - 1);

        scanner.nextLine();

        if (!tarefa.isConcluida()) {

            System.out.print("Tem certeza? (s/n): ");
            String resp = scanner.nextLine();

            if (!resp.equalsIgnoreCase("s")) {
                System.out.println("Exclusão cancelada.");
                return;
            }
        }

        ger.remover(num - 1);

        System.out.println("Tarefa excluída com sucesso!");
    }
}
