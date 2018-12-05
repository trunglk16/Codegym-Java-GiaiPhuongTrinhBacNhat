import java.util.Scanner;
public class resolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giai phuong trinh ax+b = 0");
        System.out.println("Moi nhap a: " );
        double a = input.nextDouble();
        System.out.println("Moi nhap b: ");
        double b = input.nextDouble();
        if (a == 0){
            System.out.println("Phuong trinh vo nghiem");
        }else{
            double x = -b/a;
            System.out.println("Nghiem cua phuong trinh: " + x);
        }
    }
}
