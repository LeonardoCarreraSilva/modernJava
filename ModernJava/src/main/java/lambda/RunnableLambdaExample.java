package lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
         * Prior java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //java 8 lambda
        //()->{}
        Runnable runnablelabda = ()->{
            System.out.println("Insede Runnable 2");
        };

        new Thread(runnablelabda).start();

        new Thread(() -> System.out.println("Inside Runnable 3")).start();
    }
}
