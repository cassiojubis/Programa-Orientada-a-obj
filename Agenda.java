import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }
        
        System.out.println("\nLista de Contatos:");
        System.out.println("------------------------");
        for (Contato contato : contatos) {
            contato.imprimirContato();
        }
    }

    public int getTotalContatos() {
        return contatos.size();
    }
}