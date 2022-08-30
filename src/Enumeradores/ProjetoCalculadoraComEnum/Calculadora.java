package Enumeradores.ProjetoCalculadoraComEnum;

public class Calculadora {

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op + " ");
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x,y));
        }
    }
}
