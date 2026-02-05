package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class GerenciadorTarefas {

    // AGORA PUBLIC
    public Tarefa[] tarefas = new Tarefa[100];
    public int total = 0;

    private Scanner scanner = new Scanner(System.in);

    // CRIAR
    public void criarTarefa() {

        if (total >= tarefas.length) {
            System.out.println("Limite de tarefas atingido!");
            return;
        }

        System.out.print("Digite o nome da tarefa: ");
        scanner.nextLine();
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
}
