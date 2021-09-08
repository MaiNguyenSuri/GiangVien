import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListGiangVien {
    private List<GiangVien> lstGV;
    private Scanner scanner;

    public ListGiangVien() {
        lstGV = new ArrayList<GiangVien>();
        scanner = new Scanner(System.in);
    }

    public void nhapGVCH() {
        System.out.println("Nhập thông tin giảng viên cơ hữu");
        System.out.println("Tên giảng viên: ");
        String tenGVCH = scanner.next();

        System.out.println("Email: ");
        String email = scanner.next();

        System.out.println("Địa chỉ: ");
        String diaChi = scanner.next();

        System.out.println("Điện thoại");
        String dienThoai = scanner.next();

        System.out.println("Số giờ giảng dạy: ");
        int soGioGiangDay = scanner.nextInt();

        System.out.println("Lương: ");
        Long luong = scanner.nextLong();

        GiangVienCoHuu gvch = new GiangVienCoHuu(tenGVCH, email, diaChi, dienThoai, soGioGiangDay, luong);
        lstGV.add(gvch);

    }

    public void nhapGVTG() {

        System.out.println("Nhập thông tin giảng viên thỉnh giảng");
        System.out.println("Tên giảng viên: ");
        String tenGVTG = scanner.next();

        System.out.println("Email: ");
        String email = scanner.next();

        System.out.println("Địa chỉ: ");
        String diaChi = scanner.next();

        System.out.println("Điện thoại: ");
        String dienThoai = scanner.next();

        System.out.println("Số giờ giảng dạy: ");
        int soGioGiangDay = scanner.nextInt();

        System.out.println("Cơ quan: ");
        String coquan = scanner.next();

        GiangVienThinhGiang gvtg = new GiangVienThinhGiang(tenGVTG, email, diaChi, dienThoai, soGioGiangDay, coquan);
        lstGV.add(gvtg);

    }

    public void inGV() {
        System.out.println("*******Xuất dánh sách toàn bộ giảng viên*******");
        for (GiangVien gv : lstGV) {
            gv.print();
        }
    }

    public void inGVCH() {
        System.out.println("*******Xuất dánh sách giảng viên cơ hữu*******");
        for (GiangVien gvch : lstGV) {
            if(gvch instanceof GiangVienCoHuu){
                gvch.print();
            }
        }
    }
    public void inGVTG() {
        System.out.println("*******Xuất dánh sách giảng viên thỉnh giảng*******");
        for (GiangVien gvtg : lstGV) {
            if(gvtg instanceof GiangVienThinhGiang){
                gvtg.print();
            }
        }
    }

    public long tongLuong()
    {
        long sum = 0;
        for(GiangVien gv : lstGV)
        {
            sum += gv.tinhLuong();
        }
        return sum;
    }

    public long maxLuong()
    {
        long max = 0;
        for(GiangVien gv : lstGV)
        {
            long luong = gv.tinhLuong();
            if (max < luong)
            {
                max = luong;
            }
        }
        return max;
    }
}

