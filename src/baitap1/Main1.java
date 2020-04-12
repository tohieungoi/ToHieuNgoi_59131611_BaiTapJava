/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author tohie
 */
public class Main1 {
//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      NhanVien nv1 = new NhanVien();
      nv1.setTen("Nguyen Quang Trung");
      nv1.setTuoi(21);
      nv1.setDiaChi("Quy Nhon , Binh Dinh");
      nv1.setTienLuong(7000000);
      nv1.setTongGioLam(99); 
      //
      NhanVien nv2 = new NhanVien();
      nv2.setTen("Han Mac Tu");
      nv2.setTuoi(26);
      nv2.setDiaChi("Quy Nhon , Binh Dinh");
      nv2.setTienLuong(14000000);
      nv2.setTongGioLam(201); 
      //in thong tin nv
      System.out.println(nv1.getThongTin()+"\t tien thuong:"+nv1.tinhThuong() );
      System.out.println(nv2.getThongTin()+"\t tien thuong:"+nv2.tinhThuong()) ;
      
      
    }
    
}
