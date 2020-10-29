package Abtract;

public abstract class NhanVien {
	
	protected String ten;
    protected long luong;
       

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public long getLuong() {
		return luong;
	}

	public void setLuong(long luong) {
		this.luong = luong;
	}

	// Lớp con phải override để lo vụ loại nhân viên này
    protected abstract String loaiNhanVien();
      
    // Lớp con phải override để lo vụ tính lương này
    public abstract void tinhLuong();
      
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + ten + " =====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }


    
    

}
