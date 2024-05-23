package model;

import java.util.Scanner;

import dispositivo.iPhone;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        iPhone iphone = new iPhone();

        int opção = -1;

        System.out.println("\nOlá, seja muito bem-vindo(a), vamos começar com seu novo iPhone!\n");
        System.out.println("Primeiramente, qual é o seu nome? ");
        iphone.setNomeUsuário(scanner.next());
        System.out.println("\nOlá " + iphone.getNomeUsuário() + " é um prazer te conhecer\n");

        do {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1: Acessar Aparelho Telefônico");
            System.out.println("2: Acessar Navegador de Internet");
            System.out.println("3: Acessar Reprodutor Musical");
            System.out.println("0: Desligar o iPhone");

            opção = scanner.nextInt();

            switch (opção) {
                case 1:
                    
                    break;

                case 2:

                    break;

                case 3:
                    iphone.selecionarMusica(scanner.next());
                    System.out.println("[1] Pausar; [0] Sair");
                    int aux = scanner.nextInt();
                    // while (aux != 0) {
                        
                    // }
                    break;

                case 0:
                    System.out.println("Desligando iPhone");
                    break;

                default:
                    System.out.println("\nEntrada Invalida, tente novamente\n");
                    break;
            }

        } while (opção != 0);

        System.out.println("iPhone desligado");
        scanner.close();
    }
}
