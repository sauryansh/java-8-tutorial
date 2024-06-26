package _07lambda.runnable;

public class _01RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         *         Java-8  Lambda Syntax
         *         ()->{}
         *         Assigning a lambda to a variable
         *         It doesn't take input and doesn't return output.
         *         The Idea is to use this with Thread class.
         *         Runnable class is annotated with @FunctionalInterface
         *         to determine the class to be functional interface.
         *         It is an optional annotation.
         */
        //First optimizing: Reducing boilerplate code
        Runnable runnableLambda = () ->{
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();
        //Second optimizing: Single line statement for a single line statement inside lambda body
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda1).start();

        //Third optimizing: Single line statement for a single line statement inside lambda body
        new Thread(()-> System.out.println("Inside Runnable 4")).start();

        //Legacy way - Anonymous Class.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 4.1 - Legacy");
            }
        }).start();

        //Multiple statement
        new Thread(()->{
            System.out.println("Inside Runnable 5.1");
            System.out.println("Inside Runnable 5.2");
        }).start();
    }
}
