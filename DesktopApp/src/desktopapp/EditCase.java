/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Kristoffer
 */
public class EditCase extends javax.swing.JFrame {

    /**
     * Creates new form EditCase
     */
    private String caseId;
    private ResultSet rs;
    private PreparedStatement st;

    public EditCase() {
        initComponents();
    }

    EditCase(String caseId) {
        initComponents();
        this.caseId = caseId;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://aasa.asuscomm.com:3306/d0007nrk","d0007nrk","d0007nrk");  // databas connection
            String SQL = ("SELECT * FROM `Case` WHERE `CaseId`= " + caseId);  // sql string för att öppna rätt case i jtable. Detta väljs utifrån det case ID som valts i list cases genom att användaren dubbelklickat på ett case
            st = con.prepareStatement(SQL);
            rs = st.executeQuery();
            loadCase();
        } catch (SQLException e) {

        }
        

    }
    private String Starta = "Started"; //String starta som innehåller 'started' som används som status
    private String Complet = "Completed";//String Complet som innehåller 'Completed' som används som status
    DateTime dt = new DateTime(); // En ny datetime 'dt' som ger ett aktuellt datum
    DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"); //Datetime formatter som kommer formatera datetimen till en string
    String dtStr = fmt.print(dt); //Stringen dtStr skapas ur den formaterade datetimen dt
    
    private void loadCase(){
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("d0007nrk?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        caseQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Case c");
        caseList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caseQuery.getResultList();
        caseQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Case c");
        caseList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caseQuery1.getResultList();
        caseQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Case c");
        caseList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caseQuery2.getResultList();
        caseQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Case c");
        caseList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caseQuery3.getResultList();
        caseQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Case c");
        caseList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caseQuery4.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        CompleteCaseButton = new javax.swing.JButton();
        StartCaseButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AttestedBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edit Case");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        CommentArea.setColumns(20);
        CommentArea.setRows(5);
        jScrollPane2.setViewportView(CommentArea);

        jLabel2.setText("Comment");

        SaveButton.setText("Save Edits");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CompleteCaseButton.setText("Complete Case");
        CompleteCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteCaseButtonActionPerformed(evt);
            }
        });

        StartCaseButton.setText("Start Case");
        StartCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartCaseButtonActionPerformed(evt);
            }
        });

        ReturnButton.setText("Return to List Cases");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Attested");

        AttestedBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "0" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StartCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(CompleteCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AttestedBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttestedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReturnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompleteCaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StartCaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        
        
        try {
        String sql = "Update `Case` SET (Comment, Attested) values (?, ?) WHERE CaseId =" + caseId; // sql string för att uppdatera det valda caset
        Connection con = DriverManager.getConnection("jdbc:mysql://aasa.asuscomm.com:3306/d0007nrk","d0007nrk","d0007nrk"); // database connection
        PreparedStatement s= con.prepareStatement(sql);
            
            s.setString(1, CommentArea.getText());  // hämtar inmatat värde 
            s.setString(2, AttestedBox.getSelectedItem().toString());
            s.execute();
            
            JOptionPane.showMessageDialog(null, "You have saved your Comment!");  // meddelande som informerar användaren om att ändringar sparats
            
    } catch (SQLException ex) {
          System.out.println("Exception has occured : " + ex);
        }
    
    
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void StartCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartCaseButtonActionPerformed
        
        try {
        String sql = "Update `Case` SET Status = (?), StartTime = (?) WHERE CaseId =" + caseId; //sql string som uppdaterar status och starttime för det valda caset
        Connection con = DriverManager.getConnection("jdbc:mysql://aasa.asuscomm.com:3306/d0007nrk","d0007nrk","d0007nrk"); // db connection
        PreparedStatement s= con.prepareStatement(sql);
            
            s.setString(1, Starta); //Stringen 'starta' läggs in som status 
            s.setString(2, dtStr); // stringen dtStr som ger det aktuella datumet läggs till i starttime
            s.execute();
            
            JOptionPane.showMessageDialog(null, "You have started the case!"); //Meddelande som informaerar användaren om att caset har startats
            
    } catch (SQLException ex) {
          System.out.println("Exception has occured : " + ex);
        }
    }//GEN-LAST:event_StartCaseButtonActionPerformed

    private void CompleteCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteCaseButtonActionPerformed
        try {
        String sql = "Update `Case` SET Status = (?), EndTime = (?) WHERE CaseId =" + caseId; //sql string som uppdaterar status och endtime för det valda caset
        Connection con = DriverManager.getConnection("jdbc:mysql://aasa.asuscomm.com:3306/d0007nrk","d0007nrk","d0007nrk"); //Db connection
        PreparedStatement s= con.prepareStatement(sql);
            
            s.setString(1, Complet); // Stringen complet läggs in som status
            s.setString(2, dtStr);  // stringen dtStr som ger det aktuella datumet läggs till i starttime
            s.execute();
            
            JOptionPane.showMessageDialog(null, "You have completed the case!"); //Meddelande som informaerar användaren om att caset har färdigställts
            
    } catch (SQLException ex) {
          System.out.println("Exception has occured : " + ex);
        }
    }//GEN-LAST:event_CompleteCaseButtonActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
              ListCases m= new ListCases();
              m.setVisible(true); // knapp som tar oss tillbaka till list cases
              dispose(); // Stänger ned fönstret
    }//GEN-LAST:event_ReturnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AttestedBox;
    private javax.swing.JTextArea CommentArea;
    private javax.swing.JButton CompleteCaseButton;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton StartCaseButton;
    private java.util.List<desktopapp.Case> caseList;
    private java.util.List<desktopapp.Case> caseList1;
    private java.util.List<desktopapp.Case> caseList2;
    private java.util.List<desktopapp.Case> caseList3;
    private java.util.List<desktopapp.Case> caseList4;
    private javax.persistence.Query caseQuery;
    private javax.persistence.Query caseQuery1;
    private javax.persistence.Query caseQuery2;
    private javax.persistence.Query caseQuery3;
    private javax.persistence.Query caseQuery4;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
