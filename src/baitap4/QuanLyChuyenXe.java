/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author tohie
 */
public class QuanLyChuyenXe {
    public    ArrayList<ChuyenXe> DSChuyenXe = new ArrayList<ChuyenXe>();
    
    public void themChuyenXe(ChuyenXe cx)
    {
        DSChuyenXe.add(cx);
    }
    public void inDSChuyenXe()
    {
        for(int i=0;i<DSChuyenXe.size();i++)
        {
            DSChuyenXe.get(i).inThongTinChuyenXe();
            System.out.println("\t \t -------\t \t");
        }
    }
    public double tinhDoanhThuNoiThanh(){
        double doanhThu = 0;
        for(int i = 0; i <DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i) instanceof XeNoiThanh)
                doanhThu += DSChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double doanhThu = 0;
        for(int i = 0; i <DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i) instanceof XeNgoaiThanh)
                doanhThu += DSChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
    
    public double tongDoanhThu(){
        double doanhThu = 0;
        for(int i = 0; i <DSChuyenXe.size(); i++){
            doanhThu += DSChuyenXe.get(i).getDoanhThu();
        }
        return doanhThu;
    }
}

