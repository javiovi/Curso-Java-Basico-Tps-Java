import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainForm {

    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton buttonCalculate;
    private JPanel taxPanel;


public MainForm(){

    buttonCalculate.addActionListener(new ActionListener() { 
    @Override
    public void actionPerformed(ActionEvent e) {
        double p = Double.parseDouble(pricePane.getText());
        double t = Double.parseDouble(taxPane.getText());

        double result = p + (p/ 100* t);
        totalPane.setText(Double.toString(result));
    } })
;
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
    
}