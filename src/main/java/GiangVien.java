public abstract class GiangVien {
    protected String tenGV;
    protected String email;
    protected String diaChi;
    protected String dienThoai;
    protected int soGioGiangDay;

    public GiangVien(String tenGV, String email, String diaChi, String dienThoai, int soGioGiangDay) {
        this.tenGV = tenGV;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public GiangVien() {
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public void setSoGioGiangDay(int soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }

    public void print() {
        System.out.println("- Tên GV: " + this.tenGV);
        System.out.println("- Email: "+ this.email);
        System.out.println("- Địa chỉ: "+ this.diaChi);
        System.out.println("- Điện thoại: "+ this.dienThoai);
        System.out.println("- Số giờ giảng dạy: "+ this.soGioGiangDay);

    }

    public abstract long tinhLuong();


}

