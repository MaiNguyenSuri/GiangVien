public class GiangVienThinhGiang extends GiangVien {

    private String coQuan;
    private final long luongTheoGio = 200000;

    public GiangVienThinhGiang(String tenGV, String email, String diaChi, String dienThoai, int soGioGiangDay, String coQuan) {
        super(tenGV, email, diaChi, dienThoai, soGioGiangDay);
        this.coQuan = coQuan;
    }

    public GiangVienThinhGiang() {

    }

    @Override
    public void print() {
        System.out.println("Giảng viên thỉnh giảng");
        super.print();
        System.out.println("- CƠ quan: " + this.coQuan);
    }

    public long tinhLuong() {

       return this.soGioGiangDay * luongTheoGio;

    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }
}
