/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author tohie
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIT svIT = new SinhVienIT("Tran Van A","CNTT",9,9,9);
        SinhVienBiz svBiz = new SinhVienBiz("Nguyen Van B","KD thuong mai",9,9.5);
        svIT.xuat();
        svBiz.xuat();
    }
    
    
}
