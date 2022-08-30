package Threads.StartRunSleep;

public class Teste {

    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread(" Thread #1", 600);
        //thread.start();

        MinhaThread thread2 = new MinhaThread(" Thread #2", 900);
    }
}
