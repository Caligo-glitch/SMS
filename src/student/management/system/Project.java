
package student.management.system;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        setSize(1540,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1500,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        //NEW INFORMATION
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //DETAILS
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //APPLY FOR LEAVE
        JMenu leave = new JMenu("Apply Leave");
       leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
         //LEAVE DETAILS
        JMenu leaveDetails = new JMenu("Leave Details");
       leaveDetails.setForeground(Color.BLUE);
        mb.add(leaveDetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        //EXAM
        JMenu exam = new JMenu("Examination");
       exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
       examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
         JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //UPDATE INFORMATION
        JMenu updateInfo = new JMenu("Update Details");
       updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        //FEE
        JMenu fee = new JMenu("Fee Details");
       fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        //UTILITY
        JMenu utility = new JMenu("Utility");
       utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        
        //EXIT
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String msg = ae.getActionCommand();
        if(msg.equals("Exit")){
           setVisible(false);  
        }else if (msg.equals("Calculator")){
            try{
             Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                
            }
        }else if (msg.equals("Notepad")){
            try{
             Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                
            }
        } else if (msg.equals("New Student Information")){
            new AddStudent();
        } else if (msg.equals("View Student Details")){
            new StudentDetails();
        } else if (msg.equals("Student Leave")){
            new StudentLeave();
        } else if (msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        } else if (msg.equals("Update Student Details")){
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")){
            new EnterMarks();
        } else if (msg.equals("Examination Results")){
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")){
            new FeeStructure();
        } else if (msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
        
    
    }
    
     public static void main(String[] args){
        new Project(); //anonymous obj
    }
}


