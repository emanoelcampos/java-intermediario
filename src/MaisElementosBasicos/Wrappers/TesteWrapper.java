package MaisElementosBasicos.Wrappers;

public class TesteWrapper {
    public static void main(String[] args) {

        //tipos primitivos:
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000L;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';


        Short nShort = (short) 1;
        Byte nByte = (byte) 10;
        Integer nInt = 100;
        Long nLong = 1000L;
        Float nFloat = 3.5F;
        Double nDouble = 3.55555;
        Boolean flagBoolean = true;
        Character b = 'b';

        Integer i = Integer.valueOf("100");
        Double d = Double.valueOf("3.5");

        System.out.println(i.intValue());
        System.out.println(i.longValue());

        int numA = Integer.parseInt("10000");
        double numB = Double.parseDouble("3.555");

        System.out.println(numA);
        System.out.println(numB);

        System.out.println(nInt.equals(i));



    }
}
