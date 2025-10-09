import java.util.ArrayList;
import java.util.List;
public class televisor{
   private int numeroTv;
    private int volume;
    private canal canalAtual;
    private ArrayList<canal> canais;
    private boolean ligada;

    public televisor(int numeroTv) {
        this.numeroTv = numeroTv;
        this.volume = 100;
        this.canalAtual = null;
        this.canais = new ArrayList<>();
        this.ligada = false;

    }
   
       
    

public void ligaDesliga (){
    this.ligada = !this.ligada;
     if (this.ligada) {
        System.out.println("A televisão foi ligada!");
     } else {
        System.out.println("A televisão foi desligada!");
     }
}


    public void ligar() {
        this.ligada = true;
        System.out.println("Televisor " + this.numeroTv + " ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Televisor " + this.numeroTv + " desligada.");
    }

    public void aumentarVolume() {
        if(this.ligada) {
            if(this.volume < 100) {
                this.volume++;
            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Televisor desligada. Ligue a TV para ajustar o volume.");
        }
    }
    public void diminuirVolume() {
        if(this.ligada) {
            if(this.volume > 0) {
                this.volume--;
            }
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("Televisor desligada. Ligue a TV para ajustar o volume.");
        }
    }
    public void adicionarCanal(canal canal) {
        this.canais.add(canal);
        System.out.println("Canal " + canal.getNome() + " adicionado.");
    }
    public void mudarCanal(int numero) {
        if(this.ligada) {
            for(canal c : this.canais) {
                if(c.getNumero() == numero) {
                    this.canalAtual = c;
                    System.out.println("Canal atual: " + c.getNome());
                    return;
                }
            }
            System.out.println("Canal não encontrado.");
        } else {
            System.out.println("Televisor desligada. Ligue a TV para mudar de canal.");
        }
    }
    public void mostrarCanalAtual() {
        if(this.ligada) {
            if(this.canalAtual != null) {
                System.out.println("Canal atual: " + this.canalAtual.getNome());
            } else {
                System.out.println("Nenhum canal selecionado.");
            }
        } else {
            System.out.println("Televisor desligada. Ligue a TV para ver o canal atual.");
        }
         }
         public void listarCanais() {
            if(this.ligada) {
                System.out.println("Canais disponíveis:");
                for(canal c : this.canais) {
                    System.out.println("Canal " + c.getNumero() + ": " + c.getNome());
                }
            } else {
                System.out.println("Televisor desligada. Ligue a TV para ver os canais disponíveis.");
            }
         }
          public void TrocarCanal(canal canal) {
            if(this.ligada) {
                this.canalAtual = canal;
                System.out.println("Canal atual: " + canal.getNome());
            } else {
                System.out.println("Televisor desligada. Ligue a TV para mudar de canal.");
            }
          }
          public void InformacoesTv() {
            System.out.println("Número da TV: " + this.numeroTv);
            System.out.println("Volume: " + this.volume);
            if(this.canalAtual != null) {
                System.out.println("Canal atual: " + this.canalAtual.getNome());
            } else {
                System.out.println("Nenhum canal selecionado.");
            }
            System.out.println("Estado: " + (this.ligada ? "Ligada" : "Desligada"));
          }

          // Muda canal por nome (case-insensitive, aceita parte do nome)
          public void mudarCanalPorNome(String nome) {
            if (this.ligada) {
                if (nome == null || nome.isEmpty()) {
                    System.out.println("Nome de canal inválido.");
                    return;
                }
                String procurar = nome.toLowerCase();
                for (canal c : this.canais) {
                    if (c.getNome().toLowerCase().contains(procurar)) {
                        this.canalAtual = c;
                        System.out.println("Canal atual: " + c.getNome());
                        return;
                    }
                }
                System.out.println("Canal não encontrado.");
            } else {
                System.out.println("Televisor desligada. Ligue a TV para mudar de canal.");
            }
          }

                    // Retorna lista de canais que contenham a string nome (case-insensitive)
                    public List<canal> buscarCanaisPorNome(String nome) {
                        List<canal> encontrados = new ArrayList<>();
                        if (nome == null || nome.isEmpty()) return encontrados;
                        String procurar = nome.toLowerCase();
                        for (canal c : this.canais) {
                                if (c.getNome().toLowerCase().contains(procurar)) {
                                        encontrados.add(c);
                                }
                        }
                        return encontrados;
                    }

          // Avança para o próximo canal da lista (circular)
          public void proximoCanal() {
            if (this.ligada) {
                if (this.canais.isEmpty()) {
                    System.out.println("Nenhum canal disponível.");
                    return;
                }
                int idx = -1;
                if (this.canalAtual != null) idx = this.canais.indexOf(this.canalAtual);
                int next = (idx + 1) % this.canais.size();
                this.canalAtual = this.canais.get(next);
                System.out.println("Canal atual: " + this.canalAtual.getNome());
            } else {
                System.out.println("Televisor desligada. Ligue a TV para mudar de canal.");
            }
          }

          // Volta para o canal anterior da lista (circular)
          public void canalAnterior() {
            if (this.ligada) {
                if (this.canais.isEmpty()) {
                    System.out.println("Nenhum canal disponível.");
                    return;
                }
                int idx = -1;
                if (this.canalAtual != null) idx = this.canais.indexOf(this.canalAtual);
                int prev = (idx - 1 + this.canais.size()) % this.canais.size();
                this.canalAtual = this.canais.get(prev);
                System.out.println("Canal atual: " + this.canalAtual.getNome());
            } else {
                System.out.println("Televisor desligada. Ligue a TV para mudar de canal.");
            }
          }


}