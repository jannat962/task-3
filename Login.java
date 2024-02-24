
package employeemanage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername;
    JPasswordField tfpassword;

    
        Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("ユーザーなまえ(User name) :");
        lblusername.setBounds(40, 20, 250, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(220, 20, 150, 30);
        add(tfusername);
         JLabel lblpassword = new JLabel("パスワード(Password) :");
        lblpassword.setBounds(40, 70, 250, 30);
        add(lblpassword);
        
        tfpassword = new JPasswordField(8);
        tfpassword.setEchoChar('*');
        tfpassword.setBounds(220, 70, 150, 30);
        add(tfpassword);
        
        JButton login = new JButton("ログイン(Login)");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
        
    }
        public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c;
            c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
         public static void main(String[] args) {
        new Login();
    }
    
}
