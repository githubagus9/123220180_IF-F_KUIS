/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class loginPage extends JFrame implements ActionListener{
    
    JLabel headerLogin = new JLabel("Selamat Datang !");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField inputUsername = new JTextField();
    JPasswordField inputPassword = new JPasswordField();
    JButton login = new JButton("LOGIN");
    
    loginPage(){
        setVisible(true);
        setSize(500,350);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(headerLogin);
        headerLogin.setFont(new Font("arial", Font.BOLD,20));
        headerLogin.setBounds(25,5,250,35);
        
        add(username);
        username.setBounds(25,30,150,35);
        
        add(inputUsername);
        inputUsername.setBounds(25,30,435,25);
        
        add(password);
        username.setBounds(25,40,150,35);
        
        add(inputPassword);
        inputUsername.setBounds(25,40,435,25);
        
        add(login);
        login.addActionListener(this);
        login.setBounds(40,60,400,35);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
        String username = inputUsername.getText();
        String password = inputPassword.getText();
        
        if(username.isEmpty()){
            throw new Exception("Diharapkan login terlebih dahulu !");
        }
        
        if(password.isEmpty()){
            throw new Exception("Password salah !");
        }
        
        this.dispose();
    }
    catch(Exception error){
        JOptionPane.showMessageDialog(null,error.getMessage());
    }
}  

class halamanUtama extends JFrame implements ActionListener{
    JLabel headerUtama = new JLabel();
    JLabel perintah = new JLabel ("Silahkan pilih menu di bawah ini.");
    JButton anak = new JButton ("Majalah Anak");
    JButton remaja = new JButton ("Majalah Remaja");
    JButton dewasa = new JButton ("Majalah Dewasa");
    
    halamanUtama(String username){
        setVisible(true);
        setSize(500,350);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(headerUtama);
        headerUtama.setText("Selamat Datang, " + username);
        headerUtama.setFont(new Font("arial", Font.BOLD, 20));
        headerUtama.setBounds(25,5,10,35);
        
        add(perintah);
        perintah.setFont(new Font("arial", Font.BOLD, 15));
        perintah.setBounds(25,30,450,150);
        
        add(anak);
        anak.setBounds(25,60,460,35);
        anak.addActionListener(this);
        
        add(remaja);
        remaja.setBounds(25,90,460,35);
        remaja.addActionListener(this);
        
        add(dewasa);
        dewasa.setBounds(25,120,460,35);
        dewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}



/**
 *
 * @author Lab Informatika
 */
public class Kuis_123220180 {
    
    public static void main(String[] args){
        loginPage loginFrame = new loginPage();
    }

}
}
