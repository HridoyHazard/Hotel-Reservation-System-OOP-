import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Shahadat
 */
public class HotelReservation extends JFrame { //Jfram is Parent Class it inherited HotelReservation by extends
                                                //HotelReservation is Child Class

    private static void setsize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods
    }
    public String Name;
    private Container c; //body
    private JLabel jNumber,jName, jName1, jType, jRoom, jNight, jAddress, jRelative, jSpecial, jGender,jReserve;
    private JComboBox jcb, jcb1, jcb2;
    private Font font, font1;
    private JTextField jtf, jtf1, jtf2,jtf3,jtf4;
    private String[] room = {" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19", "20", "21", "22", "23", "24", "25", "26", "27",
                                    "28", "29", "30", "31", "32", "33", "34","35"};

    private String[] night = {" ", "1", "2", "3", "4", "5", "6", "7"};
    private String[] type = {" ", "Standard Room (1 to 2)", "Family Room (1 to 4)", "Private Room (1 to 3)", "Mix Dorm Room (6)", "Male Dorm Room (6)", "Female Dorm Room (6)"};

    private JRadioButton jrb, jrb1;
    private ButtonGroup bg;

    private JButton jb, jb1, jb2, jb3;
    private JTextArea jta;

    HotelReservation() { //child Class called Method 
        initInformation();
    }

    public void initInformation() { // this is method
        c = this.getContentPane();
        c.setLayout(null);
        setSize(700,500);
        c.setBackground(Color.gray);

        font = new Font("Tahoma", Font.BOLD, 24);
        font1 = new Font("Tahoma", Font.BOLD, 15);

        bg = new ButtonGroup();

        jName = new JLabel("Hotel Reservation");
        jName.setBounds(400, 0, 400, 100);
        jName.setFont(font);
        c.add(jName);
            
        //labels
        
        jName1 = new JLabel("Full Name: ");
        jName1.setBounds(50, 40, 200, 120);
        jName1.setFont(font1);
        c.add(jName1);

        jtf = new JTextField();
        jtf.setBounds(170, 85, 200, 40);
        jtf.setFont(font1);
        jtf.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jtf);

        jRoom = new JLabel("Room No: ");
        jRoom.setBounds(50, 100, 200, 120);
        jRoom.setFont(font1);
        c.add(jRoom);
        
        jcb = new JComboBox(room);
        jcb.setBounds(170, 140, 200, 40);
        jcb.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jcb);
        
        jNight = new JLabel("Nights: ");
        jNight.setBounds(50, 160, 200, 120);
        jNight.setFont(font1);
        c.add(jNight);

        jcb1 = new JComboBox(night);
        jcb1.setBounds(170, 200, 200, 40);
        jcb1.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jcb1);
            
        jAddress = new JLabel("Address: ");
        jAddress.setBounds(50, 220, 200, 120);
        jAddress.setFont(font1);
        c.add(jAddress);

        jtf1 = new JTextField();
        jtf1.setBounds(170, 260, 200, 40);
        jtf1.setFont(font1);
        jtf1.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jtf1);
        
        jType = new JLabel("Room Types: ");
        jType.setBounds(50, 280, 200, 120);
        jType.setFont(font1);
        jType.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jType);
        
        jcb2 = new JComboBox(type);
        jcb2.setBounds(170, 320, 200, 40);
        
        c.add(jcb2);
        
        jGender = new JLabel("Gender: ");
        jGender.setBounds(50, 340, 200, 120);
        jGender.setFont(font1);
        c.add(jGender);

        jrb = new JRadioButton("Male");
        jrb.setBounds(170, 380, 100, 40);
        jrb.setFont(font1);
        c.add(jrb);

        jrb1 = new JRadioButton("Female");
        jrb1.setBounds(300, 380, 100, 40);
        jrb1.setFont(font1);
        c.add(jrb1);

        bg.add(jrb);
        bg.add(jrb1);

        jRelative = new JLabel("Requests: ");
        jRelative.setBounds(50, 400, 200, 120);
        jRelative.setFont(font1);
        c.add(jRelative);
        
        jtf2 = new JTextField();
        jtf2.setBounds(170, 440, 200, 40);
        jtf2.setFont(font1);
        jtf2.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jtf2);
        
        jNumber= new JLabel("Number: ");
        jNumber.setBounds(50,460,200,120);
        jNumber.setFont(font1);
        c.add(jNumber);
        
        jtf3 = new JTextField();
        jtf3.setBounds(170, 500, 200, 40);
        jtf3.setFont(font1);
        jtf3.setBorder(new LineBorder(Color.BLACK,0));
        c.add(jtf3);
        
        jReserve= new JLabel("Reserve Date: ");
        jReserve.setBounds(50,520,200,120);
        jReserve.setFont(font1);
        c.add(jReserve);
        
        jtf4 = new JTextField();
        jtf4.setBounds(170, 560, 200, 40);
        jtf4.setBorder(new LineBorder(Color.BLACK,0));
        jtf4.setFont(font1);
        c.add(jtf4);

        
        //Buttons
        
        jb = new JButton("Save");
        jb.setBounds(170, 620, 80, 40);
        jb.setFont(font1);
        c.add(jb);

        jb1 = new JButton("Cancel");
        jb1.setBounds(280, 620, 100, 40);
        jb1.setFont(font1);
        c.add(jb1);

        jta = new JTextArea();
        jta.setBounds(500, 100, 400, 400);
        jta.setFont(font1);
        c.add(jta);

        jb2 = new JButton("Print");
        jb2.setBounds(600, 530, 80, 40);
        c.add(jb2);

        jb3 = new JButton("Clear"); 
        jb3.setBounds(750, 530, 80, 40);
        c.add(jb3);

        jb2.addActionListener(new ActionListener() { // this is ok button how it works
            @Override
            public void actionPerformed(ActionEvent ae) {

                String s = jtf.getText();
                String s1 = jcb.getSelectedItem().toString();
                String s2 = jcb1.getSelectedItem().toString();
                String s3 = jtf1.getText();
                String s4 = jcb2.getSelectedItem().toString();
                String s5 = jtf2.getText();
                String s6 = jtf3.getText();
                String s7 = jtf4.getText();
                

                if (!s.isEmpty()) {
                    jta.append("Name: " + s + "\n");
                }

                if (!s1.isEmpty() && s1 != " ") {
                    jta.append("Room No: " + s1 + "\n");
                }

                if (!s2.isEmpty() && s2 != " ") {
                    jta.append("Number of Nights: " + s2 + "\n");
                }

                if (!s3.isEmpty()) {
                    jta.append("Address: " + s3 + "\n");
                }

                if (!s4.isEmpty() && s4 != " ") {
                    jta.append("Room Types: " + s4 + "\n");
                }

                if (jrb.isSelected()) {
                    jta.append("Gender : " + "Male" + "\n");
                } else if (jrb1.isSelected()) {
                    jta.append("Gender : " + "Female" + "\n");
                }

                if (!s5.isEmpty()) {
                    jta.append("Special Requests: " + s5 + "\n");
                }
                if (!s6.isEmpty()) {
                    jta.append("Number: " + s6 + "\n");
                }
                if (!s7.isEmpty()) {
                    jta.append("Reservation Date: " + s7 + "\n");
                }

            }
        });
        jb1.addActionListener(new ActionListener() { // this is cancel button 
            @Override
            public void actionPerformed(ActionEvent ae) {

                String s = jtf.getText();
                String s1 = jcb.getSelectedItem().toString();
                String s2 = jcb1.getSelectedItem().toString();
                String s3 = jtf1.getText();
                String s4 = jcb2.getSelectedItem().toString();
                String s5 = jtf2.getText();
                String s6 = jtf3.getText();
                String s7 = jtf4.getText();

                if (!s.isEmpty()) {
                    jtf.setText(" "); // this means empty kora 
                }

                if (!s1.isEmpty() && s1 != " ") {
                    jcb.setSelectedItem(" ");
                }

                if (!s2.isEmpty() && s2 != " ") {
                    jcb1.setSelectedItem(" ");
                }

                if (!s3.isEmpty()) {
                    jtf1.setText(" ");
                }

                if (!s4.isEmpty() && s4 != " ") {
                    jcb2.setSelectedItem(" ");
                }

                if (jrb.isSelected()) {
                    jrb.setSelected(false);
                } 
                else if (jrb1.isSelected()) {
                    jrb1.setSelected(true);
                }

                if (!s5.isEmpty()) {
                    jtf2.setText(" ");
                }
                if (!s6.isEmpty()) {
                    jtf3.setText(" ");
                }
                if (!s7.isEmpty()) {
                    jtf4.setText(" "); // eno kita korse??
                }
                
            }
        });
    
            
        jb.addActionListener(new ActionListener() { // this is save button
            @Override
            public void actionPerformed(ActionEvent ae) {

                String s = jtf.getText();
                String s1 = jcb.getSelectedItem().toString();
                String s2 = jcb1.getSelectedItem().toString();
                String s3 = jtf1.getText();
                String s4 = jcb2.getSelectedItem().toString();
                String s5 = jtf2.getText();
                String s6 = jtf3.getText();
                String s7 = jtf4.getText();
               
                
                File file1 = new File("F:\\Hotel Reservation Project\\Hotel.txt");

              
                try {
             
                    file1.createNewFile();
                    System.out.println("File is created");
                    Formatter formatter = new Formatter("F:\\Hotel Reservation Project\\Hotel.txt");

                 
                    if (!s.isEmpty()) {
                        formatter.format("Full Name: " + s+"\n");
                    }
                    if (!s1.isEmpty()) {
                        formatter.format("Room No: " + s1+"\n");
                    }
                    if (!s2.isEmpty()) {
                        formatter.format("Number Of Nights: " + s2+"\n");
                    }
                    if (!s3.isEmpty()) {
                        formatter.format("Address: " + s3+"\n");
                    }
                    if (!s4.isEmpty()) {
                        formatter.format("Room Type: " + s4+"\n");
                    }
                    
                    if(jrb.isSelected())
                    {
                         formatter.format("Gender: " + "Male"+"\n");
                         //String s6=jrb.isSelected()
                    }
                    if(jrb1.isSelected())
                    {
                         formatter.format("Gender: " + "Female"+"\n");
                    }
                    if (!s5.isEmpty()) {
                        formatter.format("Special request: " + s5+"\n");
                    }
                    if (!s6.isEmpty()) {
                        formatter.format("Number: " + s6+"\n");
                    }
                    if (!s7.isEmpty()) {
                        formatter.format("Reserve Date: " + s7+"\n");
                    }

                    formatter.close();

                } 
                catch (Exception e) {
                    System.out.println("Not Created");

                }

            }
        });
        
        jb3.addActionListener(new ActionListener() { // this is clear button kaj
            @Override
            public void actionPerformed(ActionEvent ae) {

                jta.setText(" "); //string khali kore deoa 

            }
        });
 
    }
    public static void main(String[] args) {

        HotelReservation frame = new HotelReservation(); // ekhan theke call hoise
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setBounds(100, 100, 1000, 1000);
        frame.setTitle("Hotel Reservation");
        frame.setVisible(true);
    }

}
