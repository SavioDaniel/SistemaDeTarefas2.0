package ProjetoPrincipal.test;
import ProjetoPrincipal.dominio.GerenciadorTarefas;

import java.util.Scanner;


public class TarefasTest {
    static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     GerenciadorTarefas gerenciartarefas = new GerenciadorTarefas();

     while (true) {

         System.out.println("--------------Bem-vindo ao MENU--------------");
         System.out.println("1. Criar tarefa");
         System.out.println("2. Concluir tarefa");
         System.out.println("3. Excluir tarefa");
         System.out.println("4. Listar tarefa");
         System.out.println("5. Sair");
         System.out.println("Escolha a opção desejada");
         int opcao = scanner.nextInt();

         switch (opcao) {

             case 1: {
                 gerenciartarefas.concluirTarefa();
                 break;
             }
             case 2: {
                 gerenciartarefas.concluirTarefa();
                 break;
             }
             case 3: {
                 System.out.println("Você escolheu a opção 3. Excluir tarefa");
                 break;
             }
             case 4: {
                 gerenciartarefas.listarTarefas();
                 break;
             }
             case 5: {
                 System.out.println("Você escolheu a opção 5. Sair");
                 scanner.close();
                 return;
             }
             default: {
                 System.out.println("Você não escolheu nenhum número do menu");
             }

         }
         System.out.println();

     }
    }
}
