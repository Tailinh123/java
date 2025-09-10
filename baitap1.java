import java.util.Scanner;

// Bài 1: Hình chữ nhật
class HinhChuNhat {
double chieuDai;
double chieuRong;

HinhChuNhat(double chieuDai, double chieuRong) {
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
}

double tinhChuVi() {
    return (this.chieuDai + this.chieuRong) * 2;
}

double tinhDienTich() {
    return this.chieuDai * this.chieuRong;
}

void hienThi() {
    System.out.println("Chiều dài: " + this.chieuDai);
    System.out.println("Chiều rộng: " + this.chieuRong);
    System.out.println("Chu vi: " + tinhChuVi());
    System.out.println("Diện tích: " + tinhDienTich());
    System.out.println("-----------------------");
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    // Nhập dữ liệu cho hình chữ nhật 1
    System.out.print("Nhập chiều dài HCN 1: ");
    double dai1 = sc.nextDouble();
    System.out.print("Nhập chiều rộng HCN 1: ");
    double rong1 = sc.nextDouble();

    HinhChuNhat hcn1 = new HinhChuNhat(dai1, rong1);

    // Nhập dữ liệu cho hình chữ nhật 2
    System.out.print("Nhập chiều dài HCN 2: ");
    double dai2 = sc.nextDouble();
    System.out.print("Nhập chiều rộng HCN 2: ");
    double rong2 = sc.nextDouble();

    HinhChuNhat hcn2 = new HinhChuNhat(dai2, rong2);

    // Hiển thị kết quả
    System.out.println("\n--- Thông tin các hình chữ nhật ---");
    hcn1.hienThi();
    hcn2.hienThi();

    sc.close();
}
}

/*Bài 2: Các kiểu dữ liệu cơ bản trong Java

Trong Java có 2 nhóm chính:

Kiểu nguyên thủy (primitive) → mấy kiểu cơ bản, dùng nhiều nhất:

int: số nguyên (5, -10, 100)
double: số thực, có dấu phẩy (3.14, -2.7)
char: ký tự đơn (ví dụ: 'A', 'b')
boolean: đúng/sai (true hoặc false)
(Ngoài ra còn byte, short, long, float nhưng ít khi dùng ở mức cơ bản)
Kiểu tham chiếu (reference) → mấy cái phức tạp hơn:

String: chuỗi ký tự ("Hello Java")
Array (mảng)
Object (đối tượng từ class mình tự tạo)
Các class/thư viện có sẵn khác trong Java
Tóm gọn:

int, double, char, boolean → lưu trực tiếp giá trị
String, Array, Object → lưu địa chỉ tham chiếu đến vùng nhớ
*/
import java.util.ArrayList;

class TaiKhoan {
String soTK;
String tenChu;
double soDu;
static double laiSuatNam = 0.05;

TaiKhoan(String soTK, String tenChu, double soDu) {
    this.soTK = soTK;
    this.tenChu = tenChu;
    this.soDu = soDu;
}

void napTien(double tien) {
    soDu += tien;
}

void rutTien(double tien) {
    if (tien <= soDu) {
        soDu -= tien;
    } else {
        System.out.println("Khong du tien trong tai khoan " + soTK);
    }
}

void tinhLai1Thang() {
    soDu += soDu * (laiSuatNam / 12);
}

void inThongTin() {
    System.out.println(soTK + " - " + tenChu + " - So du: " + soDu);
}
}

public class Bai3 {
public static void main(String[] args) {
ArrayList ds = new ArrayList<>();
ds.add(new TaiKhoan("001", "Nguyen Van A", 5000));
ds.add(new TaiKhoan("002", "Tran Thi B", 10000));
ds.add(new TaiKhoan("003", "Le Van C", 2000));

    ds.get(0).napTien(2000);
    ds.get(1).rutTien(3000);
    ds.get(2).tinhLai1Thang();

    System.out.println("Danh sach tai khoan:");
    for (TaiKhoan tk : ds) {
        tk.inThongTin();
    }

    String tim = "002";
    System.out.println("\nTim tai khoan " + tim + ":");
    for (TaiKhoan tk : ds) {
        if (tk.soTK.equals(tim)) {
            tk.inThongTin();
        }
    }

    ds.sort((a, b) -> Double.compare(b.soDu, a.soDu));

    System.out.println("\nDanh sach sau khi sap xep:");
    for (TaiKhoan tk : ds) {
        tk.inThongTin();
    }
}
}
