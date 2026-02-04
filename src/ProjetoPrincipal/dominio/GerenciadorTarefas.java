package ProjetoPrincipal.dominio;

import java.util.Scanner;

public class GerenciadorTarefas {
    public Tarefa[] tarefas = new Tarefa[100];
    public int total = 0;

    private Scanner scanner = new Scanner(System.in);

    public void criartarefa(){
        if (total <= tarefas.length){
            System.out.println("O limite de tarefas foi atingido");
            return;
        }
        System.out.println("Qal tarefa deseja criar? ");
        scanner.nextLine();

        String nome = scanner.nextLine();
        Tarefa novo = new Tarefa(nome);


    }
}
