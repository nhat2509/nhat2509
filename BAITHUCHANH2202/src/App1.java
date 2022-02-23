import java.util.Scanner;
public class App1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int a,b;
        System.out.print("Nhap so nguyen duong a = ");
        a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        b = scanner.nextInt();
        //Tinh USCLN cua a va b
        System.out.println("USCLN của " + a + " và " + b
           + " là: " + USCLN(a, b));


    }
    public static int USCLN(int a, int b){
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}
