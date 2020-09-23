package Unidad1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame implements InterfaceView{
    private final JTextArea text;
    private final JButton encryptJButton;
    private final JButton decryptJButton;
    private final JButton saveJButton;
    private final JButton openJButton;
    private final JTextField fileName;
    
    public View(){
        super("Cipher");
        JPanel fileJPanel;
        JLabel lblFile;
        JPanel buttonJPanel;
        BorderLayout layout;
        layout = new BorderLayout(30,20);
        setLayout(layout);
        fileJPanel = new JPanel();
        fileJPanel.setLayout(new FlowLayout());
        lblFile = new JLabel("Archivo de texto/Cifrado: ");
        lblFile.setToolTipText("Archivo a abrir");
        fileJPanel.add(lblFile);
        fileName = new JTextField(30);
        fileJPanel.add(fileName);
        add(fileJPanel, BorderLayout.NORTH);
        text = new JTextArea(10,15);
        add(new JScrollPane(text), BorderLayout.CENTER);
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(4,1));
        openJButton = new JButton(Open);
        buttonJPanel.add(openJButton);
        encryptJButton = new JButton(Encrypt);
        //Acciones
        encryptJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saludos StackOverflow!");
            }

        });
        buttonJPanel.add(encryptJButton);
        decryptJButton = new JButton(Decrypt);
        buttonJPanel.add(decryptJButton);
        saveJButton = new JButton(Save);
        buttonJPanel.add(saveJButton);
        add(buttonJPanel, BorderLayout.EAST);
    }
    
    public String getFileName(){
        return fileName.getText();
    }
    
    public String getText(){
        return text.getText();
    }
    
    public void setText(String s){
        text.setText(s);
    }
    
    public void setController(Controller c){
        openJButton.addActionListener(c);
        saveJButton.addActionListener(c);
        encryptJButton.addActionListener(c);
        decryptJButton.addActionListener(c);
    }
    
}