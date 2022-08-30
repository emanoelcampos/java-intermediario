package Strings.JuntandoSeparando;

public class Aula7 {

    public static void main(String[] args) {

        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");

        for (String letra : letras){
            System.out.println(letra);
        }

        String doArquivo = "1;Antonio;30";
        String[] infos = doArquivo.split(";");
        for(String info : infos){
            System.out.println(info);
        }
    }
}
