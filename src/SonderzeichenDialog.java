
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    //String[] zeichen = {"\u00A0","\u00A1","\u00A2","\u00A3","\u00A4","\u00A5","\u00A9","\u00B1","\u00B7",
    //"\u00D7","\u00AA","\u00BA","\u00AB","\u00BB","\u00BC","\u00BD","\u00BE"};
    String[] zeichen ={
     "\u00a1","\u00a2","\u00a3","\u00a4"
    ,"\u00a5","\u00a6","\u00a7","\u00a8"
    ,"\u00a9","\u00aa","\u00ab","\u00ac"
    ,"\u00ad","\u00ae","\u00af"
    ,"\u00b0","\u00b1","\u00b2","\u00b3"
    ,"\u00b4","\u00b5","\u00b6","\u00b7"
    ,"\u00b8","\u00b9","\u00ba","\u00bb"
    ,"\u00bc","\u00bd","\u00be","\u00bf"
    ,"\u00c0","\u00c1","\u00c2","\u00c3"
    ,"\u00c4","\u00c5","\u00c6","\u00c7"
    ,"\u00c8","\u00c9","\u00ca","\u00cb"
    ,"\u00cc","\u00cd","\u00ce","\u00cf"
    ,"\u00d0","\u00d1","\u00d2","\u00d3"
    ,"\u00d4","\u00d5","\u00d6","\u00d7"
    ,"\u00d8","\u00d9","\u00da","\u00db"
    ,"\u00dc","\u00dd","\u00de","\u00df"
    ,"\u00e0","\u00e1","\u00e2","\u00e3"
    ,"\u00e4","\u00e5","\u00e6","\u00e7"
    ,"\u00e8","\u00e9","\u00ea","\u00eb"
    ,"\u00ec","\u00ed","\u00ee","\u00ef"
    ,"\u00f0","\u00f1"
    ,"\u00f2","\u00f3","\u00f4","\u00f5"
    ,"\u00f6","\u00f7","\u00f8"
    ,"\u00f9","\u00fa","\u00fb","\u00fc"
    ,"\u00fd","\u00fe","\u00ff"
    ,"\u0391","\u0392","\u0393","\u0394"
    ,"\u0395","\u0396","\u0397","\u0398"
    ,"\u0399","\u039a","\u039b","\u039c"
    ,"\u039d","\u039e","\u039f","\u03a0"
    ,"\u03a1","\u03a3","\u03a4","\u03a5"
    ,"\u03a6","\u03a7","\u03a8","\u03a9"
    ,"\u03b1","\u03b2","\u03b3","\u03b4"
    ,"\u03b5","\u03b6","\u03b7","\u03b8"
    ,"\u03b9","\u03ba","\u03bb","\u03bc"
    ,"\u03bd","\u03be","\u03bf","\u03c0"
    ,"\u03c1","\u03c2","\u03c3","\u03c4"
    ,"\u03c5","\u03c6","\u03c7","\u03c8"
    ,"\u03c9","\u03d1","\u03d2","\u03d6"
    ,"\u2022","\u2026","\u2032","\u2033"
    ,"\u203e","\u2044"
    ,"\u2118","\u2111","\u211c","\u2122"
    ,"\u2135"
    ,"\u2190","\u2191","\u2192","\u2193"
    ,"\u2194","\u21b5","\u21d0","\u21d1"
    ,"\u21d2","\u21d3","\u21d4"
    ,"\u2200","\u2202","\u2203","\u2205"
    ,"\u2207","\u2208","\u2209","\u220b"
    ,"\u220f","\u2211","\u2212","\u2217"
    ,"\u221a","\u221d","\u221e","\u2220"
    ,"\u2227","\u2228","\u2229","\u222a"
    ,"\u222b","\u2234","\u223c","\u2245"
    ,"\u2248","\u2260","\u2261","\u2264"
    ,"\u2265","\u2282","\u2283","\u2284"
    ,"\u2286","\u2287","\u2295","\u2297"
    ,"\u22a5","\u22c5"
    ,"\u2308","\u2309","\u230a","\u230b"
    ,"\u2329","\u232a"
    ,"\u25ca","\u2660","\u2663","\u2665"
    ,"\u2666"
    ,"\u0152","\u0153","\u0160","\u0161"
    ,"\u0178"
    ,"\u02c6","\u02dc"
    ,"\u2002","\u2003","\u2009","\u200c"
    ,"\u200d","\u200e","\u200f","\u2013"
    ,"\u2014","\u2018","\u2019","\u201a"
    ,"\u201c","\u201d","\u201e","\u2020"
    ,"\u2021","\u2030","\u2039","\u203a"
    ,"\u20ac"
  };
    

    public SonderzeichenDialog(JFrame frame){
        super(frame,"Sonderzeichen",true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel choosePanel =new JPanel(new GridLayout(0,15));         
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
