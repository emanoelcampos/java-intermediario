package Strings.Modificando;

public class Aula6 {

    public static void main(String[] args) {

        String teste = "Isso é um teste.";
        System.out.println(teste);
        System.out.println(teste.substring(11));
        System.out.println(teste.substring(11, 16));

        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

    }
}
