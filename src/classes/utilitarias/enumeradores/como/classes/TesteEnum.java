package classes.utilitarias.enumeradores.como.classes;

public class TesteEnum {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(10, 2, 1997, DiaSemana.SEGUNDA);


        Formulario pessoa1 = new Formulario();
        pessoa1.setGenero(Formulario.Genero.FEMININO);
        System.out.println(pessoa1.getGenero().getValor());
    }
}
