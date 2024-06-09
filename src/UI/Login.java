
package UI;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;
import javax.swing.JOptionPane;
import user.Connectionz;
import user.loginControl;
/**
 *
 * @author Naveen viduranga
 */
public class Login extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        getusername = new javax.swing.JTextField();
        Loginbutton = new javax.swing.JButton();
        getpassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagesn/x.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CloseMouseMoved(evt);
            }
        });
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("User Name");

        getusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getusernameActionPerformed(evt);
            }
        });

        Loginbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Loginbutton.setForeground(new java.awt.Color(51, 153, 255));
        Loginbutton.setText("LOGIN");
        Loginbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });

        getpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getusername, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(Loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getpassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(getpassword))
                .addGap(18, 18, 18)
                .addComponent(Loginbutton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 940, 220));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 23)); // NOI18N
        jLabel5.setText("SCHOOL INFORMATION MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 940, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagesn/background.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
        dispose();
        loginControl.getloging(getusername.getText(), getpassword.getText());
        
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private void getusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getusernameActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseMoved

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_CloseMouseEntered

    private void getpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getpasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            // TODO add your handling code here:
            Connection con;
            PreparedStatement pst;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Success");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JButton Loginbutton;
    private javax.swing.JPasswordField getpassword;
    private javax.swing.JTextField getusername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
