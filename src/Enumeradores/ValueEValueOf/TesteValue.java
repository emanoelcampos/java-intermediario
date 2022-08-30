package Enumeradores.ValueEValueOf;

import classes.utilitarias.enumeradores.constantes.tipoenum.DiaSemana;

public class TesteValue {
    public static void main(String[] args) {

        //classe DiaSemana(sem construtor) importada para ser usada como exemplo:
        //values: maneira de saber todos os valores dentro de um enum;
        DiaSemana[] dias = DiaSemana.values();
        for (DiaSemana dia : dias){
            System.out.println(dia);
        }


    }
}
