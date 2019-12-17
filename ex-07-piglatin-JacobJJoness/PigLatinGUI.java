import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PigLatinGUI extends JFrame {

    JButton translateButton;
    JTextArea inputArea;
    JTextArea outputArea;

    public PigLatinGUI() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Pig Latin Translator");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1,5,5));
        translateButton = new JButton("Translate");
        inputArea = new JTextArea();
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.setEditable(true);
        inputArea.setText("Enter text to be translated.");
        outputArea = new JTextArea();
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setEditable(false);
        
        translateButton.addActionListener(event -> {
            String text = inputArea.getText();
            Scanner reader = new Scanner(text);
            String translatedText = "";
            while(reader.hasNext()) {
                translatedText += PigLatin.toPigLatin(reader.next()) + " ";

            }
            outputArea.setText(translatedText);
        });



        add(inputArea);
        add(translateButton);
        add(outputArea);
        
        

    }


    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new PigLatinGUI();
            ex.setVisible(true);
        });
    }
}