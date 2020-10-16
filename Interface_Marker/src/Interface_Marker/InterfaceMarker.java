package Interface_Marker;

interface SortGoodGrade{}

class BadStudents{}

class GoodStudents implements SortGoodGrade{}
class VipFamily extends GoodStudents{}

public class InterfaceMarker {
	public static void SortClass(Object obj) {
		if(obj instanceof SortGoodGrade){
			System.out.println("đối tượng này được vào lớp chọn: " + obj.getClass());
		}else {
			System.out.println("đối tượng này không được vào lớp chọn: " + obj.getClass());
		}
	}
	
	public static void main(String[] args) {
		SortClass(new GoodStudents());
		SortClass(new BadStudents());
		SortClass(new VipFamily());
	}
}
