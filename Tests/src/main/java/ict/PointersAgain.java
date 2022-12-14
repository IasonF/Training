package ict;

public class PointersAgain {
    public static void main(String[] args) {
        Professional banker = new Banker();
        banker.doWork();
    }
}

abstract class Professional {
    private void announceSalary() {
        System.out.println("Earn money");
    }

    abstract void doWork();
}

class Banker extends Professional {

    @Override
    public void doWork() {
        System.out.println("Counting...");
    }

    public void announceSalary(){
        System.out.println("Earn nothing");
    }

}