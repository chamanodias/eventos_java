import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private Local local;
    private List<Participante> participantes;

    public Evento(String nome, String data, Local local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    public boolean registrarParticipante(Participante participante) {
        if (participantes.size() < local.getCapacidade()) {
            participantes.add(participante);
            return true;
        } else {
            System.out.println("Evento lotado! Não foi possível registrar o participante " + participante.getNome());
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public Local getLocal() {
        return local;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
