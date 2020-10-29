package Abstract;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	  public static void main(String[] args) {
	    HinhDang objHinhDang; // Khai báo 1 đối tượng của lớp HinhDang
	    String hinhDang; // Biến lưu loại hình dạng
	    System.out.print("Mời nhập hình dạng bạn muốn thao tác (HinhTron/ChuNhat): ");
	    hinhDang = sc.nextLine();
	    hinhDang = hinhDang.toLowerCase(); // chuyển sang chữ thường
	    System.out.print("Mời bạn nhập chiều rộng: ");
	    float rong = sc.nextFloat();
	    switch (hinhDang) { // Kiểm tra hình dạng (phiên bản JDK7 trở lên switch mới hỗ trợ kiểu chuỗi)
	      case "hinhtron":
	        objHinhDang = new HinhTron();
	        objHinhDang.tinhToan(rong);
	        break;
	      case "chunhat":
	        objHinhDang = new ChuNhat();
	        objHinhDang.tinhToan(rong);
	        break;
	      default:
	        System.out.println("Bạn chỉ nhập được HinhTron hoặc ChuNhat");
	    }
	  }
	}