import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListGiangVien lstGV = new ListGiangVien();
        lstGV.nhapGVCH();
        lstGV.nhapGVTG();
        System.out.println("Bạn muốn xuất giảng viên nào?. Nhập 1 All Giảng viên. Nhập 2 GVCH. Nhập 3 GVTG");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 2: {
                lstGV.inGVCH();
                break;
            }
            case 3: {
                lstGV.inGVTG();
                break;
            }
            default:{
                lstGV.inGV();
                break;
            }
        }

        long sum = lstGV.tongLuong();
        System.out.println("Tổng lương giảng viên là: " + sum);

        long max = lstGV.maxLuong();
        System.out.println("Max lương là: " + max);

    }


}
