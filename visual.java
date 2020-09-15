import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class visual extends JFrame implements ActionListener {
    private JLabel greetingLabel;
    private JTextField ageField;
    private JButton button;
    private JTextField decisionField;
    private JTextField commentaryField;
    private JTextField commentaryField2;
    private JTextField commentaryField1;

   public static void   main (String [] args){

       visual demo = new visual();
       demo.setSize(400,400);
       demo.setVisible(true);
       demo.createGUI();


   }

    void createGUI() {

       setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window =getContentPane();
        window.setLayout(new FlowLayout());
        greetingLabel = new JLabel("EDAD: ");

        window.add(greetingLabel);

        greetingLabel = new JLabel("Nombre: ");

        window.add(greetingLabel);


        ageField=new JFormattedTextField(5);
         window.add(ageField);
        button=new JButton("check");
        window.add(button);
         button.addActionListener(this);




   }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int age = Integer.parseInt(ageField.getText());
        if (age>17)
        {
            greetingLabel.setText("Eres mayor de edad puedes Votar ");
        }else
        {
            greetingLabel.setText("No Eres mayo de edad no puedes Votar ");
    }
   }
}
