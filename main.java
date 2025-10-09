
public class main {
    public static void main(String[] args) {
    televisor tv1 = new televisor(1);
        canal canal1 = new canal("Familia Sacana", 1);
        canal canal2 = new canal("PlayBoy Tv", 2);
        canal canal3 = new canal("Cultura Cannabis", 3);

        tv1.adicionarCanal(canal1);
        tv1.adicionarCanal(canal2);
        tv1.adicionarCanal(canal3);

    televisor tv2 = new televisor(2);
    tv2.adicionarCanal(canal3);
    tv2.adicionarCanal(canal1);
    tv2.adicionarCanal(canal3);

    java.util.List<televisor> tvs = new java.util.ArrayList<>();
    tvs.add(tv1);
    tvs.add(tv2);

        // Criar controle e apontar inicialmente para nenhuma TV
        ControleRemoto controle = new ControleRemoto(null);

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            boolean sair = false;
            while (!sair) {
                System.out.println("\n=== Menu do Controle ===");
                System.out.println("1) Apontar controle para TV por índice");
                System.out.println("2) Apontar controle para TV por número");
                System.out.println("3) Ligar");
                System.out.println("4) Desligar");
                System.out.println("5) Listar canais");
                System.out.println("6) Mudar canal por número");
                System.out.println("7) Buscar canal por nome e escolher");
                System.out.println("8) Próximo canal");
                System.out.println("9) Canal anterior");
                System.out.println("0) Voltar / Sair");
                System.out.print("Escolha: ");
                String op = sc.nextLine().trim();
                switch (op) {
                    case "1" -> {
                        // listar TVs e escolher por índice
                        System.out.println("TVs disponíveis:");
                        for (int i = 0; i < tvs.size(); i++) {
                            System.out.printf("[%d] TV número: %d\n", i, getTvNumber(tvs.get(i)));
                        }
                        System.out.print("Digite o índice da TV: ");
                        String s = sc.nextLine().trim();
                        try {
                            int idx = Integer.parseInt(s);
                            if (idx < 0 || idx >= tvs.size()) {
                                System.out.println("Índice inválido.");
                            } else {
                                controle.setTelevisor(tvs.get(idx));
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido.");
                        }
                    }
                    case "2" -> {
                        System.out.print("Digite o número da TV: ");
                        String s = sc.nextLine().trim();
                        try {
                            int n = Integer.parseInt(s);
                            boolean achou = false;
                            for (televisor t : tvs) {
                                if (getTvNumber(t) == n) {
                                    controle.setTelevisor(t);
                                    achou = true;
                                    break;
                                }
                            }
                            if (!achou) System.out.println("TV não encontrada.");
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido.");
                        }
                    }
                    case "3" -> controle.ligar();
                    case "4" -> controle.desligar();
                    case "5" -> controle.listarCanais();
                    case "6" -> {
                        System.out.print("Número do canal: ");
                        String n = sc.nextLine().trim();
                        try { controle.mudarCanal(Integer.parseInt(n)); } catch (NumberFormatException e) { System.out.println("Número inválido."); }
                    }
                    case "7" -> {
                        System.out.print("Digite parte do nome do canal: ");
                        String termo = sc.nextLine().trim();
                        java.util.List<canal> encontrados = controle.buscarCanaisPorNome(termo);
                        if (encontrados.isEmpty()) {
                            System.out.println("Nenhuma correspondência encontrada.");
                        } else {
                            System.out.println("Correspondências:");
                            for (int i = 0; i < encontrados.size(); i++) {
                                canal c = encontrados.get(i);
                                System.out.printf("[%d] %d - %s\n", i, c.getNumero(), c.getNome());
                            }
                            System.out.print("Escolha o índice da correspondência desejada: ");
                            String idxS = sc.nextLine().trim();
                            try {
                                int idx = Integer.parseInt(idxS);
                                if (idx < 0 || idx >= encontrados.size()) System.out.println("Índice inválido.");
                                else controle.mudarCanal(encontrados.get(idx).getNumero());
                            } catch (NumberFormatException ex) { System.out.println("Número inválido."); }
                        }
                    }
                    case "8" -> controle.proximoCanal();
                    case "9" -> controle.canalAnterior();
                    case "0" -> sair = true;
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }

    private static int getTvNumber(televisor t) {
        try {
            java.lang.reflect.Field f = televisor.class.getDeclaredField("numeroTv");
            f.setAccessible(true);
            return f.getInt(t);
        } catch (Exception e) {
            return -1;
        }
    }

}

