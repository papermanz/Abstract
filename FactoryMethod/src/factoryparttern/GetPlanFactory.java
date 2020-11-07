package factoryparttern;
//Factory classs
public class GetPlanFactory {
	public Plan getPlan(String planType) {
		//sử dụng phương thức getPlan để lấy đối tượng có kiểu plan
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DANDUNG")) {
            return new DanDung();
        } else if (planType.equalsIgnoreCase("DOANHNGHIEP")) {
            return new DoanhNghiep();
        } else if (planType.equalsIgnoreCase("NHAMAY")) {
            return new NhaMay();
        }
        return null;
    }

}
