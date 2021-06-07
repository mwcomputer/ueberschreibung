public class App {
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());

        ausgabe("----------------");

        ausgabe(queen.fly());
        ausgabe(worker.fly());
        ausgabe(drone.fly());

    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }

}
