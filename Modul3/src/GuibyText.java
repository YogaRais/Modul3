import javax.swing.*;

import java.awt.event.ActionListener;

public class GuibyText extends JFrame {

    JLabel label1 = new JLabel( text: "Coba Input 1");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton(text: "Greet")

    JLabel label2 = new JLabel(text: "Panjang");
    JLabel label3 = new JLabel(text: "Lebar");
    JLabel label4 = new JLabel(text: "Hasil");
    JTextField tPanjang = new JTextField();
    JTextField tLebar = new JTextField();
    JTextField tHasil = new JTextField();
    JButton bHitung = new JButton(text: "Hitung Luas");

    GuibyText(){
        setSize( width: 640, height: 480);
        setLocationRelativeTo(null1);
        setTitle("Gui by Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakanKomponen(){
        getContentPane().setLayout(nul1);

        getContentPane().add(label1);
        getContentPane().add(textField1);
        getContentPane().add(button1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        getContentPane().add(tPanjang);
        getContentPane().add(tLebar);
        getContentPane().add(tHasil);
        getContentPane().add(bHitung);

        label1.setBounds(x: 16, y:32, width: 100, height: 35);
        textField1.setBounds(x: 124, y: 32, width: 100, height: 25);
        button1.setBounds(x: 232, y:32, width: 80, height: 25);
        label2.setBounds(x: 16, y:80, width: 100, height: 25);
        tPanjang.setBounds(x: 124, y:80, width: 100, height: 25);
        label3.setBounds(x: 16, y:113, width: 100, height: 25);
        tLebar.setBounds(x: 124, y:113, width: 100, height: 25);
        bHitung.setBounds(x: 16, y:146, width: 208, height: 25);
        label4.setBounds(x: 16, y:179, width: 100, height: 25);
        tHasil.setBounds(x: 124, y:179, width: 100, height: 25);
    }

    pubilc static void main(String[] args) {
        GuibyText guibyText = new GuibyText();
        guibyText.SetVisible(true);
    }

    void menambahkanListener(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionListener actionEvent) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(parentComponent: nul1, message: "Hai " + nama);
            }
            );}

        bHitung.addActionListener(actionEvent -> {
            int panjang = Integer.parseInt(tPanjang.getText());
            int lebar = Integer.parseInt(tLebar.getText());

            int hasil = panjang * lebar;
            String shasil = String.valueOf(hasil);

            tHasil.setText(sHasil);
        });
    }
}
