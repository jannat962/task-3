
package employeemanage;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("しょくいん の しょう さ いをついか");
        heading.setBounds(40, 30, 1000, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
         JLabel heading1 = new JLabel("(Add Employee details)");
        heading1.setBounds(40, 60, 1000, 50);
        heading1.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(heading1);
        
        JLabel labelname = new JLabel("なまえ");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
         JLabel labelname1 = new JLabel("(Name)");
        labelname1.setBounds(50, 170, 150, 30);
        labelname1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelname1);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("チチオヤノなまえ");
        labelfname.setBounds(400, 150, 350, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);
        JLabel labelfname1 = new JLabel("(Father Name)");
        labelfname1.setBounds(400, 170, 250, 30);
        labelfname1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelfname1);
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("たんじょうび");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
         JLabel labeldob1 = new JLabel("(Date of Birth)");
        labeldob1.setBounds(50, 220, 350, 30);
        labeldob1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labeldob1);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelsalary = new JLabel("きゅうりょう");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        JLabel labelsalary1 = new JLabel("(Salary)");
        labelsalary1.setBounds(400, 220, 150, 30);
        labelsalary1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelsalary1);
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("じゅうしょ ");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        JLabel labeladdress1 = new JLabel("(Address)");
        labeladdress1.setBounds(50, 270, 150, 30);
        labeladdress1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labeladdress1);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("でんわ");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        JLabel labelphone1 = new JLabel("(Phone No)");
        labelphone1.setBounds(400, 270, 150, 30);
        labelphone1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelphone1);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("メール");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        JLabel labelemail1 = new JLabel("(Email Id)");
        labelemail1.setBounds(50, 320, 150, 30);
        labelemail1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelemail1);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("さいこうがくれき ");
        labeleducation.setBounds(400, 300, 250, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        JLabel labeleducation1 = new JLabel("(Educational Degree)");
        labeleducation1.setBounds(400, 320, 400, 30);
        labeleducation1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labeleducation1);
        
        String courses[] = {"BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD","BBA", "BCA", "BA", "BSC", "B.COM"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("やくしょく");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        JLabel labeldesignation1 = new JLabel("(Designation)");
        labeldesignation1.setBounds(50, 370, 250, 30);
        labeldesignation1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labeldesignation1);
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("しみんばんごう");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        JLabel labelaadhar1 = new JLabel("(Citizenship No)");
        labelaadhar1.setBounds(400, 370, 250, 30);
        labelaadhar1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelaadhar1);
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("しゃいん Id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        JLabel labelempId1 = new JLabel("(Employee Id)");
        labelempId1.setBounds(50, 420, 150, 30);
        labelempId1.setFont(new Font("serif", Font.PLAIN, 15));
        add(labelempId1);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        add = new JButton("しょうさいをついか(Add)");
        add.setBounds(250, 550, 180, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("もどる(Back)");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String destination = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+destination+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "しょうさいがせいこうりについかされました");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
