class test1 { // tên của class PHẢI trùng vs tên của file
	// class để khai báo 1 chương trình con
	// Khi 1 đoạn code mới đc chạy trình biên dịch sẽ tạo ra 1 file cùng tên vs file code.class
	public static void main(String[]args) { // dòng này là 1 HÀM main
// BIẾN TRONG JAVA

		/*int tuoi=16;
		double chieu_cao=1.8;
		String ho_ten="hoang nam"; */

		// System.out.println("Name: Codelearn\nDate of birth: 2019");
		// System.out.println(ho_ten.toUpperCase());
		/* .toUpperCase() Để in hoa toàn bộ chữ cái trong chuỗi
			nhưng kiểu mở rộng như này thường được goin là object - còn String gọi là class
			Còn int & double là biến nguyên thủy vì ko có chức năng nào hỗ trợ bên trong nó
		*/
		
		// Có thể tự tạo kiểu dữ liệu 
		// để sử dụng kiểu dữ liệu mở rộng vd ThongTin: thì phải gọi thông qua hàm "new"
		ThongTin thongtin = new ThongTin();
		thongtin.chieu_cao=1.7;
		thongtin.ho_ten="hoang nam";
		thongtin.tuoi=24;	
		thongtin.can_nang=45;
		// System.out.println(thongtin.ho_ten);
		thongtin.gioi_thieu(); // gọi hàm đã tạo từ file khacs
		System.out.println("tinh trang: " + thongtin.ktr_tuoi());
		if(thongtin.kt_chieu_cao(thongtin.chieu_cao, thongtin.can_nang)){
			System.out.println(" beo vcc ---");
		}else{
			System.out.println(" gay vcc ---");
		}
		/* 
		Kiểu dữ liệu danh sách(array): sẽ lưu 1 nhóm các dữ liệu có cùng kiểu
		*/ 
		// ThongTin[] tt_list = new ThongTin[10]; // tạo mảng vs 10 phần tử
		// List<ThongTin> tt_list = new List<ThongTin>();

// Hàm(Function)
// Vòng Lặp(Loop)
		for(int i=0;i<15;i++){
			thongtin.can_nang++;
		}
		if(thongtin.kt_chieu_cao(thongtin.chieu_cao, thongtin.can_nang)){
			System.out.println(" beo vcc ---");
		}else{
			System.out.println(" gay vcc ---");
		}
	}
}
