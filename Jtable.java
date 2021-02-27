import javax.swing.*;
import java.awt.*;
import cal implements ActionListener
{
    JFrame a;
    JLabel n1,n2,res;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    A(){
        a= new JFrame()
        a.setSize(500,500);
        a.setTitle("calci");
        a.setVisible(true);
        a.setLayout(null);
        n1= new JLabel("n1");
        n2= new JLabel("n2");
        res= new JLabel("res");
        b1= new JButton("+");
        b2= new JButton("-");
        b3= new JButton("*");
        b4= new JButton("/");
        t1= new JTextField();
        t2= new JTextField();
        t3= new JTextField();
        n1.setBounds(10,50,50,20);
        n2.setBounds(10,100,50,20);
        res.setBounds(10,150,50,20);
        t1.setBounds(100,50,150,20);
        t2.setBounds(100,150,150,20);
        t3.setBounds(100,250,150,20);
        b1.setBounds(50,250,50,50);
        b2.setBounds(150,250,50,50);
        b3.setBounds(250,250,50,50);
        b4.setBounds(350,250,50,50);
        a.add(n1);
        a.add(n2);
        a.add(res);
        a.add(t1);
        a.add(t2);
        a.add(t3);
        a.add(b1);
        a.add(b2);
        a.add(b3);
        a.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent y)
    {
        String s1= t1.getText();
        String s2= t2.getText();
        String res;
        int a= Integer.parseInt[s1];
        int b= Integer.parseInt[s2];
        int c;
        if(y.getSource()==b1)
        {
            c=a+b;
        }
        else if(y.getSource()==b2)
        c=a*b;
        else
        c=a/b;
        t3.setText(String.valueof(c));
    }
    public  static void main(String args[])
    {
        cal x= new cal();
    }
}

