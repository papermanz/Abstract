package factoryparttern;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		//sử dụng phương thức getPlan để lấy đối tượng có kiểu plan
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DÂN DỤNG")) {
            return new DanDung();
        } else if (planType.equalsIgnoreCase("DOANH NGHIỆP")) {
            return new DoanhNghiep();
        } else if (planType.equalsIgnoreCase("NHÀ MÁY")) {
            return new NhaMay();
        }
        return null;
    }

}
