package interface_example;

public class Downloads {
	private Update update;
	
	// Lắng nghe sự kiện download
	public void AddDownloadListener(Update update) {
		this.update = update;
	}
	public void Download() {
		for(int i = 0; i <= 100; i++ ) {
			System.out.println("Đang download...");
			
			//Khi gọi update.UpdateDownload(i), thì phương thức này tự động được gọi trong interface update 
			update.UpdateDownload(i);
		}
		System.out.println("Download complete !!!");
	}

}
