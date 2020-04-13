/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author tohie
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv0 = new NhanVien("Nguyen Van A",20,"Binh Dinh", 3000000, 101);
        NhanVien nv1 = new NhanVien("Nguyen Van B",20,"Quy Nhon", 6000000, 99);
        NhanVien nv2 = new NhanVien("Nguyen Van C",20,"Binh Dinh", 9000000, 199);
        NhanVien nv3 = new NhanVien("Nguyen Van D",20,"Quy Nhon", 4000000, 201);
        NhanVien nv4 = new NhanVien("Nguyen Van E",20,"Binh Dinh", 7000000, 99);
       var qlnv = new QuanLyNhanVien();
     
       qlnv.them(nv0);
       qlnv.them(nv1);
       qlnv.them(nv2);
       qlnv.them(nv3);
       qlnv.them(nv4);
    
        qlnv.inDS();
}
}
