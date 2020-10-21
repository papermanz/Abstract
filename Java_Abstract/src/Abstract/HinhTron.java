package Abstract;

/* Định nghĩa lớp con HinhTron */
class HinhTron extends HinhDang {
  float dienTich; // Biến để lưu diện tích của hình tròn
  /* Thực thi phương thức trừu tượng để tính diện tích hình tròn */
  @Override void tinhToan(float banKinh) {
    dienTich = getPI() * banKinh * banKinh;
    System.out.println("Diện tích của hình tròn là: " + dienTich);
  }
}