package springHomework1;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(11,30);
        taxi.startDriving();
        taxi.takePassenger();
        taxi.speedChange();
        taxi.addDistanceFeePerKm();
        taxi.payFee();
    }
}
