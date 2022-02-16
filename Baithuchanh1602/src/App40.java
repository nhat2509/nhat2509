import java.util.Scanner;

public class App40 {
    public static void main(String agre[]){
        int ngay;
        Scanner sc =new Scanner(System.in);
        ngay = sc.nextInt();

        switch(ngay) {
            case 1:System.out.println("thu hai");
                   break;
            case 2:System.out.println("thu ba");
                   break;
            case 3:System.out.println("thu tu");
                   break;
            case 4:System.out.println("thu nam");
                   break;
            case 5:System.out.println("thu sau");
                   break;
            case 6:System.out.println("thu bay");
                   break;
            case 7:System.out.println("Chu nhat");
                   break;
            default:System.out.println("So ngay trong tuan sai");
        }
    }
}
