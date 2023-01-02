/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundraising_Application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author floss
 */
public class Donate_Via_Bank_Transfer extends javax.swing.JFrame {
    
    ArrayList <VolunteerState> CustomerState;
     ArrayList <RegisteredDoner> Customers;

    /**
     * Creates new form Withdraw
     */
    public Donate_Via_Bank_Transfer() {
        initComponents();
        CustomerState = new ArrayList<VolunteerState>();
        Customers = new ArrayList<RegisteredDoner>();
        RetriveCustomerState();
    }
    
    
    public void saveCustomersToFile(){
         
            try 
            {
              FileOutputStream file = new FileOutputStream("src\\DataBase\\Cutomers.dat");
              ObjectOutputStream outputFile = new ObjectOutputStream(file);
                
              
              for (int i=0; i<Customers.size(); i++){
                  
                  outputFile.writeObject(Customers.get(i));
                  
              }
              
              outputFile.close();
              
              
  
             
            }
        
         catch (IOException e){
            
           // JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    
    public void RetriveCustomerState()
    {
        try
        {
        
            FileInputStream file = new FileInputStream("src\\DataBase\\CustomerState.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean EndOfFile = false;
        
        while (!EndOfFile){
            
            try 
            {
              CustomerState.add((VolunteerState) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                EndOfFile = true;
            }
            catch (Exception d)
            {
             //JOptionPane.showMessageDialog(null, d.getMessage());
            }
        }
        
        inputFile.close();
        }
        catch (IOException l){
            
           // JOptionPane.showMessageDialog(null, l.getMessage());
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        acctextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Donate Via Bank Transfer");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(815, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Transfer Amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 220, 40));

        acctextfield.setText("e.g: XXXX-XXXX-XXXX-XXXX");
        getContentPane().add(acctextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 440, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 310, 370));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Please specify the account number you wish to transfer money from");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 440, 20));

        jTextField2.setText("0");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 440, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Please specify the amount you wish to transfer/Donate to our account");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 450, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\version 1 sprint 1\\Fundraisng_Application_sprint_2\\src\\template2.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 190));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String z = CustomerState.get(CustomerState.size() - 1).CurrentCustomerState;
        String y[] = z.split(" ");
        
        System.out.println(z);
        System.out.println(y[0]);
        System.out.println(y[1]);
        
        
        try
        {
        
        FileInputStream file = new FileInputStream("src\\DataBase\\Cutomers.dat");
        ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
              Customers.add((RegisteredDoner) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception f)
            {
            // JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
        
        inputFile.close();
        }
        
        catch (IOException e){
            
          //  JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        
        
        
        
        
        
        if(acctextfield.getText().isEmpty() ){
            
                         JOptionPane.showMessageDialog(null, "One of the Required fields is empty please fill it");

 }else{
            
           
      
   boolean abort = false;    
   
   boolean Match = false;
           
           
   for (int i=0;i<Customers.size() && !abort ;i++) {
           
          
     
      if (Customers.get(i).getName().trim().equals(y[0])  && Customers.get(i).getPassword().equals(y[1])){
              
          
          
          if (Customers.get(i).Balance >= Integer.parseInt (jTextField2.getText())){
                    
                   
                     boolean abort2 = false;    
   
                     boolean Match2 = false;
           
           
                     for (int j=0;j<Customers.size() && !abort2 ;i++) {
                         
                         System.out.println(Customers.get(j).AccountNumber);
              
                            if (Customers.get(j).AccountNumber.equals(acctextfield.getText())){
              
                     
                                Customers.get(i).Balance -= Integer.parseInt (jTextField2.getText());
                                Customers.get(j).Balance += Integer.parseInt (jTextField2.getText());
                     
                     
                                jTextArea1.append(" ######## INVOICE ####### " + "\n");
                                jTextArea1.append(" National Bank Of Egypt " + "\n");
                                jTextArea1.append(" You have Transfered " + jTextField2.getText() + "\n" );
                                jTextArea1.append(" From your account Number " + "\n" );
                                jTextArea1.append( " " + Customers.get(i).getAccountNumber() + "\n" );
                                jTextArea1.append(" to account Number " + "\n" );
                                jTextArea1.append( " " + Customers.get(j).getAccountNumber() + "\n" );
                                int currentBalanceAfterWithdrawal = Customers.get(i).Balance;
                                jTextArea1.append(" You current Blance is " + String.valueOf(currentBalanceAfterWithdrawal) + "\n");
                                jTextArea1.append(" If you faced any problem, " + "\n");
                                jTextArea1.append(" please call our customer service, " + "\n"); 
                                jTextArea1.append(" PHONE NUMBER : 01025369874 " + "\n");
                                jTextArea1.append(" Thank you for choosing us " + "\n");
                                jTextArea1.append( "\n");
                     
                     
                                saveCustomersToFile();
                     
                            } else {
                                
                                JOptionPane.showMessageDialog(null, "no such account exits in our database, please make sure you typed the correct acc number");
                                
                            }
                            
                     }
                     
           }else if(Customers.get(i).Balance < Integer.parseInt (jTextField2.getText())){
               
               
                    System.out.println(Customers.get(i).Balance);
                    System.out.println(Customers.get(i).Username);
                    
                    JOptionPane.showMessageDialog(null, "There is no suffcient funds in your account");
                    
                    abort = true;
                    break;
                    
                }
      
            }
      
      
   
          }
                     
                
      }
   
     
   
   
    
        
        
        
        
        
        
  
        

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Donate_Via_Bank_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donate_Via_Bank_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donate_Via_Bank_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donate_Via_Bank_Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donate_Via_Bank_Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acctextfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
