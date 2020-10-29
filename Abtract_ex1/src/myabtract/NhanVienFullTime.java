package Abtract;

public class NhanVienFullTime extends NhanVien {

	private int ngayLamThem; // Ngày làm thêm của nhân viên
    private int loaiChucVu; // Chức vụ là Nhân Viên hay sếp
     
    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }
     
    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Nhân Viên toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }
     
    @Override
    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
	

}
