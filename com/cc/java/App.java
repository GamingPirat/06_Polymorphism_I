package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     Queen queen = new Queen();
     Worker worker = new Worker();
     Drone drone = new Drone();
     KilledBee killedBee = new KilledBee();
        
        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(killedBee);

        //  Das sollte eigentlich nicht gehen
        HoneyBee bee = new HoneyBee();
        pollObj(bee);


    }

    //  Polymorphie
   private static void pollObj(HoneyBee obj){
    output(obj.doYourJob()); 
    output(obj.fly());
    output("------------------");
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

