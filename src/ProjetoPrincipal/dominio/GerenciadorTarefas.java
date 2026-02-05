package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class GerenciadorTarefas {

    private Tarefa[] tarefas = new Tarefa[100];
    private int total = 0;

    private Scanner scanner = new Scanner(System.in);

    public void criarTarefa() {

        if (total >= tarefas.length) {
            System.out.println("Limite atingido!");
            return;
        }

        System.out.print("Nome da tarefa: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        tarefas[total] = new Tarefa(nome);
        total++;

        System.out.println("Tarefa criada!");
    }

    public void listarTarefas() {

        if (total == 0) {
            System.out.println("Nenhuma tarefa.");
            return;
        }

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
    }

    public void concluirTarefa() {

        listarTarefas();

        if (total == 0) return;

        System.out.print("Número: ");
        int num = scanner.nextInt();

        if (num < 1 || num > total) {
            System.out.println("Inválido!");
            return;
        }

        tarefas[num - 1].concluir();

        System.out.println("Concluída!");
    }

    public int getTotal() {
        return total;
    }

    public Tarefa getTarefa(int pos) {
        return tarefas[pos];
    }

    public void remover(int pos) {

        for (int i = pos; i < total - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }

        tarefas[total - 1] = null;
        total--;

    }
}
