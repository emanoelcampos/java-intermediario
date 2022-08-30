package classes.utilitarias.enumeradores.como.classes;

public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

//Enum extends a classe java.lang.Enum
//podem ser comparadas usando ==
//não podem ser instanciadas com new
//implementam interfaces
//declarado separadamente ou dentro de classe
