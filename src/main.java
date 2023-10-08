public class main {
        String nome;
        String codigo;
        String escolaridade;
    
        main(String nome, String codigo, String escolaridade) {
            this.nome = nome;
            this.codigo = codigo;
            this.escolaridade = escolaridade;
        }
    
        double calcularRenda() {
            double rendaBasica = 1000.00;
    
            if (escolaridade.equals("Ensino Básico")) {
                return rendaBasica * 1.10;
            } else if (escolaridade.equals("Ensino Médio")) {
                return rendaBasica * 1.50;
            } else if (escolaridade.equals("Nível Superior")) {
                return rendaBasica * 2.00;
            } else {
                return rendaBasica;
            }
        }
    }

     class FolhaPagamento {
        public static void main(String[] args) {
            main[] funcionarios = new main[10];
    
            funcionarios[0] = new main("Funcionario_1", "Codigo_1", "Ensino Básico");
            funcionarios[1] = new main("Funcionario_2", "Codigo_2", "Ensino Básico");
            funcionarios[2] = new main("Funcionario_3", "Codigo_3", "Ensino Básico");
            funcionarios[3] = new main("Funcionario_4", "Codigo_4", "Ensino Básico");
            funcionarios[4] = new main("Funcionario_5", "Codigo_5", "Ensino Médio");
            funcionarios[5] = new main("Funcionario_6", "Codigo_6", "Ensino Médio");
            funcionarios[6] = new main("Funcionario_7", "Codigo_7", "Ensino Médio");
            funcionarios[7] = new main("Funcionario_8", "Codigo_8", "Ensino Médio");
            funcionarios[8] = new main("Funcionario_9", "Codigo_9", "Nível Superior");
            funcionarios[9] = new main("Funcionario_10", "Codigo_10", "Nível Superior");
            
          //custo funcionario
            for (int i = 0; i < funcionarios.length; i++) {
                double rendaTotal = funcionarios[i].calcularRenda();
                System.out.println("Funcionário " + (i + 1) + ": Renda Total: R$ " + String.format("%.2f", rendaTotal));
            }

        //custo da empresa
            double custoTotal = 0;
            for (int i = 0; i < funcionarios.length; i++) {
                double rendaTotal = funcionarios[i].calcularRenda();
                custoTotal += rendaTotal;
            }

            System.out.println("Custo Total da Empresa: R$ " + String.format("%.2f", custoTotal));
        }
    }
    






