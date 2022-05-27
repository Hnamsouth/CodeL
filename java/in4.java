class in4 {
    /*
    Trong file này có thể khai báo các biến hay còn gọi là thuộc tính(property)
    */
    String ho_ten;
    int tuoi;
    double chieu_cao;
    int can_nang;
    // tạo 1 hàm ngẫu nhiên. tên hàm là gioi_thieu(trong ngoặc có thể chứa tham số)
    // public là có thể truy cập từ class bên ngoai.
    public void gioi_thieu() //  void là kdl ko có giá trị trả về
    {
        System.out.println("xin chao toi la: " + ho_ten);
    }
    public String ktr_tuoi(){ // hàm có dữ liệu trả về(là chuối string)
        String kq;
        if(tuoi>18){
            kq="tren 18+";
        }else if(tuoi > 35){
            kq="gia vcc";
        }else{
            kq="duoi 18+";
        }
        return kq;
    }
    public boolean kt_chieu_cao(double chieu_cao, int can_nang ){
        int k=110;
        chieu_cao*=100;
        if((chieu_cao+can_nang)/2>k){
            return true;
        }else {
            return false;
        }
    }
}
