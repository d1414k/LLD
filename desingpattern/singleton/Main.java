package desingpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                Singleton singleton1 = Singleton.getSingleton();
                System.out.println("Thread1: " + singleton1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                Singleton singleton2 = Singleton.getSingleton();
                System.out.println("Thread2: " + singleton2);
            }
        });

        thread1.start();
        thread2.start();

        Singleton singleton = Singleton.getSingleton();
        System.out.println("Thread: " + singleton);

    }
}
