package Strings.BuilderBuffer;

public class Aula8 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        for (String letra : letras){
            alfabeto +=letra;
        }
        System.out.println(alfabeto);

        StringBuffer sb = new StringBuffer(); //Thread safe, StringBuilder não tem
        for (String letra : letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);
    }
}
