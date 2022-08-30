package MaisElementosBasicos.ParametroValorReferencia;

public class PassagemValorParametro {
    public static void main(String[] args) {

        Contato contato = new Contato("Contato1", "1111-1111", "contato1@email.com");
        int valor = 10;

        System.out.println("---Valor originais---");
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("---Exemplo 1---");
        testePassagemValorReferencia(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("---Exemplo 2---");
        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

    }

    public static void testePassagemValorReferencia(int valor, Contato contato){

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato2", "2222-2222", "contato2@email.com");
    }

    public static void testePassagemValorReferencia2(int valor, Contato contato){

        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato"+novoValor);
    }
}

//instancias de objetos tem uma referência na memória

