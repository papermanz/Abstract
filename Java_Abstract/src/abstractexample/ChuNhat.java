package abstractexample;

/* Định nghĩa lớp con ChuNhat */
class ChuNhat extends HinhDang {
  float chuVi; // Biến lưu chu vi
  float chieuDai = 10; // Biến lưu chiều dài
  /* Thực thi phương thức trừu trượng để tính chu vi */
  @Override 
  void tinhToan(float chieuRong) {
    chuVi = 2 * (chieuDai + chieuRong);
    System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
  }
}
