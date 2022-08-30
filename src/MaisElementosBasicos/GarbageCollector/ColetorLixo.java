package MaisElementosBasicos.GarbageCollector;

import MaisElementosBasicos.ParametroValorReferencia.Contato;


public class ColetorLixo {

    public static void obterMemoriaUsada(){

        Runtime runtime = Runtime.getRuntime(); //singleton
        System.out.println( runtime.totalMemory() - runtime.freeMemory());
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10000];
        Contato contato;
        for( int i=0; i<contatos.length; i++){
            contato = new Contato("Contato" +i, "1234-5678" +i, "contato"+i+"email.com");
            contatos[i] = contato;
        }

        System.out.println("Contato criados");

        obterMemoriaUsada();

        contatos = null;
        System.runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }
}
