import iphone.classes.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        int acao;

        do {
            System.out.println("Seleciona o que deseja fazer: \n1 - Reprodutor Musical \n2 - Aparelho Telefonico \n3 - Navegador Internet\n4 - Sair");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.println("Qual música você deseja ouvir?");
                    var musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);

                    System.out.println("\nDeseja pausar?\n1 - Sim \n2- Não");
                    var pausar = scanner.nextInt();

                    if (pausar == 1) {
                        iphone.pausar();
                    } else if (pausar == 2) {
                        iphone.tocar();
                    } else {
                        System.out.println("Opção não existe!");
                    }
                    break;
                case 2:
                    System.out.println("O que deseja fazer?\n1 - Ligar\n2 - Atender\n3 - Iniciar correio de voz");
                    var aparelhoTelefonico = scanner.nextInt();

                    switch (aparelhoTelefonico) {
                        case 1:
                            System.out.println("Informe o número:");
                            var numero = scanner.nextLine();

                            iphone.ligar(numero);
                            break;
                        case 2:
                            iphone.atender();
                            break;
                        case 3:
                            iphone.iniciarCorreioVoz();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Informe a url:");
                    var url = scanner.next();
                    iphone.exibirPagina(url);

                    System.out.println("O que deseja fazer agora?\n1 - Adicionar nova aba\n2 - Atualizar Página");
                    var acoesNavegador = scanner.nextInt();

                    if (acoesNavegador == 1) {
                        iphone.adicionarNovaAba();
                    } else if (acoesNavegador == 2) {
                        iphone.atualizarPagina();
                    } else {
                        System.out.println("Opção não existe");
                    }

                    break;
            }
        } while (acao != 4);

        scanner.close();
    }
}