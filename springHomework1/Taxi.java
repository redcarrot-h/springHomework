package springHomework1;

import java.security.PublicKey;
import java.util.Scanner;

public class Taxi {

    private Long taxiNumber;
    private int fuelVolume;
    private int currentSpeed;
    private int basicDistance;
    private String destination;
    private int desDistance;
    private int basicFee;
    private int distanceFeePerKm;
    private Taxistatus status; /*열거형*/

    public Taxi(int fuelVolume, int desDistance){
        this.taxiNumber = 9122L;
        this.fuelVolume = fuelVolume;
        this.currentSpeed = 40;
        this.basicDistance = 10;
        this.destination = "종로3가";
        this.desDistance = desDistance;
        this.basicFee = 1500;
        this.distanceFeePerKm = 3000;
        status = Taxistatus.일반;

    }
    public Taxi(){}

    public  void  startDriving(){
        if(fuelVolume < 10){
            System.out.println("주유량이 10ml 이하라서 운행이 불가합니다. 상태: " + status);
            status = Taxistatus.일반;
            return;
        }
        System.out.println("주유량 체크 완료, 운행 시작합니다. 상태: " + status);
        status = Taxistatus.운행중;
    }

    public void takePassenger(){
        if (status == Taxistatus.운행중){
            System.out.println("상태가 " + status + "이라 승객 탑승이 불가합니다.");
            return;
        }
        System.out.println("운행 중으로 변경하고 승객 탑승합니다! 상태 : " + status);
        status = Taxistatus.운행중;
    }

    public void speedChange(){
        final Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        currentSpeed += speed ;
        System.out.println("현재 속도 40km/h에서 속도가 " +currentSpeed + "km/h로 변경 되었습니다.");
    }

    public void addDistanceFeePerKm(){
        if(desDistance > basicDistance){
            basicFee += 3000;
            System.out.println("추가요금 3000원이 붙습니다.");
        }

    }

    public void payFee(){
        System.out.println("최종요금으로 " + basicFee + "원 결제 부탁드립니다.");

    }
}

