package View.Main;

import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewDataMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {
    JLabel header = new JLabel("Program Pendataan Mahasiswa dan Dosen");
    JButton tombolMahasiswa = new JButton("Data Mahasiswa");
    JButton tombolDosen = new JButton("Data Dosen");
    
    public MainMenu(){
        setTitle("Program Pendataan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(552, 540);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        add(header);
        add(tombolMahasiswa);
        add(tombolDosen);
        
        header.setBounds(45, 20, 440, 24);
        tombolMahasiswa.setBounds(15, 200, 512, 40);
        tombolDosen.setBounds(15, 260, 512, 40);
        
        header.setFont (header.getFont ().deriveFont (20.0f));
        header.setHorizontalAlignment(SwingConstants.CENTER);


        tombolMahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ketika tombol tambah diklik, maka program akan berpindah ke halaman InputData()
                dispose();
                new ViewDataMahasiswa();
            }
        });
                        
        tombolDosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ketika tombol tambah diklik, maka program akan berpindah ke halaman InputData()
                dispose();
                new ViewDataDosen();
            }
        });


    }
       


}
