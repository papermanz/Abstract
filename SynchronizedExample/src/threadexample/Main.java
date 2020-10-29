package threadexample;


/* Viết chương trình:

* Thread1 : Làm nhiệm vụ sinh ngẫu nhiên các số từ 1-100

- Nếu số ngẫu nhiên chia hết cho 3 thì đẩy sang Thread 2 : Thực hiện in ra bình phương số đó

- Trường hợp khác thì đẩy sang Thread 3 : Thực hiện kiểm ra xem số đó có chia hết cho 4 không và in ra thông báo (chia hết cho 4 hoặc ko)

- Nếu tổng các số sinh ngẫu nhiên trong Thread 1 >= 200 thì dừng tất cả các thread.

* Thực hiện đồng bộ 3 thread (Yêu cầu : Thread 1 sinh xong -> đợi cho 2 thread 2 và 3 thực hiện xong mới sinh tiếp, 
* Thread 2, 3 đợi cho Thread 1 sinh số ngẫu nhiên mới thì mới thực hiện yêu cầu)
*/
public class Main {
	public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        
        t1.start();
        t2.start();
        t3.start();
	}
}
