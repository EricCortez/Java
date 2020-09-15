import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Act5 extends JFrame implements ActionListener {


 private  JLabel porcentaje;
    private JLabel sumaLaBel;
    private JLabel RestaLaBel;
    private JLabel multiLaBel;
    private JLabel DivLaBel;

    private JTextField numxField;

    private JTextField numYField;
    private JButton button;





    public static void   main (String [] args){

        Act5 demo = new Act5();
        demo.setSize(200,200);
        demo.createGUI();

        demo.setVisible(true);
    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window =getContentPane();
        window.setLayout(new FlowLayout());



        numxField=new JFormattedTextField(8);
        window.add(numxField);
        numYField=new JFormattedTextField(10);
        window.add(numYField);

        sumaLaBel= new JLabel();
         RestaLaBel= new JLabel();
        multiLaBel= new JLabel();
      DivLaBel= new JLabel();
porcentaje=new JLabel();
      window.add(sumaLaBel);
      window.add(RestaLaBel);
        window.add(multiLaBel);
        window.add(DivLaBel);
        window.add(porcentaje);





        button=new JButton("Hacer operaciones");
        window.add(button);
        button.addActionListener(this);

        sumaLaBel.setText("Suma  " );
        RestaLaBel.setText("Resta ");
        multiLaBel.setText("Multiplicacion ");
        DivLaBel.setText("Division ");
porcentaje.setText("Porcentaje : ");


    }

    public void actionPerformed(ActionEvent actionEvent) {

        float x=Float.parseFloat(numxField.getText());
        float y = Float.parseFloat((numYField.getText()));

        sumaLaBel.setText("Suma  " + (x+y));
        RestaLaBel.setText("Resta "+(x-y));
        multiLaBel.setText("Multiplicacion "+ (x*y));
        DivLaBel.setText("Division "+(x/y));
        porcentaje.setText("porcentaje "+ x%y);
    }
}
