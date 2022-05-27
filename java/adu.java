import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner; 
// thư viên của java. các dấu chấm là các nhóm phụ thuộc
// vd. Scanner thuộc util & until thuộc java

class adu {
    public void main(String[]argc){
// ngoặc đơn() ấm chỉ fucntion có tên cùng vs class( gọi là hàm khởi tạo: Constructor)
        Scanner nhap = new Scanner(System.in); // lệnh input trong java. 

        Path path = Path.of("Data.txt"); 
        // List<String> thongtin_data_list = Files.readAllLines(path); 
        // khi hàm này đc gọi nó sẽ trả về 1 kdl list string
        // System.out.println(thongtin_data_list);
        /*TRONG JAVA CÓ 1 SỐ FUNCTION or METHOD  CÓ THỂ GÂY RA NỐI: 
        VS NÓ LM VIỆC VS CÁC PHẦN CỨNG HOẶC CÁC FILE : 
        ĐỂ TRÁNH CÁC LỖI NÀY LÀM TREO HOẶC LÔI THÌ JAVA CÓ CUNG CẤP PHƯƠNG PHÁP try{ }catch();*/
        // data.txt vì đặt cùng vs thư mục của chương trình nên có thể viết data.txt mà ko cần đường dẫn cụ thể
        // of (Function static) 
        // Các hàm static có thể gọi đến mà ko cần phải khởi tạo đối tượng
        // những hàm khác vs như Scanner phải sử dụng toán tử new để khởi tạo ms có thể sử dụng 
        while(true){
            System.out.print("nhap ten muon tim kiem");
            String nhapvao = nhap.nextLine();
        }
        
    }
}