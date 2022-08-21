import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter model of new car");
        Scanner n = new Scanner(System.in);
        String model = n.nextLine();
        car car1 = new CarFactory().get(model);
        System.out.println("how much doors you want");
        Scanner n1 = new Scanner(System.in);
        int door = n1.nextInt();
        car1.doors(door);
        car1.motor();
        car1.steeringWheel();

    }
}
