/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author tohie
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var QLXe = new QuanLyChuyenXe();
        // Xe noi thanh
        ChuyenXe xeNoiThanh0 = new XeNoiThanh("000","NVan A","79-A123",7000,00,80);
        ChuyenXe xeNoiThanh1 = new XeNoiThanh("111","Ng Thi B","79-A4444",15000,11,78);
        ChuyenXe xeNoiThanh2 = new XeNoiThanh("222","Tran Dinh C","79-A6789",2500,22,25);
        QLXe.themChuyenXe(xeNoiThanh0);
        QLXe.themChuyenXe(xeNoiThanh1);
        QLXe.themChuyenXe(xeNoiThanh2);
        // Xe ngoai thanh
        ChuyenXe xeNgoaiThanh0 = new XeNgoaiThanh("AAA","NVan A","79-A123",7000,"Nha Trang",7);
        ChuyenXe xeNgoaiThanh1 = new XeNgoaiThanh("BBB","NVan A","79-A123",16900,"Da Nang",30);
        ChuyenXe xeNgoaiThanh2 = new XeNgoaiThanh("ABAB","NVan A","79-A123",700000,"Sai Gon",365);
        QLXe.themChuyenXe(xeNgoaiThanh0);
        QLXe.themChuyenXe(xeNgoaiThanh1);
        QLXe.themChuyenXe(xeNgoaiThanh2);
        //
        System.out.println("Danh Sach Chuyen Xe");
        QLXe.inDSChuyenXe();
        System.out.println("Tong Doanh THu Noi Thanh: "+ QLXe.tinhDoanhThuNoiThanh());
       
        System.out.println("Tong Doanh Thu Ngoai Thanh: "+ QLXe.tinhDoanhThuNgoaiThanh());
       
        System.out.println("Tong Toan Bo Doanh Thu: "+QLXe.tongDoanhThu());
        
    }
    
}
