public class GiangVienCoHuu extends GiangVien{
    private long luong;
    private final int soGioQuyDinh = 40;

    public GiangVienCoHuu(String tenGV, String email, String diaChi, String dienThoai, int soGioGiangDay, long luong) {
        super(tenGV, email, diaChi, dienThoai, soGioGiangDay);
        this.luong = luong;
    }

    public GiangVienCoHuu() {
    }

    @Override
    public void print() {
        System.out.println("Giảng viên cơ hữu");
        super.print();
        System.out.println("- Lương: " + this.luong);
        System.out.println("- Số giờ quy định: " + this.soGioQuyDinh);
    }

    public long tinhLuong() {

        long luongCongThem = 0;
        if(soGioGiangDay > soGioQuyDinh) {

            long luongMoiGio = this.luong/this.soGioQuyDinh;
            int soGioCongThem = this.soGioGiangDay - this.soGioQuyDinh;
            luongCongThem = luongMoiGio * soGioCongThem;
        }

        return luongCongThem + this.luong;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }

}
