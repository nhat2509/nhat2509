package Shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    // Constructor
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapBanKinh() {
        System.out.println("Ban Kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();

    }
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }

}


    

