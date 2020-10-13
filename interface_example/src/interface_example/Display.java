package interface_example;

public class Display implements Update {
	private Downloads download;
	
	//Phương thức khơi tạo giao diện đồng thời đặt sự kiện lắng nghe 
	public Display () {
		download = new Downloads();
		download.AddDownloadListener(this);
		
	}
	public void nhanDownload() {
		download.Download();
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		display.nhanDownload();
		

	}
	//Tự động gọi trong quá trình đang download thông qua interface.
	@Override
	public void UpdateDownload(int giatri) {
		System.out.println("Class giao diện cập nhật được " +giatri+ " %");
		
	}

}
