package Strings.ExtraindoChars;

public class Aula3 {

    public static void main(String[] args) {

        String java = "Java";
        for (int i = 0; i < java.length(); i++){
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        java.getChars(0, 3, jav, 0);
        System.out.println(jav);
    }
}
