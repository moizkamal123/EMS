/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;





public class login extends javax.swing.JFrame {
Connection conn=null;
ResultSet  rs=null;
 PreparedStatement pat=null;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
         Toolkit toolkit= getToolkit();
  Dimension size= toolkit.getScreenSize(); 
  setLocation(size.width/2- getWidth()/2,size.height/2-getHeight()/2);
       
           conn= db.java_db();
           currentdate();
           
    }

   public void currentdate()
   {
       Calendar cal = new GregorianCalendar();
       int month = cal.get(Calendar.MONTH);
       int year = cal.get(Calendar.YEAR);
       int day = cal.get(Calendar.DAY_OF_MONTH);
       lbl_date.setText((month+1)+"/"+day+"/"+year);
       
       
       int second= cal.get(Calendar.SECOND);
       int minute= cal.get(Calendar.MINUTE);
       int hour= cal.get(Calendar.HOUR);
       lbl_time.setText(hour+":"+minute+":"+second);
       
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ENTER USERNAME AND PASSWORD");

        jLabel2.setText("USERNAME:");

        jLabel3.setText("PASSWORD:");

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Employee" }));
        txt_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comboActionPerformed(evt);
            }
        });

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("DIVISION:");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_username)
                            .addComponent(txt_combo, 0, 183, Short.MAX_VALUE)
                            .addComponent(txt_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     LOGIN l= new LOGIN();
     l.login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comboActionPerformed
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private int getheight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 class LOGIN
 {
     public void login()
     {
          String sql="select id, username, password,division from Users where (username=? and password=? and division=?)";
        try
        {
            int count=0;
            pat=conn.prepareStatement(sql);
            pat.setString(1,txt_username.getText());
            pat.setString(2,txt_password.getText());
            pat.setString(3,txt_combo.getSelectedItem().toString());
            rs= pat.executeQuery();
            while(rs.next())
            {
              count=count+1;  
            }
            String access=(txt_combo.getSelectedItem().toString());
            if(access=="Admin")
            {
                if(count==1)
                {
                    JOptionPane.showMessageDialog(null, "Successfull");
                    memu j= new memu();
                    j.setVisible(true);
                    login x= new login();
                    x.dispose();
                    
                }
                else
                {
                
                    JOptionPane.showMessageDialog(null,"Username and Password you entered are incorrect");
                    txt_username.setText(null);
                    txt_password.setText(null);
                }            
               
                        
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
  finally{
                try
                        {
                        rs.close();
                        pat.close();
                        }
                catch(Exception e)
                {
                    
                }
        }
        //ridz
                String sq="select id, username, password,division from Users where (username=? and password=? and division=?)";
        try
        {
            int count=0;
            pat=conn.prepareStatement(sq);
            pat.setString(1,txt_username.getText());
            pat.setString(2,txt_password.getText());
            pat.setString(3,txt_combo.getSelectedItem().toString());
            rs= pat.executeQuery();
            while(rs.next())
            {
              count=count+1; 
            }
            String access=(txt_combo.getSelectedItem().toString());
            if(access=="Manager")
            {
                if(count==1)
                {
                    JOptionPane.showMessageDialog(null, "Successfull");
                    memu j= new memu();
                    j.setVisible(true);
                     login x= new login();
                    x.dispose();
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username and Password you entered are incorrect");
                    txt_username.setText(null);
                    txt_password.setText(null);
                }            
               
                        
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
  finally{
                try
                        {
                        rs.close();
                        pat.close();
                        }
                catch(Exception e)
                {
                    
                }
        }
        //end
        String sqll="select id, username, password,division from Users where (username=? and password=? and division=?)";
        try
        {
            int count=0;
            pat=conn.prepareStatement(sql);
            pat.setString(1,txt_username.getText());
            pat.setString(2,txt_password.getText());
            pat.setString(3,txt_combo.getSelectedItem().toString());
            rs= pat.executeQuery();
            while(rs.next())
            {
              count=count+1;  
            }
            String access=(txt_combo.getSelectedItem().toString());
            if(access=="Employee")
            {
                if(count==1)
                {
                    JOptionPane.showMessageDialog(null, "Successfull");
                    search_emp_salary j= new search_emp_salary();
                    j.setVisible(true);
                     login x= new login();
                    x.dispose();
                    
                }
                else
                {
                
                    JOptionPane.showMessageDialog(null,"Username and Password you entered are incorrect");
                    txt_username.setText(null);
                    txt_password.setText(null);
                }            
               
                        
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
  finally{
                try
                        {
                        rs.close();
                        pat.close();
                        }
                catch(Exception e)
                {
                    
                }
        }
     }
 }
}

