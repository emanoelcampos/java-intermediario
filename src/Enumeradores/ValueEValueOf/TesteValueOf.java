package Enumeradores.ValueEValueOf;

import classes.utilitarias.enumeradores.como.classes.DiaSemana;

public class TesteValueOf {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.QUINTA;
        DiaSemana diaSexta = DiaSemana.valueOf("SEXTA");

        System.out.println(dia);
        System.out.println(diaSexta);
    }
}
