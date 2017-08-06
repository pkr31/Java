
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;

public class PanelFrame2 extends javax.swing.JPanel {

    Random rd;
    int x = 400, y = 20;

    public PanelFrame2() {
        initComponents();
        rd = new Random();
        new Animator().start();
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

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
        g.setFont(new Font("Monospace", Font.BOLD, 30));
        /**
         * if (y >= 20 && y < 225) {
         * g.drawString("FIRE", x, y);
         * }
         * if (y >= 225) { g.drawString("Mr.Frag", x, y); } if (y < 20) {
         * g.drawString("Coding is Fun!!!", x, y); }
        *
         */
        if (x >= -20 && x <= 440) {
            if (y >= 20 && y < 50) {
                g.drawString("Hey", x, y);
            }
            if (y >= 50 && y < 80) {
                g.drawString("Hey there !!!", x, y);
            }
            if (y >= 80 && y < 110) {
                g.drawString("Hey there !!! This ", x, y);
            }
            if (y >= 110 && y < 140) {
                g.drawString("Hey there !!! This is", x, y);
            }
            if (y >= 140 && y < 170) {
                g.drawString("Hey there !!! This is Praful ", x, y);
            }
            if (y >= 170 && y < 200) {
                g.drawString("Hey there !!! This is Praful Kumar", x, y);
            }
            if (y >= 200 && y < 225) {
                g.drawString("Hey there !!! This is Praful Kumar Sharma", x, y);
            }

            if (y >= 225 && y < 255) {
                g.drawString("", x, y);
            }
            if (y >= 255 && y < 325) {
                g.drawString("And", x, y);
            }
            if (y >= 325 && y < 425) {
                g.drawString("And I", x, y);
            }
            if (y >= 425 && y < 525) {
                g.drawString("And I  Love", x, y);
            }
            if (y >= 525 && y < 625) {
                g.drawString("And I  Love To Code", x, y);
            }

        } else if (x >= 401) {
            if (y >= 625 && y < 630) {
                g.drawString("", x, y);
            }

            if (y > 225 && y <= 630) {
                g.drawString("Decalre variables Not War", x, y);
            }

            if (y > 175 && y <= 225) {
                g.drawString("Thank You ", x, y);
            }
            if (y > 125 && y <= 175) {
                g.drawString("Thank You  for", x, y);
            }
            if (y > 75 && y <= 125) {
                g.drawString("Thank You  for watching this !!!!", x, y);
            }

        }

    }

    class Animator extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(15);

                } catch (Exception ex) {
                }
                if (x >= -20 && x <= 440) {
                    if (y >= 20 && y < 225) {
                        x -= 2;
                        y++;

                        repaint();
                    } else if (y >= 225 && y < 676) {
                        x++;
                        y++;
                        repaint();

                    }
                } else if (x >= 401) {
                    if (y >= 225) {
                        x++;
                        y--;
                        repaint();

                    } else if (y < 225) {
                        x -= 3;
                        y--;
                        repaint();
                       
                    }

                }
                else if(y<=20){
                   System.exit(0);
                }

                        // Variables declaration - do not modify                     
                // End of variables declaration                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
        }
    }
}
