import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Main {
  void main() {
    System.out.println("Hello me!");
    JFrame frame = new JFrame("hackramadhan2025");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 800);
    frame.getContentPane().setBackground(Color.darkGray);

    // set icon
    ImageIcon icon = new ImageIcon("icon.png");
    frame.setIconImage(icon.getImage());

    // Layouting
    frame.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    // Panel for button and checkbox
    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());

    JButton addButton = new JButton("Tambah Checklist");
    addButton.setBackground(Color.GRAY);
    addButton.setForeground(Color.BLACK);

    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(addButton, gbc);

    // ActionListener untuk tombol
    addButton.addActionListener(e -> {
      // Checkbox dan label saat tombol ditekan
      JCheckBox checkBox = new JCheckBox("Checklist Item");
      checkBox.setBackground(Color.DARK_GRAY); // Set background checkbox agar sama
      checkBox.setForeground(Color.BLACK); // Set warna checkbox

      JLabel label = new JLabel("Deskripsi untuk checklist");
      label.setForeground(Color.BLACK); // Warna tulisan di label

      gbc.gridx = 0;
      gbc.gridy = 1; // Posisi checkbox di bawah tombol
      panel.add(checkBox, gbc);

      gbc.gridx = 0;
      gbc.gridy = 2; // Posisi label di bawah checkbox
      panel.add(label, gbc);

      panel.revalidate(); // Update layout
      panel.repaint(); // Refresh tampilan
    });

    // Tambahkan panel ke frame
    frame.add(panel);

    frame.setVisible(true);
  }
}
