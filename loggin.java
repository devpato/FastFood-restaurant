/*Program made by Patricio Vargas
Class 1301A
Dr.Fares
myGUI14
*/
//program created by Patricio Vargas CopyRight
package mygui14;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author pevargas
 */
public class loggin extends javax.swing.JFrame {
    
    static int[] account = new int[10];
    static int [] password = new int [10];
   String  admin = "123789";
   String adminpass = "123789";
    
    int si;
            
    int user;
 //program created by Patricio Vargas CopyRight   
public int Account(int k){
    
    return account[k];
}

public int Pass(int p){
    
    return password[p];
}
//program created by Patricio Vargas CopyRight
public void Accountx(int r ,int str){
    account[r] = str;
}
public void Passx(int z,int strp){
    
    password[z]= strp;
}
    /** Creates new form loggin */
    public loggin() {
        initComponents();
    }
//program created by Patricio Vargas CopyRight
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        user1 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        newaccnt = new javax.swing.JButton();
        password1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGGIN");
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        user1.setEditable(false);
        user1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        user1.setForeground(new java.awt.Color(204, 204, 204));
        user1.setText("Type user name here");
        user1.setToolTipText("Enter User name");
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });

        label1.setText("New user?");

        newaccnt.setText(" New Account");
        newaccnt.setToolTipText("create a new account");
        newaccnt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            newaccntActionPerformed(evt);
            }
        });

        password1.setEditable(false);
        password1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        password1.setForeground(new java.awt.Color(204, 204, 204));
        password1.setText("Type password here");
        password1.setToolTipText("Enter Password");
        password1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password1MouseClicked(evt);
            }
        });
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newaccnt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newaccnt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//READS AND COMPARES THE VARIABLES OF TYPE INT TO OPEN THE myGUI14  CLASS
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i ;
        boolean falso = false;
        if((user1.getText().equals(admin)) && (password1.getText().equals(adminpass))){
            falso = true;
            setVisible(false);
        }
        si = Integer.parseInt(user1.getText());
        for(i=0 ; i < account.length; i++){
             if (((user1.getText().equals(admin)) && (password1.getText().equals(adminpass)) || (account[i]==(Integer.parseInt(user1.getText())) && password[i]==(Integer.parseInt(password1.getText()))))){
                 new myGUI14().setVisible(true);
                falso = true;
                setVisible(false);
                //myGUI14.usuario.setText(""+account[i]);
                 myGUI14.usuario.setText(""+user1.getText());
                 break;
            }
       } 
        if (falso == false){
            JOptionPane.showMessageDialog(null, "Invalid User Name OR Password");
        }
//program created by Patricio Vargas CopyRight        
        
    }//GEN-LAST:event_jButton1ActionPerformed
   public void usar(int sip){
       Integer.parseInt(user1.getText());
       
      
   }
   
   //OPENS THE newaccnt  CLASS TO CREATEA NEW ACCOUNT
    private void newaccntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newaccntActionPerformed
        JOptionPane.showMessageDialog(null, "WHEN YOU CREATE YOUR ACCOUNT ONLY USE NUMERICAL CHARACTERS");
        new newaccnt().setVisible(true);
    }//GEN-LAST:event_newaccntActionPerformed

private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
    user = 0;
}//GEN-LAST:event_user1ActionPerformed

private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
 
}//GEN-LAST:event_password1ActionPerformed
//program created by Patricio Vargas CopyRight
    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        user1.setEditable(true);                                     
        user1.setText("");
        user1.setForeground(Color.BLACK);
        Font font1 = new Font("Tahoma", Font.PLAIN, 12);
        user1.setFont(font1);
    }//GEN-LAST:event_user1MouseClicked

    private void password1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseClicked
        password1.setText("");
        password1.setEditable(true);
        password1.setForeground(Color.BLACK);
        Font font2 = new Font("Tahoma", Font.PLAIN, 12);
        password1.setFont(font2);
//program created by Patricio Vargas CopyRight 
    }//GEN-LAST:event_password1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label1;
    private javax.swing.JButton newaccnt;
    private javax.swing.JTextField password1;
    public javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
