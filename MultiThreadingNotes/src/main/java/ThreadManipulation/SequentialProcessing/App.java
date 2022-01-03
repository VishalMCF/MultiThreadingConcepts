package ThreadManipulation.SequentialProcessing;

class Runner1{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Runner1 <---> "+(i+1));
        }
    }
}

class Runner2{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Runner2 <---> "+(i+1));
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        runner2.run();
        runner1.run();
    }
}
