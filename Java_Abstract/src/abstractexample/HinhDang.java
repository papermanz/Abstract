package Abstract;

abstract class HinhDang {
	  private final float PI = 3.14F; // Biến để lưu giá trị của số PI
	  /* getter của biến PI */
	  public float getPI() {
	    return PI;
	  }
	  /* Khai báo phương thức trừu tượng */
	  abstract void tinhToan(float giaTri);
	}
