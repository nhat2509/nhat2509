import java.util.Scanner;
public class App2 {
    double a1, b1, c1;
    double a2, b2, c2;
    public static void main(String[] args) throws Exception {
        double a1, b1, c1;
        double a2, b2, c2;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap phuong trinh 1");
        System.out.println("Nhap he so: a1, b1, c1 = ");
        a1 = s.nextDouble();
        b1 = s.nextDouble();
        c1 = s.nextDouble();
        System.out.println("Nhap phuong trinh 2");
        System.out.println("a2, b2, c2 = ");
        a2 = s.nextDouble();
        b2 = s.nextDouble();
        c2 = s.nextDouble();
        System.out.println("-------Hoan thanh Nhap-------");
        System.out.println("");
        //Phuong trinh the
        double b11=b1*b2;
        double c11=c1*b2;
        double b22=b2*b1;
        double c22=c2*b1;
        double y = (a1*b2-a2*b1)/(c11-c22);
        System.out.println("nghiem cua hpt y = "+y);
        double x = (c11-b11*y)/(a1*b2);
        System.out.println("nghiem cua hpt x = "+x);
    }
}
