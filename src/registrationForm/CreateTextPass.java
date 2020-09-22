package registrationForm;

import java.awt.*;

/**
 *Author: Marcelo Telleria
 *Date: 9/4/2020
 *Description: This is the first level.
 */

public class CreateTextPass extends javax.swing.JFrame {

    // Here we declare our variables
    private javax.swing.JLabel cnfrmpswd_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proceed_btn;
    private javax.swing.JLabel pswd_lbl;
    private javax.swing.JTextField pswd_txt;
    private javax.swing.JPasswordField pswdcnfrm_txt;
    private javax.swing.JLabel requirements_lbl;
    private javax.swing.JTextArea requirements_txtarea;
    private javax.swing.JLabel title_lbl;
    // End of variables declaration

    /**
     * Creates FirstLevel GUI
     */
    public CreateTextPass() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }


    @SuppressWarnings("Duplicates")
    private void initComponents() {

        title_lbl = new javax.swing.JLabel();
        cnfrmpswd_lbl = new javax.swing.JLabel();
        pswdcnfrm_txt = new javax.swing.JPasswordField();
        pswd_txt = new javax.swing.JTextField();
        pswd_lbl = new javax.swing.JLabel();
        requirements_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requirements_txtarea = new javax.swing.JTextArea();
        proceed_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(0, 51, 255));
        title_lbl.setText("Level 1: Create Text Password");

        cnfrmpswd_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cnfrmpswd_lbl.setText("Confirm Password:");

        pswd_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswd_lbl.setText("Create Password:");

        requirements_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requirements_lbl.setText("Requirements:");

        requirements_txtarea.setEditable(false);
        requirements_txtarea.setColumns(20);
        requirements_txtarea.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        requirements_txtarea.setLineWrap(true);
        requirements_txtarea.setRows(5);
        requirements_txtarea.setText("*8 character minimum\n*1 uppercase letter\n*1 number\n*1 special character\n(!@$#%*-+)\n");
        requirements_txtarea.setWrapStyleWord(true);
        requirements_txtarea.setAutoscrolls(false);
        requirements_txtarea.setEnabled(false);
        requirements_txtarea.setOpaque(false);
        jScrollPane1.setViewportView(requirements_txtarea);

        proceed_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proceed_btn.setText("Proceed to Step 3");
        proceed_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(70, 70, 70).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(cnfrmpswd_lbl).addComponent(pswd_lbl).addComponent(requirements_lbl)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(pswdcnfrm_txt)
        .addComponent(pswd_txt).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(102, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(title_lbl).addGap(65, 65, 65))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(proceed_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(103, 103, 103)))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(94, 94, 94)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(requirements_lbl)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(pswd_lbl).addComponent(pswd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(cnfrmpswd_lbl).addComponent(pswdcnfrm_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(36, 36, 36).addComponent(proceed_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(58, Short.MAX_VALUE)));
        pack();
    }

    private void proceed_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTextPass().setVisible(true);
            }
        });
    }


}
