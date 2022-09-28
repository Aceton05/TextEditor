
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info
 */
public class SonderzeichenDialog extends JDialog implements ActionListener {    
    String auswahlZeichen="";
    String[] zeichen = {"\u00A0","\u00A1","\u00A2","\u00A3","\u00A4","\u00A5","\u00A9","\u00B1","\u00B7",
    "\u00D7","\u00AA","\u00BA","\u00AB","\u00BB","\u00BC","\u00BD","\u00BE"};

    public SonderzeichenDialog(JFrame frame){
        super(frame,"Sonderzeichen",true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel choosePanel =new JPanel(new GridLayout(0,6));        
        for(String z :zeichen){
            JButton button =new JButton(z);
            button.addActionListener(this);
            choosePanel.add(button);
        }
        add(choosePanel,BorderLayout.CENTER);        
        pack();
        
    }
    
    public void showDialog(){
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof JButton){
        JButton button = (JButton)e.getSource();
        auswahlZeichen= button.getText();
        setVisible(false);
        }        
    }
    
    public char getChar(){return auswahlZeichen.charAt(0);}
}
