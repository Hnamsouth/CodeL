#include<iostream>
using namespace std;
/* Con trỏ là một dạng đặc biệt của biến, do cũng là 1 biến nên nó cũng có địa chỉ và giá trị
nó khác các biến bình thường ở chỗ  GIÁ TRỊ CỦA 1 CON TRỎ CHÍNH LÀ ĐỊA CHỈ CỦA 1 BIẾN KHÁC.
Cú pháp để khai báo một con trỏ:
Kiểu_dữ_liệu *tên_con_trỏ; // Ví dụ: int *p;
*/

void change(int *p) {
    (*p)++;
}
int main(){
    // khai báo biến a
    int a=6;           
    // khai báo con trỏ và cho con trỏ ct trỏ tới biến a
    int * ct=&a;
    cout<< " dia chi cua a la: "<< &a <<endl;
    // để hiển thị địa chỉ &a dưới dạng số thập phân 
    cout<< " dia chi cua a la: "<< (int)&a;
    // lấy giá trị của biến a bằng con trỏ
    cout<< " gia tri cua a la: "<< *(&a) <<endl;
    // có thể thay đổi gia trị của biến a bằng cách
    *ct = 9;  // hoặc *(&a) = 9;
    cout<< " dia chi va gia tri cua ct la: "<< ct <<endl;
    cout<< " gia tri cua a la: "<< *ct;
    // cout<< " gia tri cua a la: "<< a <<endl;
    // change(&a);
    // cout<< " gia tri moi cua a la: "<< a;

    return 0;
}