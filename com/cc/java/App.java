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


    }

   private static void pollObj(Queen obj){
    output(obj.doYourJob()); 
    output(obj.fly());
    output("------------------");
    }
    private static void pollObj(Worker obj){
        output(obj.doYourJob()); 
        output(obj.fly());
        output("------------------");
        }
        private static void pollObj(Drone obj){
            output(obj.doYourJob()); 
            output(obj.fly());
            output("------------------");
            }
            private static void pollObj(KilledBee obj){
                output(obj.doYourJob()); 
                output(obj.fly());
                output("------------------");
                }
            
    
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

