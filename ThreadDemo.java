import java.util.Scanner;
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of 1st Thread: ");
        t1.setName(scan.nextLine());
        System.out.println("Enter the name of 2nd Thread: ");
        t2.setName(scan.nextLine());
        System.out.println("The name of your Threads are: " + Thread.currentThread().getName() + " and " + Thread.currentThread().getName());
        t1.start();
        try {
            t1.join(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-0 is alive: " + t1.isAlive());
        System.out.println("Thread-1 is alive: " + t2.isAlive());

        //public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has ended.");
    }
}

