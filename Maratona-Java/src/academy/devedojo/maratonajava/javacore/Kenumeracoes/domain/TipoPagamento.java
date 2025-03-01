package academy.devedojo.maratonajava.javacore.Kenumeracoes.domain;

public enum TipoPagamento {
        DEBITO(1, "Débito") {
            @Override
            public double calcularDesconto(double valorDesconto) {
                return valorDesconto * 0.1;
            }
        }, CREDITO(2, "Crédito") {
        @Override
        public double calcularDesconto(double valorDesconto) {
            return valorDesconto * 0.05;
        }
    };

        private int valor;
        private String nomeRelatorio;

        TipoPagamento (int valor, String nomeRelatorio) {
            this.valor = valor;
            this.nomeRelatorio = nomeRelatorio;
        }

        public int getValor() {
            return valor;
        }

        public String getNomeRelatorio() {
            return nomeRelatorio;
        }

        public double calcularDesconto(double valorDesconto) {
            return 0;
        }
    }