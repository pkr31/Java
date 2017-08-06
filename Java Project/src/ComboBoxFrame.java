
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class ComboBoxFrame extends javax.swing.JFrame implements ActionListener, ItemListener {

    public ComboBoxFrame() {
        initComponents();
        jButton1.addActionListener(this);
        jComboBox1.addItemListener(this);
        jComboBox1.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText(" Branch          :");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Student Name :");

        jComboBox1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electronics and Communication Engineering", "Computer Science Engineering", "Electrical Engineering", "Civil Engineering", "Mechanical Engineeing" }));
        jComboBox1.setSelectedIndex(-1);

        jComboBox2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Show Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if (e.getSource() == jComboBox1) {
            
            jComboBox2.removeAllItems();
            int Branch = jComboBox1.getSelectedIndex();

            switch (Branch) {
                case 0:
                    jComboBox2.addItem("Praphulla Panday");
                    jComboBox2.addItem("Swarnim Singh");
                    jComboBox2.addItem("Praful Kumar");
                    jComboBox2.addItem("Rishab Singhal");

                    break;
                case 1:
                    jComboBox2.addItem("Rajat Singh Panwar");
                    jComboBox2.addItem("Piyush Pangtey");
                    jComboBox2.addItem("Prashant Agarwal");
                    jComboBox2.addItem("Deepak Kumar");
                    break;
                case 2:
                    jComboBox2.addItem("Bhawan Rajawat");
                    jComboBox2.addItem("Vaibhav Singhal");
                    jComboBox2.addItem("Bharat Garwal");
                    jComboBox2.addItem("Abhyudaya Anand Mishra");
                    break;
                case 3:
                    jComboBox2.addItem("Suryakant Butola");
                    jComboBox2.addItem("Shubham Malik");
                    jComboBox2.addItem("Ramvilas Patel");
                    jComboBox2.addItem("Kshtij Rajvansh");
                    break;
                case 4:
                    jComboBox2.addItem("Vinay Yadav");
                    jComboBox2.addItem("Shekhar Paliwal");
                    jComboBox2.addItem("Rohit Singh");
                    jComboBox2.addItem("Shubham Sahu");
                    break;
              
            }
            jComboBox2.setSelectedIndex(-1);

        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            String Branch = jComboBox1.getSelectedItem().toString();
            String Name = jComboBox2.getSelectedItem().toString(); 
            JOptionPane.showMessageDialog(this, Branch+"\n"+Name);
        }

    }
}
