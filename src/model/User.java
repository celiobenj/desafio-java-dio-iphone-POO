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
                    System.out.println("\n[1] Ligar | [2] Atender | [3] Iniciar Correio de voz");
                    int escolha1 = scanner.nextInt();
                    switch (escolha1) {
                        case 1:
                            System.out.println("Qual número para ligar? ");
                            String numero = scanner.next();
                            iphone.ligar(numero);
                            break;

                        case 2:
                            iphone.atender();
                            break;

                        case 3:
                            iphone.iniciarCorreioVoz();
                            break;

                        default:
                            System.out.println("\nEntrada Invalida, tente novamente\n");
                            break;
                    }

                    break;

                case 2:
                    int escolha2 = 2, cont = 0;
                    do {
                        if (escolha2 == 2) {
                            if (cont != 0)
                                iphone.adicionarNovaAba();
                            System.out.println("\nDigite a URL do site: ");
                            String url = scanner.next();
                            iphone.exibirPagina(url);
                            cont++;
                        }
                        System.out.println("\n[1] Atualizar página | [2] Adicionar nova aba | [0] Sair");
                        escolha2 = scanner.nextInt();
                        if (escolha2 == 1)
                            iphone.atualizarPagina();
                    } while (escolha2 != 0);

                    break;

                case 3:
                    System.out.println("\nEscreva o nome da música: ");
                    iphone.selecionarMusica(scanner.next());
                    int escolha3;
                    do {
                        System.out.println("[1] Pausar | [0] Sair");
                        escolha3 = scanner.nextInt();
                        while (escolha3 == 1) {
                            iphone.pausar();
                            System.out.println("[2] Continuar | [0] Sair");
                            escolha3 = scanner.nextInt();
                            if (escolha3 == 2)
                                System.out.println("\nContinuando música");
                        }
                    } while (escolha3 != 0);
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
