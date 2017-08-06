

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class DialogFrame extends javax.swing.JFrame implements ActionListener {

    public DialogFrame() {
        initComponents();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        b1.setText("Message");

        b2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        b2.setText("Color");

        b3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        b3.setText("File");

        b4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        b4.setText("Command ");

        b5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        b5.setText("Custom");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(b1)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b5)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1){
            JOptionPane.showMessageDialog(this,"Hello  there people","Message",JOptionPane.WARNING_MESSAGE);
        }
      else  if(e.getSource()==b2){
        JColorChooser d=new JColorChooser();
        Color c=d.showDialog(this,"Choose a Color",Color.BLACK);
        if(c!=null){
            getContentPane().setBackground(c);
        }
        
      }
      else if(e.getSource()==b3){
          JFileChooser j=new JFileChooser();
          j.showOpenDialog(this);
      }
      else if(e.getSource()==b4){
        String str= JOptionPane.showInputDialog(this,"Enter the Command");
         if(str!=null){
            try {
                Runtime.getRuntime().exec(str);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,"Command Not Found");
            }
         }
      }
      else if(e.getSource()==b5){
          TimeDialog t=new TimeDialog(this,true);
          t.setLocationRelativeTo(this);
          t.setVisible(true);
         t.setResizable(false);
      }
       
    }
}
