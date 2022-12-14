package ict;

public class WaitThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Waiting....");
        }
    }

    public static void main(String[] args) {
        WaitThread1 waitThread1 = new WaitThread1();
        waitThread1.start();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("completed.");
        System.out.println();

        WaitThread1 waitThread2 = new WaitThread1();
        waitThread2.start();
        try {
            waitThread2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("completed.");
    }
}
