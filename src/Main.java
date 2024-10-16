import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();

        System.out.println("=====================================");
        System.out.println("   Cadastro de Eventos");
        System.out.println("=====================================");
        
        // Coletando informações do evento
        System.out.print("Informe o nome do evento: ");
        String nomeEvento = scanner.nextLine();

        System.out.print("Informe a data do evento (ex: 20/10/2024): ");
        String dataEvento = scanner.nextLine();

        System.out.print("Informe o nome do local: ");
        String nomeLocal = scanner.nextLine();

        System.out.print("Informe o endereço do local: ");
        String enderecoLocal = scanner.nextLine();

        System.out.print("Informe a capacidade do local: ");
        int capacidadeLocal = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Criando o local e cadastrando o evento
        Local local = new Local(nomeLocal, enderecoLocal, capacidadeLocal);
        gerenciador.cadastrarEvento(nomeEvento, dataEvento, local);

        System.out.println("\n=====================================");
        System.out.println("   Cadastro de Participantes");
        System.out.println("=====================================");
        
        // Loop para registrar participantes
        String resposta;
        do {
            System.out.print("Deseja cadastrar um participante? (s/n): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Informe o nome do participante: ");
                String nomeParticipante = scanner.nextLine();

                System.out.print("Informe o email do participante: ");
                String emailParticipante = scanner.nextLine();

                Participante participante = new Participante(nomeParticipante, emailParticipante);
                gerenciador.registrarParticipante(nomeEvento, participante);
            }
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("\n=====================================");
        System.out.println("   Verificação de Lotação");
        System.out.println("=====================================");
        
        // Verificando a lotação do evento após cadastro de participantes
        gerenciador.verificarLotacao(nomeEvento);
        
        // Fechando o scanner
        scanner.close();
    }
}
