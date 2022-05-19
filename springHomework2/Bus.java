package springHomework2;

import springHomework1.Taxistatus;

import java.util.Scanner;

public class Bus {
    private int maxPassenger;
    private int currentPassenger;
    private int fee;
    private Long busNum;
    private int fuelVolume;
    private int currentSpeed;
    private Busstatus status;
    private int passenger;

    public Bus(int fuelVolume, int passenger) {
        this.busNum = 9122L;
        this.maxPassenger = 30;
        this.currentPassenger = 20;
        this.fee = 1500;
        this.fuelVolume = fuelVolume;
        this.currentSpeed = 40;
        status = Busstatus.운행;
        this.passenger = passenger;
    }


    public void Driving() {
        if (fuelVolume < 10) {
            System.out.println("주유량이 10ml 이하라서 주유가 필요합니다. 상태: " + status);
            status = Busstatus.차고지행;
            return;
        }
        System.out.println("주유량 체크 완료, 운행 시작합니다. 상태: " + status);
        status = Busstatus.운행;
    }

    public void finish() {
        System.out.println("운행을 종료합니다. 상태: " + status);
        status = Busstatus.차고지행;
    }

    public void takePassenger() {
        if (status == Busstatus.운행) {
            if (currentPassenger > maxPassenger) {
                System.out.println("최대 승객수 30명을 초과하여 승객 탑승이 불가합니다.");
            } else {
                currentPassenger += passenger;
                if (currentPassenger > maxPassenger) {
                    System.out.println("최대 승객수 30명을 초과하여 승객 탑승이 불가합니다.");}
                else {System.out.println("현재 승객수는 " + currentPassenger + "명입니다.");}
            }
        }
    }

    public void speedChange() {
        final Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (fuelVolume < 10) {
            System.out.print("주유량을 확인해 주세요.");
        } else {
            currentSpeed += speed;
            System.out.println("현재 속도 40km/h에서 속도가 " + currentSpeed + "km/h로 변경 되었습니다.");
        }

    }
}