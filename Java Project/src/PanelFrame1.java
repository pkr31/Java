
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class PanelFrame1 extends javax.swing.JPanel {

    Random rd;

    public PanelFrame1() {
        initComponents();
        rd = new Random();
       new Animator().start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("FIRE", rd.nextInt(600),rd.nextInt(700));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    class Animator extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);

                } catch (Exception ex) {
                }
                 repaint();
            }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
    }
}
