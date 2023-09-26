package vjv.formulario;
import javax.swing.*;
public class Formulario1 extends JFrame
{
    public Formulario1()
    {
        setLayout(null);
    }
    public static void main(String[] args) {
        Formulario1 formulario1=new Formulario1();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
