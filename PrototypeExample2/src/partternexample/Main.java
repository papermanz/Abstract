package partternexample;

/*
 * một công ty điện thoại thông minh sản xuất hàng nghìn điện thoại di động với 
 * cùng một phần cứng và phần mềm.Nhưng với kiểu máy (màu) khác, giá cũng có thể
 * thay đổi theo từng phiên bản.
 *
 */



public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		SmartPhone SamsungS20 = new Samsung("Galaxy fold 2");
		SmartPhone Iphone12 = new Apple("Iphone 12");
		
		System.out.println(SamsungS20);
		System.out.println(Iphone12);
		
		System.out.println("--------------------------Bản Đặc Biệt-----------------------------");
		SmartPhone SamsungS20Gold = SamsungS20.clone();// tạo 1 clone từ ss20
		SamsungS20Gold.setVipPrice(4000000); // set giá trị giá bổ sung của bản đặc biệt
		System.out.println(SamsungS20Gold);
		
		SmartPhone Iphone12Promax = Iphone12.clone();
		Iphone12Promax.setVipPrice(6000000);
		System.out.println(Iphone12Promax);
	}

}
