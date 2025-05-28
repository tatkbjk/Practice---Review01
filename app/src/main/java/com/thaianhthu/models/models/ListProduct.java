package com.thaianhthu.models.models;

import java.util.ArrayList;
import java.util.Collection;

public class ListProduct {
    ArrayList<Product> products;

    public ListProduct() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void generate_sample_dataset() {
        products.add(new Product(1, "SACH01", "Kế Toán Vỉa Hè - Thực Hành Báo Cáo Tài Chính Căn Bản Từ Quầy Bán Nước Chanh", 169.000, "https://salt.tikicdn.com/cache/750x750/ts/product/b5/97/30/700ad2a7f988cbea25c49ae8ae1a37c8.png"));
        products.add(new Product(2, "SACH02", "Combo 2 Cuốn: Kế Toán Tài Chính (Tập 1 & 2)", 531.000, "https://salt.tikicdn.com/cache/750x750/ts/product/92/54/aa/c5b45e3ea25c42e146b4053e1d812183.jpg"));
        products.add(new Product(3, "SACH03", "Combo 2 Cuốn: Tâm Lý Học Tội Phạm", 185.000, "https://salt.tikicdn.com/cache/750x750/ts/product/0a/6c/f2/aaec7bcd7e61f8b6002fb6a537ef4b8f.jpg"));
        products.add(new Product(4, "SACH04", "Hồi Ký Nguyễn Thị Bình - Gia Đình, Bạn Bè và Đất Nước", 150.400, "https://salt.tikicdn.com/cache/750x750/ts/product/59/92/a4/4c31ce3a1455db2bc0e47d74742d2571.png.webp"));
        products.add(new Product(5, "SACH05", "THE DAILY STOIC – 366 CHIÊM NGHIỆM VỀ TRÍ TUỆ VÀ LÒNG CAN TRƯỜNG CÙNG NGHỆ THUẬT SỐNG", 155.350, "https://salt.tikicdn.com/cache/750x750/ts/product/92/76/ca/511b35694faeba098b24fae54b2810b5.jpg.webp"));
        products.add(new Product(6, "SACH06", "Sưởi Ấm Mặt Trời: Tập 2 Của Cây Cam Ngọt", 124.000, "https://salt.tikicdn.com/cache/750x750/ts/product/b8/41/3c/30ea9e85a0944d7d548b330420333506.jpg"));
        products.add(new Product(7, "SACH07", "Ngàn Mặt Trời Rực Rỡ", 99.600, "https://salt.tikicdn.com/cache/750x750/ts/product/d3/7f/75/fac27ade799ac1c2c026f764d94e2c83.jpg"));
        products.add(new Product(8, "SACH08", "Beartown - Thị trấn nhỏ, giấc mơ lớn", 139.000,"https://salt.tikicdn.com/cache/750x750/ts/product/a3/ef/a1/048355239396f0f7f123e7993a0e0066.jpg"));
        products.add(new Product(9, "SACH09", "Deep Work - Làm Ra Làm, Chơi Ra Chơi (Tái Bản)",112.000,"https://salt.tikicdn.com/cache/750x750/ts/product/34/73/6b/2582628bf067160b459d9b3f425050a9.jpg"));
        products.add(new Product(10, "SACH10", "Deep Work - Làm Ra Làm, Chơi Ra Chơi (Tái Bản)",112.000,"https://salt.tikicdn.com/cache/750x750/ts/product/34/73/6b/2582628bf067160b459d9b3f425050a9.jpg"));
        products.add(new Product(11,"SACH11","Không Bao Giờ Là Thất Bại! Tất Cả Là Thử Thách (Tái Bản 2023)",179.200,"https://salt.tikicdn.com/cache/750x750/ts/product/6a/2d/eb/e7d5542421f79e89e352861e127b6ba1.png"));
        products.add(new Product(12,"SACH12","Ngôn Từ Thay Đổi Tư Duy",129.000,"https://salt.tikicdn.com/cache/750x750/ts/product/c6/f4/4e/18f3b63655443740f19622ee30e79663.jpg"));
        products.add(new Product(13,"SACH13","Sách - Sống Thực Tế Giữa Đời Thực Dụng + Đừng Lựa Chọn An Nhàn Khi Còn Trẻ (Bộ 2 cuốn, Lẻ tùy chọn)",99.000,"https://salt.tikicdn.com/cache/750x750/ts/product/e8/5b/b2/2a4ca1e6cbe1d34a332a0ad4a63b65e5.jpg"));
        products.add(new Product(14,"SACH14","Dinh Dưỡng Lành Mạnh - Ngại Gì Bệnh Tim",168.350,"https://cdn1.fahasa.com/media/catalog/product/8/9/8935251417036.jpg"));
        products.add(new Product(15,"SACH15","Hoa Học Trò - Số 1458 - Mở Khóa Trại Hè Quốc Tế, Hành Trang Toàn Diện Cho Teen Sành Trải Nghiệm",20.000 ,"https://cdn1.fahasa.com/media/catalog/product/c/6/c6a8e3d0d458400ca90dfff4ad904d42.jpg"));
        products.add(new Product(16,"SACH16","Lớp học Mật Ngữ: Cuộc đua sao chổi",459.000,"https://cdn1.fahasa.com/media/catalog/product/e/b/eb7f9af9bc5cb8e852f206448b13d556.jpg"));
        products.add(new Product(17,"SACH17","Muôn Kiếp Nhân Sinh - Many Times, Many Lives - Tập 3 (Khổ Nhỏ)",83.200 ,"https://cdn1.fahasa.com/media/catalog/product/m/u/muonkiepnhansinh3_khonho_bia1.jpg"));
        products.add(new Product(18,"SACH18","Đọc Một Hơi - Lịch Sử Sài Gòn-Thành Phố Hồ Chí Minh - Bìa Cứng",28.500 ,"https://cdn1.fahasa.com/media/catalog/product/m/o/mockup-_mh---l_ch-s_-sg---tphcm-01-1.jpg"));
        products.add(new Product(19,"SACH19","Hoàng Tử Bé (Song Ngữ Việt-Anh)",109.000 ,"https://cdn1.fahasa.com/media/catalog/product/b/i/bia-1_6_6.jpg"));
        products.add(new Product(20,"SACH20","Khúc Ca Của Tế Bào - Khám Phá Phần Tử Cơ Bản Của Sinh Vật Và Con Người Mới - Bìa Cứng",287.200 ,"https://cdn0.fahasa.com/media/fahasa_web_image/product_skeleton.png"));


    }


}
