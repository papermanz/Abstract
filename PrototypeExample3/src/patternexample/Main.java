package patternexample;

/*
 * Một quán game có cấu hình các máy giống nhau cho khách hàng bao gồm : Hệ Điều Hành;
 * Trình duyệt web, gameonline, gamesoffline, other. Thay vì cài đặt từng máy tốn nhiều
 * thời gian, người ta cài chuẩn 1 máy rồi các máy khác clone lại bản chuẩn đó.
 */

public class Main {

	public static void main(String[] args) {
		Computer May1 = new Computer("Win10","Google Chrome","Liên Minh Huyền Thoại","Pikachu","Office");
		Computer May2 = May1.clone();
		May2.setOther(" Office, Facebook, Pes2021, Skype");
		Computer Mayn = May2.clone();
		Mayn.setOther("Office, Facebook, Pes2021, Skype, Pubg, Zalo");
		
		System.out.println(May1);
		System.out.println(May2);
		System.out.println(Mayn);
	}

}

