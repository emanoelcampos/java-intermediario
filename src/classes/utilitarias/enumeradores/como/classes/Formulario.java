package classes.utilitarias.enumeradores.como.classes;

public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }

        public void setValor(char valor) {
            this.valor = valor;
        }

    }
    private String nome;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
