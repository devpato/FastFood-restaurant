/*Program made by Patricio Vargas
Class 1301A
Dr.Fares
myGUI14
*/
//program created by Patricio Vargas CopyRight
package mygui14;

/**
 *
 * @author pevargas
 */
public class newaccnt extends javax.swing.JFrame {
    int count = 0;
    loggin Acctx = new loggin();
    loggin Passx = new loggin();
    
    /** Creates new form newaccnt */
    public newaccnt() {
        initComponents();
    }
//program created by Patricio Vargas CopyRight
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        npass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Account");
        setResizable(false);

        nuser.setToolTipText("create a new user with numerical charcters");

        jButton1.setText("Creat Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        npass.setToolTipText("create a new password with numerical charcters");

        jLabel1.setText(" \"WHEN YOU CREATE YOUR ACCOUNT ONLY USE NUMERICAL CHARACTERS\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuser, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(npass, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(npass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//ADD A NEW ITEM TO THE ARRAY AND CLOSES THE newaccnt WINDOW
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int f ;
        for(f = 0 ;f<loggin.account.length;f++)   
            if (loggin.account[f]  == 0)
                    loggin.account[f]=Integer.parseInt(nuser.getText()) ;
        f--;           
        Acctx.Accountx(count, loggin.account[f]);
                    loggin.password[f]=Integer.parseInt(npass.getText()) ;
        
        Passx.Accountx(count, loggin.password[f]);
        setVisible(false);
      //program created by Patricio Vargas CopyRight      
    }//GEN-LAST:event_jButton1ActionPerformed
//program created by Patricio Vargas CopyRight
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new newaccnt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField npass;
    private javax.swing.JTextField nuser;
    // End of variables declaration//GEN-END:variables
}
