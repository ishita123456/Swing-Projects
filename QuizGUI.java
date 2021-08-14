import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizGUI {

	public static void main(String[] args) {
		Quiz obj = new Quiz();
        obj.setVisible(true);
        obj.setSize(600,600);
	}
}

class Quiz extends JFrame
{
	Quiz(){
		setLayout(null);
		String ques[] = {"Q1) To use scanner class you need to import which package?", "Q3) Which scanner class method is used to read integer value from the user?", "Q3) Which of the following is associated with object?"};
		String op1[] = {"java.io.file", "next()", "State"};
		String op2[] = {"java.io.Scanner", "nextInteger()", "Behaviour"};
		String op3[] = {"java.util.Scanner", "nextInt()", "Identity"};
		String op4[] = {"java.util.file", "readInt()", "All of the above"};
		String ans[] = {"java.util.Scanner", "nextInt()", "All of the above"};
		int count = 0;

		//JLabel label = new JLabel();
		//label.setBounds(200,350,100,30);
		//add(label);
		JLabel l1 = new JLabel(ques[0]);
		l1.setBounds(50,50,300,30);
		add(l1);
		JRadioButton r1 = new JRadioButton(op1[0]);
		r1.setBounds(100,120,100,30);
		add(r1);
		JRadioButton r2 = new JRadioButton(op2[0]);
		r2.setBounds(350,120,100,30);
		add(r2);
		JRadioButton r3 = new JRadioButton(op3[0]);
		r3.setBounds(100,200,100,30);
		add(r3);
		JRadioButton r4 = new JRadioButton(op4[0]);
		r4.setBounds(350,200,100,30);
		add(r4);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		JButton b1 = new JButton("Submit");
		b1.setBounds(150,300,100,30);
		add(b1);
		JButton b2 = new JButton("Next");
		//b2.addActionListener(this);
		b2.setBounds(300,300,100,30);
		add(b2);
		b1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e)
			 {
				 if(e.getSource()==b1)
				 {
					 String check = "";
					 if(r1.isSelected())
					 check = r1.getText();
					 if(r2.isSelected())
					 check = r2.getText();
					 if(r3.isSelected())
					 check = r3.getText();
					 if(r4.isSelected())
					 check = r4.getText();
					 if(check.equals(ans[count]))
						 JOptionPane.showMessageDialog(null,"Right Answer");
					 else
					     JOptionPane.showMessageDialog(null,"Wrong Answer");
				 }

				 /*if (e.getSource()==b2)
				 {
				 count++;
				 l1.setText(ques[count]);
				 r1.setText(op1[count]);
				 r2.setText(op2[count]);
				 r3.setText(op3[count]);
				 r4.setText(op4[count]);
				 }*/
			 }
		});
	}
}
