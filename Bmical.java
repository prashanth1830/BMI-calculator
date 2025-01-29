
import java.util.Scanner;
public class Bmical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        Double weight = sc.nextDouble();
        System.out.println("Enter your height");
        Double height = sc.nextDouble();
        double Bmical = weight / (height*height);
        System.out.printf("Your BMi is: %2f\n",Bmical);
        if(Bmical < 15){
            System.out.printf("Under weight");
        } else if (Bmical >= 15 && Bmical <= 25) {
            System.out.printf("Normal weight");
        } else if (Bmical >= 26 && Bmical <= 35){
            System.out.printf("Over weight");
        } else{
            System.out.printf("Overrr weight");
        }
        sc.close();

    }
}