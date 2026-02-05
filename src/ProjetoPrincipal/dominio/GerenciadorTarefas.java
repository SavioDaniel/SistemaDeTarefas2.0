package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class GerenciadorTarefas {

    private Tarefa[] tarefas = new Tarefa[100];
    private int total = 0;

    private Scanner scanner = new Scanner(System.in);

    // CRIAR
    public void criarTarefa() {

        if (total >= tarefas.length) {
            System.out.println("Limite de tarefas atingido!");
            return;
        }

        System.out.print("Digite o nome da tarefa: ");
        scanner.nextLine(); // limpar buffer
        String nome = scanner.nextLine();

        Tarefa nova = new Tarefa(nome);

        tarefas[total] = nova;
        total++;

        System.out.println("Tarefa criada com sucesso!");
    }

    // LISTAR
    public void listarTarefas() {

        if (total == 0) {
            System.out.println("Nenhuma tarefa cadastrada.");
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

    // CONCLUIR
    public void concluirTarefa() {

        listarTarefas();

        if (total == 0) return;

        System.out.print("Digite o número da tarefa: ");
        int num = scanner.nextInt();

        if (num < 1 || num > total) {
            System.out.println("Número inválido!");
            return;
        }

        tarefas[num - 1].concluir();

        System.out.println("Tarefa concluída!");
    }

    // ==============================
    // MÉTODOS PARA OUTRAS CLASSES
    // ==============================

    // Retorna total de tarefas
    public int getTotal() {
        return total;
    }

    // Retorna uma tarefa pela posição
    public Tarefa getTarefa(int pos) {
        return tarefas[pos];
    }

    // Remove tarefa
    public void remover(int pos) {

        for (int i = pos; i < total - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }

        tarefas[total - 1] = null;
        total--;
    }
}
