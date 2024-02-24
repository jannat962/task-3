package employeemanage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/emp.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("しょくいん カンリ システム(Employee Management System)");
        heading.setBounds(20, 50, 500, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 15));
        image.add(heading);
        
        add = new JButton("しょくいんをついか(Add)");
        add.setBounds(500, 280, 250, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("しょくいんをみる(View)");
        view.setBounds(800, 280, 250, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("しょくいんをこうしん(Update) ");
        update.setBounds(500, 340, 250, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("しょくいんをさくじょ(Remove)");
        remove.setBounds(800, 340, 250, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}

