package examples;

import java.lang.Thread;

public class DiningPhilosophers {

    private class Philosopher extends Thread{
        private int iD;
        private int leftHand;
        private int rightHand;

        public Philosopher(int id) {
            iD = id;
            leftHand = iD;
            rightHand = (id + 1) % numberOfPhilosophers;

        }
        public void run() {
            System.out.println("Philosopher " + iD + " attempts to eat");
            int firstHand, secondHand;

            if (iD % 2 == 0) {
                firstHand = leftHand;
                secondHand = rightHand;
            }else {
                firstHand = rightHand;
                secondHand = leftHand;
            }

            while (true){
                synchronized (forks[firstHand]) {
                    System.out.println(("\tPhilosopher " + iD + " has a fork in the left hand"));
                    synchronized ((forks[secondHand])) {
                        System.out.println(("\t\tPhilosopher " + iD + " has a fork in right hand"));
                        try {
                            Thread.sleep(1000);
                        } catch (Exception exp) {
                            System.out.println("----------Philosopher " + iD + " encountered an exception " + exp.getMessage());
                        }
                    }

                }

            }

        }


    }


    private Object[] forks;
    private Philosopher[] philosophers;
    private int numberOfPhilosophers;

    private DiningPhilosophers(int iNum){
        numberOfPhilosophers = iNum;
        forks = new Object[numberOfPhilosophers];
        philosophers = new Philosopher[numberOfPhilosophers];

        for (int iLoop = 0; iLoop < numberOfPhilosophers; iLoop++) {

            forks[iLoop] = new Object();
            philosophers[iLoop] = new Philosopher(iLoop);
        }

    }


    public static void StartEating(int numberOfDiners){

        DiningPhilosophers diningPhilosophers = new DiningPhilosophers(numberOfDiners);

        for (int iLoop = 0; iLoop < numberOfDiners; iLoop++) {
            diningPhilosophers.philosophers[iLoop].start();
        }

    }


}
