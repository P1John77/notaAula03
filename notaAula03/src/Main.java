import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Animal");
            System.out.println("2 - Médico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido!");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Escolha uma opção (0, 1 ou 2): ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    menuAnimal(scanner);
                    break;
                case 2:
                    menuMedico(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 0);

        scanner.close();
    }

    private static void menuAnimal(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n=== MENU ANIMAL ===");
            System.out.println("1 - Cavalo");
            System.out.println("2 - Leão");
            System.out.println("0 - Voltar");
            System.out.print("Escolha um animal: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido!");
                scanner.next();
                System.out.print("Escolha um animal (0, 1 ou 2): ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    interagirComCavalo(scanner);
                    break;
                case 2:
                    interagirComLeao(scanner);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 0);
    }

    private static void menuMedico(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n=== MENU MÉDICO ===");
            System.out.println("1 - Clínico Geral");
            System.out.println("2 - Cirurgião");
            System.out.println("0 - Voltar");
            System.out.print("Escolha um tipo de médico: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido!");
                scanner.next();
                System.out.print("Escolha um tipo de médico (0, 1 ou 2): ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    interagirComClinicoGeral(scanner);
                    break;
                case 2:
                    interagirComCirurgiao(scanner);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 0);
    }

    private static void interagirComCirurgiao(Scanner scanner) {
        Cirurgiao cirurgiao = new Cirurgiao();
        System.out.println("\n=== CIRURGIÃO ===");

        System.out.print("O cirurgião trabalha no hospital? (sim/não): ");
        String resposta = scanner.nextLine();
        while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não") && !resposta.equalsIgnoreCase("nao")) {
            System.out.println("Por favor, digite 'sim' ou 'não': ");
            resposta = scanner.nextLine();
        }
        cirurgiao.trabalhaNoHospital = resposta.equalsIgnoreCase("sim");

        System.out.println("\n=== AÇÕES REALIZADAS ===");
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();

        System.out.println("\n=== INFORMAÇÕES ===");
        System.out.println("Trabalha no hospital: " + (cirurgiao.trabalhaNoHospital ? "Sim" : "Não"));

        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void interagirComLeao(Scanner scanner) {
        Leao leao = new Leao();
        System.out.println("\nVocê escolheu o Leão.");

        System.out.print("O leão tem juba? (sim/não): ");
        String resposta = scanner.nextLine();
        while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não") && !resposta.equalsIgnoreCase("nao")) {
            System.out.println("Por favor, digite 'sim' ou 'não': ");
            resposta = scanner.nextLine();
        }
        leao.setJuba(resposta.equalsIgnoreCase("sim"));

        System.out.print("Digite o tamanho do leão: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("Por favor, digite um número válido!");
            scanner.next();
            System.out.print("Digite o tamanho do leão: ");
        }
        leao.tamanho = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Digite a cor do leão: ");
        leao.cor = scanner.nextLine();

        System.out.println("\n=== AÇÕES DO LEÃO ===");
        leao.comer();
        leao.cacar();

        System.out.println("\nInformações do leão:");
        System.out.println("Tem juba: " + (leao.isJuba() ? "Sim" : "Não"));
        System.out.println("Tamanho: " + leao.tamanho);
        System.out.println("Cor: " + leao.cor);
    }

    private static void interagirComClinicoGeral(Scanner scanner) {
        ClinicoGeral clinico = new ClinicoGeral();
        System.out.println("\nVocê escolheu o Clínico Geral.");

        System.out.print("O clínico trabalha no hospital? (sim/não): ");
        String respostaHospital = scanner.nextLine();
        while (!respostaHospital.equalsIgnoreCase("sim") && !respostaHospital.equalsIgnoreCase("não") && !respostaHospital.equalsIgnoreCase("nao")) {
            System.out.println("Por favor, digite 'sim' ou 'não': ");
            respostaHospital = scanner.nextLine();
        }
        clinico.trabalhaNoHospital = respostaHospital.equalsIgnoreCase("sim");

        System.out.print("O clínico atende em casa? (sim/não): ");
        String respostaCasa = scanner.nextLine();
        while (!respostaCasa.equalsIgnoreCase("sim") && !respostaCasa.equalsIgnoreCase("não") && !respostaCasa.equalsIgnoreCase("nao")) {
            System.out.println("Por favor, digite 'sim' ou 'não': ");
            respostaCasa = scanner.nextLine();
        }
        clinico.setAtendeEmCasa(respostaCasa.equalsIgnoreCase("sim"));

        System.out.println("\n=== AÇÕES DO CLÍNICO GERAL ===");
        clinico.tratarPaciente();
        clinico.receitar();

        System.out.println("\nInformações do clínico:");
        System.out.println("Trabalha no hospital: " + (clinico.trabalhaNoHospital ? "Sim" : "Não"));
        System.out.println("Atende em casa: " + (clinico.isAtendeEmCasa() ? "Sim" : "Não"));
    }

    private static void interagirComCavalo(Scanner scanner) {
        Cavalo cavalo = new Cavalo();
        System.out.println("\nVocê escolheu o Cavalo.");

        System.out.print("Digite a raça do cavalo: ");
        cavalo.setRaca(scanner.nextLine());

        System.out.print("Digite o tamanho do cavalo: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("Por favor, digite um número válido!");
            scanner.next();
            System.out.print("Digite o tamanho do cavalo: ");
        }
        cavalo.tamanho = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Digite a cor do cavalo: ");
        cavalo.cor = scanner.nextLine();

        System.out.println("\n=== AÇÕES DO CAVALO ===");
        cavalo.comer();
        cavalo.fugir();

        System.out.println("\nInformações do cavalo:");
        System.out.println("Raça: " + cavalo.getRaca());
        System.out.println("Tamanho: " + cavalo.tamanho);
        System.out.println("Cor: " + cavalo.cor);
    }
}