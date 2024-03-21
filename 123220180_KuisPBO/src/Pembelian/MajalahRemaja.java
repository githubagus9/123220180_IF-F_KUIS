/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembelian;
import javax.swing.*;

class halamanRemaja extends JFrame{
    JLabel headerRemaja = new JLabel("Halaman Pembelian");
    JLabel tulisan1 = new JLabel("Kategori");
    JLabel tulisan2 = new JLabel("Majalah Remaja");
    JLabel tulisan3 = new JLabel("Harga");
    JLabel tulisan4 = new JLabel("Rp. 15.200/pcs");
    JLabel tulisan5 = new JLabel("Jumlah");
    JTextField inputJumlah = new JTextField();
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    JLabel tulisan6 = new JLabel("Total Pembelian :");
    JLabel tulisan7 = new JLabel("Harga satuan");
    JLabel tulisan8 = new JLabel("Jumlah");
    JLabel tulisan9 = new JLabel("Total harga");
    JLabel hargaSatuan = new JLabel ("0");
    JLabel totalJumlah = new JLabel ("0");
    JLabel totalHarga = new JLabel ("0");
    


    halamanRemaja(){
        setVisible(true);
        setSize(600,400);
        setTitle("Pembelian Majalah Anak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(headerRemaja);
        headerRemaja.setBounds(25,5,150,35);
        
        add(tulisan1);
        tulisan1.setBounds(25,25,150,35);
        
        add(tulisan2);
        tulisan2.setBounds(100,25,150,35);
        
        add(tulisan3);
        tulisan3.setBounds(25,50,150,35);
        
        add(tulisan4);
        tulisan4.setBounds(100,50,150,35);
        
        add(tulisan5);
        tulisan5.setBounds(25,75,150,35);
        
        add(inputJumlah);
        inputJumlah.setBounds(100,75,150,35);
        
        add(kembali);
        tulisan1.setBounds(25,100,150,35);
        
        add(beli);
        tulisan1.setBounds(100,100,150,35);
        
        add(tulisan6);
        tulisan6.setBounds(25,120,150,35);
        
        add(tulisan7);
        tulisan7.setBounds(25,140,150,35);
        
        add(tulisan8);
        tulisan8.setBounds(25,160,150,35);
        
        add(tulisan9);
        tulisan9.setBounds(25,180,150,35);
        
        add(hargaSatuan);
        hargaSatuan.setBounds(100,140,150,35);
        
        add(totalJumlah);
        totalJumlah.setBounds(100,160,150,35);
        
        add(totalHarga);
        totalHarga.setBounds(100,180,150,35);
        
    }
}

/**
 *
 * @author Lab Informatika
 */
public class MajalahRemaja {
    
}
