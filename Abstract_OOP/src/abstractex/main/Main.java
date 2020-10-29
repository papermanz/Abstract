package Abstract.main;

import Abstract.model.Address;
import Abstract.model.School;
import Abstract.model.Student;
public class Main {

	//QUAN HE Has A
	
		public static void main(String[] args) {
			//System.out.println("SV PHUONG:");
			Student phuong = new Student();
			phuong.input();
			
//			System.out.println("SV THO:");
//			Student tho = new Student();
//			tho.input();
//			
			//dia chi
//			System.out.println("HA DONG:");
//			Address haDong = new Address();
//			haDong.input();
			
			System.out.println("THANH XUAN:");
			Address thanhXuan = new Address();
			thanhXuan.input();
			
			System.out.println("PTIT");
			School ptit = new School();
			ptit.input();
			
			///QUAN HE STUDENT & ADDRESS & SCHOOL
			phuong.setAddress(thanhXuan);
			//tho.setAddress(haDong);
			//
			phuong.setSchool(ptit);
			//tho.setSchool(ptit);
			
			/////INFO
			System.out.println("SV PHUONG INFO:");
			phuong.info();
			phuong.getSchool().info();
			phuong.getAddress().info();
			
			
		}

}
