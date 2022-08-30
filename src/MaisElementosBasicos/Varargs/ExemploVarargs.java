package MaisElementosBasicos.Varargs;

public class ExemploVarargs {

    public static void main(String[] args) {

        System.out.println(soma(2, 5));
        System.out.println(soma(1,2,3,4,5,6,4,7,54));
    }

    static int soma(int a, int b){
        return a + b;
    }

    static int soma(Integer... vetor){
        int total = 0;
        for(int i=0; i<vetor.length; i++){
            total += vetor[i];
        }
        return total;
    }
}
