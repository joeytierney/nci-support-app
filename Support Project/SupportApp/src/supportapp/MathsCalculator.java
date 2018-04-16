/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  MathsCalculator.java
 *  18/04/2013
 * @author Kevin Fitzpatrick 12477932
 * @reference https://moodle.ncirl.ie/course/view.php?id=878/ArraysOfObjectsTriggerApplication.java
 */

public class MathsCalculator extends javax.swing.JFrame {

    private String feedbackText;
    private MathsCalculator qArray[];
    //declare count variable to keep track of how many objects are in array
    private int count;
    
    public MathsCalculator() {
        initComponents();
        feedbackText = new String();
       MathsCalculator[] a = new MathsCalculator[0];
        //initialise count to 0
        MathsCalculator a1;
        MathsCalculator a2;
        MathsCalculator a3;
        MathsCalculator a4;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        homeJButton = new javax.swing.JButton();
        feedbackTf = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        calculatorJButton = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeJButton.setText("Home");
        homeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJButtonActionPerformed(evt);
            }
        });
        homeJButton.setBounds(140, 70, 90, 30);
        jLayeredPane1.add(homeJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        feedbackTf.setBounds(10, 380, 290, 30);
        jLayeredPane1.add(feedbackTf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        submitJButton.setBounds(100, 420, 110, 30);
        jLayeredPane1.add(submitJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Calcuulator.jpg"))); // NOI18N
        jLabel2.setBounds(30, 170, 320, 150);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Calculator.jpg"))); // NOI18N
        jLabel1.setBounds(0, 0, 320, 490);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        calculatorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorJButtonActionPerformed(evt);
            }
        });
        calculatorJButton.setBounds(0, 160, 310, 170);
        jLayeredPane1.add(calculatorJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jInternalFrame1.setBounds(50, 100, 22, 37);
        jLayeredPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJButtonActionPerformed
        dispose();
        HomeScreen DGUI = new HomeScreen();
        DGUI.setVisible(true);
    }//GEN-LAST:event_homeJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // Get text from TextFields
        feedbackText = feedbackTf.getText();
        
        //create a new Question object
        
        
        //add contents of textfields to q
        
        
        //add q to array of Question objects
        
        //increase count to show that another object has been added to the array
        
        dispose();
        MathsCalculator DGUI = new MathsCalculator();
        DGUI.setVisible(true);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void calculatorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorJButtonActionPerformed
        try {
            String URL = "http://www.online-calculator.com/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_calculatorJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathsCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathsCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathsCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathsCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MathsCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatorJButton;
    private javax.swing.JTextField feedbackTf;
    private javax.swing.JButton homeJButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
