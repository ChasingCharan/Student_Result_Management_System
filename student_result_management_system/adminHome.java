/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author charan
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
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

        jPanel1 = new javax.swing.JPanel();
        AddNewStudentButton = new javax.swing.JButton();
        AddResultButton = new javax.swing.JButton();
        RegisteredStudentsButton = new javax.swing.JButton();
        AllstudentsResultButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CourseComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BranchComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RollNumberTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        GenderComboBox = new javax.swing.JComboBox<>();
        FatherNameTextField = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AddNewStudentButton.setBackground(new java.awt.Color(204, 51, 0));
        AddNewStudentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddNewStudentButton.setText("Add New Student");
        AddNewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentButtonActionPerformed(evt);
            }
        });

        AddResultButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddResultButton.setText("Add Result");
        AddResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultButtonActionPerformed(evt);
            }
        });

        RegisteredStudentsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisteredStudentsButton.setText("Registered Students");
        RegisteredStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredStudentsButtonActionPerformed(evt);
            }
        });

        AllstudentsResultButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AllstudentsResultButton.setText("All Students Result");
        AllstudentsResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllstudentsResultButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisteredStudentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
            .addComponent(AllstudentsResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(AddResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(AddNewStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(AddNewStudentButton)
                .addGap(66, 66, 66)
                .addComponent(AddResultButton)
                .addGap(72, 72, 72)
                .addComponent(RegisteredStudentsButton)
                .addGap(61, 61, 61)
                .addComponent(AllstudentsResultButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(40, 40, 40))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Course");

        CourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.Tech", "MBA" }));
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Branch Name");

        BranchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "ECE", "IT" }));
        BranchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Roll Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Father Name");

        RollNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollNumberTextFieldActionPerformed(evt);
            }
        });

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        FatherNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNameTextFieldActionPerformed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/8774071_bookmark_favorite_like_favourite_save_icon.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FatherNameTextField)
                            .addComponent(GenderComboBox, 0, 153, Short.MAX_VALUE)
                            .addComponent(NameTextField)
                            .addComponent(CourseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BranchComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RollNumberTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BranchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addComponent(RollNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(FatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStudentButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminHome().setVisible(true);
    }//GEN-LAST:event_AddNewStudentButtonActionPerformed

    private void AddResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addResult().setVisible(true);
    }//GEN-LAST:event_AddResultButtonActionPerformed

    private void AllstudentsResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllstudentsResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new result().setVisible(true);
    }//GEN-LAST:event_AllstudentsResultButtonActionPerformed

    private void RegisteredStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredStudentsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_RegisteredStudentsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void BranchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BranchComboBoxActionPerformed

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseComboBoxActionPerformed

    private void RollNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollNumberTextFieldActionPerformed

    private void FatherNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherNameTextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        //connecting with database
        String course=(String)CourseComboBox.getSelectedItem();
        String branchName=(String)BranchComboBox.getSelectedItem();
        String roll=RollNumberTextField.getText();
        String name=NameTextField.getText();
        String gender=(String)GenderComboBox.getSelectedItem();
        String fatherName=FatherNameTextField.getText();
        try{       
            // created the driver class of sql.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // calling the database.
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srms","root","Kumar@6860");
            
            Statement st=con.createStatement();
            st.executeUpdate("insert into student(rollno,course,branchName,name,gender,fathername) values('"+roll+"','"+course+"','"+branchName+"','"+name+"','"+gender+"','"+fatherName+"')");
            JOptionPane.showMessageDialog(null,"Data saved succesfully");
            setVisible(false);
            new adminHome().setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewStudentButton;
    private javax.swing.JButton AddResultButton;
    private javax.swing.JButton AllstudentsResultButton;
    private javax.swing.JComboBox<String> BranchComboBox;
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JTextField FatherNameTextField;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton RegisteredStudentsButton;
    private javax.swing.JTextField RollNumberTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
