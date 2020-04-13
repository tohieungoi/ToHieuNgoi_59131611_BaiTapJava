/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author tohie
 */
public class QuanLyNhanVien implements IQuanLy{
  
 ArrayList<NhanVien> DSNhanVien = new ArrayList<NhanVien>();
    @Override
    public void them(NhanVien nv) {
        DSNhanVien.add(nv);
    }

    @Override
    public void inDS() {
         for (int i = 0; i < DSNhanVien.size(); i++) {
            System.out.println("Nhan vien thu: "+(i+1));
            System.out.println(DSNhanVien.get(i).getThongTin());
        }
    }
    
}
