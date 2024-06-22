package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author swath
 */
public class adminFrame extends javax.swing.JFrame {

    Connection con=null;
    /**
     * Creates new form adminFrame
     */
    public adminFrame() 
    {
        initComponents();
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username= "scott";
        String password = "scott";     
        try{
          Class.forName("oracle.jdbc.OracleDriver");
          //JOptionPane.showMessageDialog(null,"Driver Loaded!");
          
          con = DriverManager.getConnection(url,username,password);
//          if(con!=null){
//           JOptionPane.showMessageDialog(null,"Connected to Oracle database!");
//          }
         }
        
        catch(ClassNotFoundException ex){
           Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE,null, ex);
           JOptionPane.showMessageDialog(null,"Could not find database driver!");
         }
        catch (SQLException ex) {
           Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE,null, ex);
           JOptionPane.showMessageDialog(null,"Failed to connect to the database");
          }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewBooks = new javax.swing.JButton();
        ViewMembers = new javax.swing.JButton();
        ViewTransaction = new javax.swing.JButton();
        ViewStudentsTakenBooks = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewBooks.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        ViewBooks.setText("View Books");
        ViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksActionPerformed(evt);
            }
        });

        ViewMembers.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        ViewMembers.setText("View Members");
        ViewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersActionPerformed(evt);
            }
        });

        ViewTransaction.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        ViewTransaction.setText("View Transactions");
        ViewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTransactionActionPerformed(evt);
            }
        });

        ViewStudentsTakenBooks.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        ViewStudentsTakenBooks.setText("View Student Taken Books");
        ViewStudentsTakenBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStudentsTakenBooksActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewStudentsTakenBooks)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewTransaction)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewMembers)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewBooks)
                        .addGap(138, 138, 138))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(ViewBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewMembers)
                .addGap(18, 18, 18)
                .addComponent(ViewTransaction)
                .addGap(18, 18, 18)
                .addComponent(ViewStudentsTakenBooks)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksActionPerformed
        // TODO add your handling code here:
        BookView b=new BookView();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewBooksActionPerformed

    private void ViewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersActionPerformed
        // TODO add your handling code here:
        MemberView m=new MemberView();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewMembersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage l=new LoginPage();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTransactionActionPerformed
        // TODO add your handling code here:
        TransactView t=new TransactView();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewTransactionActionPerformed

    private void ViewStudentsTakenBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStudentsTakenBooksActionPerformed
        // TODO add your handling code here:
        Student s=new Student();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewStudentsTakenBooksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewBooks;
    private javax.swing.JButton ViewMembers;
    private javax.swing.JButton ViewStudentsTakenBooks;
    private javax.swing.JButton ViewTransaction;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}