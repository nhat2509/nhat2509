package Shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    // Constructor
    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai() {
        System.out.println("chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieuRong() {
        System.out.println("chieu rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
