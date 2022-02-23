import java.util.Scanner;
public class App9 {
    public static void main(String[] args){
        String n = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong : ");
        n = scanner.nextLine();
        String N = "";

        for(int i = n.length() - 1; i >= 0; i--){
            N += n.charAt(i);
      }
       System.out.println(N);
       int a = 0;
       int b = 0;
        while (a > 0){
            int du = a % 10;
            //b mới bằng b cũ nhân 10 và công lấy phần dư
            b = b * 10 + du;

            a = a / 10;
        }
        System.out.println(b);
    }
}
