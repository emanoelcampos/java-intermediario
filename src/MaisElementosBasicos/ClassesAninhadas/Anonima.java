package MaisElementosBasicos.ClassesAninhadas;

public class Anonima { //Collections (comparar objetos, entre outros)

    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }

    public static void main(String[] args) {

        Anonima anonima = new Anonima(){
            public void imprimeTexto(){
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        Texto texto = () -> System.out.println("qualquer texto - interface");

        texto.imprimeTexto();
    }
}
