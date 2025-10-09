public class ControleRemoto {
    
    private televisor tv;

    public ControleRemoto(televisor tv) {
        this.tv = tv;
    }

    public void setTelevisor(televisor tv) {
        this.tv = tv;
        System.out.println("selecione uma TV: " + (tv == null ? "nenhuma" : getTvNumber(tv)));
        
            
    }

    public televisor getTelevisor() {
        return this.tv;
    }

    public void ligar() {
        if (tv != null) tv.ligar(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void desligar() {
        if (tv != null) tv.desligar(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void aumentarVolume() {
        if (tv != null) tv.aumentarVolume(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void diminuirVolume() {
        if (tv != null) tv.diminuirVolume(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void mudarCanal(int numero) {
        if (tv != null) tv.mudarCanal(numero); else System.out.println("Nenhuma TV selecionada.");
    }

    public void mudarCanalPorNome(String nome) {
        if (tv != null) tv.mudarCanalPorNome(nome); else System.out.println("Nenhuma TV selecionada.");
    }

    public void proximoCanal() {
        if (tv != null) tv.proximoCanal(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void canalAnterior() {
        if (tv != null) tv.canalAnterior(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void adicionarCanal(canal c) {
        if (tv != null) tv.adicionarCanal(c); else System.out.println("Nenhuma TV selecionada.");
    }

    public void listarCanais() {
        if (tv != null) tv.listarCanais(); else System.out.println("Nenhuma TV selecionada.");
    }

    public void mostrarCanalAtual() {
        if (tv != null) tv.mostrarCanalAtual(); else System.out.println("Nenhuma TV selecionada.");
    }

    public java.util.List<canal> buscarCanaisPorNome(String nome) {
        if (tv != null) return tv.buscarCanaisPorNome(nome);
        System.out.println("Nenhuma TV selecionada.");
        return new java.util.ArrayList<>();
    }

    private int getTvNumber(televisor t) {
        try {
            java.lang.reflect.Field f = televisor.class.getDeclaredField("numeroTv");
            f.setAccessible(true);
            return f.getInt(t);
        } catch (Exception e) {
            return -1;
        }
    }
}
