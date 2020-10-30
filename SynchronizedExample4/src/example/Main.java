
package example;
/*
 * 
- Thread 1 thực hiện sinh ngẫu nhiên các ký tự a-z, cứ 2s thì sinh 1 lần

- Thread 2 thực hiện biến các ký tự thường được sinh ra từ Thread 1 thành ký tự in hoa, cứ sau 1s thì thực hiện 1 lần.

Yêu cầu đồng bộ 2 Thread (wait, notify)

- Nếu tổng thời gian xử lý của 2 Thread là 20s thì dựng 2 thread.
*/

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
    }
}
