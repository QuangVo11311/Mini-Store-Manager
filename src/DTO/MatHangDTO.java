package DTO;

public class MatHangDTO {
    private String maMH; // primary key
    private String maLMH; // foreign key
    private String tenMH;
    private float thanhTien;
    private int soLuong;

    public int soLuong_hientai = 0;
    public float thanhTien_hientai = 0;

    public MatHangDTO() {
    }

    public MatHangDTO(String maMH, String maLMH, String tenMH, float thanhTien, int soLuong) {
        this.maMH = maMH;
        this.maLMH = maLMH;
        this.tenMH = tenMH;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaLMH() {
        return maLMH;
    }

    public void setMaLMH(String maLMH) {
        this.maLMH = maLMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maMH='" + maMH + '\'' +
                ", maLMH='" + maLMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", thanhTien='" + thanhTien + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }

    public String toStringGioHang() {
        return "MatHang{" +
                "maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", thanhTienHienTai='" + thanhTien_hientai + '\'' +
                ", soLuongHienTai=" + soLuong_hientai +
                '}';
    }

    // Xử lí các thông số trong giỏ hàng
    public void increaseSoLuong() {
        soLuong_hientai = soLuong_hientai + 1;
    }

    public void increaseThanhTien() {
        thanhTien_hientai = thanhTien_hientai + getThanhTien();
    }

    public void decreaseSoLuong() {
        soLuong_hientai = soLuong_hientai - 1;
    }

    public void decreaseThanhTien() {
        thanhTien_hientai = thanhTien_hientai - getThanhTien();
    }

    public void resetSoLuong() {
        soLuong_hientai = 0;
    }

    public void resetThanhTien() {
        thanhTien_hientai = 0;
    }
}
