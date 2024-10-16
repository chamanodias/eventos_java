import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEventos {
    private List<Evento> eventos;

    public GerenciadorDeEventos() {
        this.eventos = new ArrayList<>();
    }

    // Método para cadastrar um novo evento
    public void cadastrarEvento(String nome, String data, Local local) {
        Evento novoEvento = new Evento(nome, data, local);
        eventos.add(novoEvento);
        System.out.println("Evento \"" + nome + "\" cadastrado com sucesso!");
    }

    // Método para registrar um participante em um evento
    public void registrarParticipante(String nomeEvento, Participante participante) {
        Evento evento = buscarEventoPorNome(nomeEvento);
        if (evento != null) {
            boolean sucesso = evento.registrarParticipante(participante);
            if (sucesso) {
                System.out.println("Participante \"" + participante.getNome() + "\" registrado com sucesso no evento \"" + nomeEvento + "\".");
            }
        } else {
            System.out.println("Evento \"" + nomeEvento + "\" não encontrado.");
        }
    }

    // Método para verificar a lotação de um evento
    public void verificarLotacao(String nomeEvento) {
        Evento evento = buscarEventoPorNome(nomeEvento);
        if (evento != null) {
            int capacidade = evento.getLocal().getCapacidade();
            int inscritos = evento.getParticipantes().size();
            System.out.println("Evento: " + evento.getNome());
            System.out.println("Capacidade: " + capacidade);
            System.out.println("Participantes inscritos: " + inscritos);
            System.out.println(inscritos >= capacidade ? "Status: Lotado" : "Status: Vagas disponíveis");
        } else {
            System.out.println("Evento \"" + nomeEvento + "\" não encontrado.");
        }
    }

    // Método auxiliar para buscar um evento pelo nome
    private Evento buscarEventoPorNome(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null;
    }
}
