package com.mycompany.maven_Lab2_files.main;

import static com.google.common.io.Files.getFileExtension;
import com.mycompany.maven_Lab2_files.Reactor;
import com.mycompany.maven_Lab2_files.Reader;
import com.mycompany.maven_Lab2_files.database.Creator;
import com.mycompany.maven_Lab2_files.database.Database;
import com.mycompany.maven_Lab2_files.database.Displayer;
import com.mycompany.maven_Lab2_files.readerManipulation;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class NewJFrame extends javax.swing.JFrame {

    Database database = new Database("auto");
    public NewJFrame() throws SQLException {
        initComponents();
        this.jTable1.setVisible(false);
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        FilesButton = new javax.swing.JToggleButton();
        QueryButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        DropButton = new javax.swing.JButton();
        AgregCountryButton = new javax.swing.JButton();
        AgregCompanyButton = new javax.swing.JButton();
        AgregRegionButton = new javax.swing.JButton();
        CalcButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        FilesButton.setText("Select files");
        FilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilesButtonActionPerformed(evt);
            }
        });

        QueryButton.setText("RUN SQL query");
        QueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        CreateButton.setText("create tables");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        DropButton.setText("drop tables");
        DropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropButtonActionPerformed(evt);
            }
        });

        AgregCountryButton.setText("aggregation countries");
        AgregCountryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregCountryButtonActionPerformed(evt);
            }
        });

        AgregCompanyButton.setText("aggregation companies");
        AgregCompanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregCompanyButtonActionPerformed(evt);
            }
        });

        AgregRegionButton.setText("aggregation regions");
        AgregRegionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregRegionButtonActionPerformed(evt);
            }
        });

        CalcButton.setText("calculate");
        CalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QueryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(ExitButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(DropButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CalcButton)
                                    .addComponent(AgregCountryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgregCompanyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgregRegionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CalcButton)
                        .addGap(18, 18, 18)
                        .addComponent(AgregCountryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregCompanyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregRegionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QueryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Reader RealReader;
    List<Reactor> reactors;
    Integer q;
    
    //кнопка считывания файла и заполнение таблицы reactors
    private void FilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilesButtonActionPerformed
        try{
            JFileChooser filechooser = new JFileChooser();
            filechooser.setCurrentDirectory(new File("C:\\Users\\Амина\\Documents\\GitHub\\Lab2\\maven_Lab2_files"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("POM", "json","xml", "yaml", "xlsx");
            filechooser.setFileFilter(filter);
            filechooser.showOpenDialog(this);
            String selectedFile = filechooser.getSelectedFile().toString();
            String extension = getFileExtension(selectedFile);
            if(!extension.equals("xlsx"))
            {
                readerManipulation rm = new readerManipulation();
                this.reactors = rm.importData(selectedFile);
                FillTree(this.reactors);
                this.database.StartInsert((ArrayList<Reactor>) this.reactors);   
            }
            else
            {
                this.database.StartInsert(selectedFile);
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (null, "Ошибка в чтении файла", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FilesButtonActionPerformed
    
    //кнопка создания таблиц и заполнения таблицы units и др
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        Creator creator = new Creator();
        creator.dropSQL();
        this.database.StartCreate();
    }//GEN-LAST:event_CreateButtonActionPerformed

    //кнопка удаления таблиц
    private void DropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropButtonActionPerformed
        Creator creator = new Creator();
        creator.dropSQL();
    }//GEN-LAST:event_DropButtonActionPerformed

    //далее три кнопки агрегаций
    private void AgregCountryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregCountryButtonActionPerformed
        try {
            Creator creator = new Creator();
            creator.agreg(1);
            String query = "select * from public.aggregation_countries;";
            Displayer displayer  = new Displayer(query);
            DefaultTableModel dt = new DefaultTableModel(displayer.getData(), displayer.getColNames());
            this.jTable1.setModel(dt );
            this.jTable1.setVisible(true);
         } catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Проблемы с агрегацией", "Oшибка", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_AgregCountryButtonActionPerformed

    private void AgregCompanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregCompanyButtonActionPerformed
        try {
            Creator creator = new Creator();
            creator.agreg(2);
            String query = "select * from public.aggregation_companies;";
            Displayer displayer0  = new Displayer(query);
            DefaultTableModel dt = new DefaultTableModel(displayer0.getData(), displayer0.getColNames());
            this.jTable1.setModel(dt );
            this.jTable1.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog (null, "Проблемы с агрегацией", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregCompanyButtonActionPerformed

    private void AgregRegionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregRegionButtonActionPerformed
        try {
            Creator creator = new Creator();
            creator.agreg(3);
            String query = "select * from public.aggregation_regions;";
            Displayer displayer0  = new Displayer(query);
            DefaultTableModel dt = new DefaultTableModel(displayer0.getData(), displayer0.getColNames());
            this.jTable1.setModel(dt );
            this.jTable1.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog (null, "Проблемы с агрегацией", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregRegionButtonActionPerformed
    
    //кнопка вычислений
    private void CalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcButtonActionPerformed
        Creator creator = new Creator();
        creator.calc();
    }//GEN-LAST:event_CalcButtonActionPerformed

    private void QueryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryButtonActionPerformed
        try {
            String query = this.jTextField1.getText();
            String defaul_query = "select * from public.units;";
            Displayer displayer0  = new Displayer(query);

            DefaultTableModel dt = new DefaultTableModel(displayer0.getData(), displayer0.getColNames());

            this.jTable1 .setModel(dt );

            JTable g = new JTable(displayer0.getData(), displayer0.getColNames())
            {
                public Class getColumnClass(int column){
                    for(int row = 0;row<getRowCount();row++){
                        Object o = getValueAt(row, column);
                        if(o!=null){
                            return o.getClass();
                        }}
                        return Object.class;
                    }

                };

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog (null, "Такой таблицы не существует", "Oшибка", JOptionPane.ERROR_MESSAGE);
            }

            this.jTable1.setVisible(true);
    }//GEN-LAST:event_QueryButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    
    private void FillTree(List<Reactor> reactors) throws IllegalAccessException
    {
        DefaultMutableTreeNode head = new DefaultMutableTreeNode();
        for(Reactor r : this.reactors)
        {
            DefaultMutableTreeNode rnode = (DefaultMutableTreeNode) r.getNode();
            head.add(rnode);
        }          
        jTree1.setModel(new DefaultTreeModel(head));
    }
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregCompanyButton;
    private javax.swing.JButton AgregCountryButton;
    private javax.swing.JButton AgregRegionButton;
    private javax.swing.JButton CalcButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DropButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JToggleButton FilesButton;
    private javax.swing.JButton QueryButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
