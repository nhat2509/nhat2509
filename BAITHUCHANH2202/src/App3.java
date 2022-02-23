import java.util.Scanner;
public class App3 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong : ");
        n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " la mot so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
