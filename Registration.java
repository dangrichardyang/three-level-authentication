package firstLevel;

import java.awt.*;

/**
 *Author: Marcelo Telleria
 *Date: 9/4/2020
 *Description: This is the GUI interface for the registration form where the user will enter data to create a new account.
 */

public class Registration extends javax.swing.JFrame {

    // Here we declare our variables
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField firstName_txt;
    private javax.swing.JLabel firstname_lbl;
    private javax.swing.JLabel lastname_lbl;
    private javax.swing.JButton proceed_btn;
    private javax.swing.JTextField secondName_txt;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JPasswordField username_txt;
    // End of our variables declaration

    /**
     * Creates registration
     */
    public Registration() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }



    @SuppressWarnings("Duplicates")
    private void initComponents() {

        title_lbl = new javax.swing.JLabel();
        firstName_txt = new javax.swing.JTextField();
        secondName_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        firstname_lbl = new javax.swing.JLabel();
        lastname_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        username_txt = new javax.swing.JPasswordField();
        proceed_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        title_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(0, 51, 255));
        title_lbl.setText("Register Now!");

        firstname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname_lbl.setText("First Name:");

        lastname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname_lbl.setText("Last Name:");

        email_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email_lbl.setText("Email:");

        username_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_lbl.setText("Username:");

        proceed_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proceed_btn.setText("Proceed to Step 2");
        proceed_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
        .addGap(162, 162, 162).addComponent(title_lbl)).addGroup(layout.createSequentialGroup()
        .addGap(128, 128, 128).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(proceed_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(username_lbl).addComponent(email_lbl).addComponent(lastname_lbl).addComponent(firstname_lbl))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(firstName_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        .addComponent(secondName_txt).addComponent(email_txt)
        .addComponent(username_txt)))))).addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(40, 40, 40)
        .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(81, 81, 81)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(firstname_lbl).addComponent(firstName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lastname_lbl)
        .addComponent(secondName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(email_lbl).addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(username_lbl).addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(46, 46, 46).addComponent(proceed_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }

    private void proceed_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {


        /* display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

}