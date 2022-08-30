package Enumeradores.ProjetoCalculadoraComEnum;

public enum Operacao {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

        private String operador;

        Operacao(String operador) {
            this.operador = operador;
        }

        public String getOperador() {
            return operador;
        }

        public void setOperador(String operador) {
            this.operador = operador;
        }

        @Override
        public String toString() {
            return operador;
        }

        public abstract double executarOperacao(double x, double y);

}
