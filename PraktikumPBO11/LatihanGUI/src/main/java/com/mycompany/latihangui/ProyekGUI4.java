/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.latihangui;

import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sahal Annabil
 */
public class ProyekGUI4 extends javax.swing.JFrame {

    /**
     * Creates new form ProyekGUI4
     */
    DefaultListModel<String> dlm;
    List<String> listData;
    Set<String> setData;
    Map<Integer, String> mapData;
    int mapKey = 0;
    
    public ProyekGUI4() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItems.setModel(dlm);
        this.listData = new ArrayList<>();
        this.setData = new HashSet<>();
        this.mapData = new HashMap<>();
        
        updateListLabel();
        updateSetLabel();
        updateMapLabel();
       
        jButtonSaveToList.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jButtonSaveToListActionPerformed(evt);
            }
        });
    }
    
    private void updateListLabel(){
        jLabelDataList.setText("Data tersimpan = "+listData.size());
    }
    private void updateSetLabel(){
        jLabelDataSet.setText("Data tersimpan = "+setData.size());
    }
    private void updateMapLabel(){
        jLabelDataMap.setText("Data tersimpan = "+mapData.size());
    }
    
    private void addItemToListModel(String namaItem){
        dlm.addElement(namaItem);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItems = new javax.swing.JList<>();
        jButtonClearAll = new javax.swing.JButton();
        jButtonSaveToList = new javax.swing.JButton();
        jButtonInsertDataList = new javax.swing.JButton();
        jButtonSaveToSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jButtonSaveToMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jLabelItemName = new javax.swing.JLabel();
        jLabelDataList = new javax.swing.JLabel();
        jLabelDataSet = new javax.swing.JLabel();
        jLabelDataMap = new javax.swing.JLabel();
        jTextFieldItemName = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListItems);

        jButtonClearAll.setText("clear all");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonSaveToList.setText("Save to List ->");
        jButtonSaveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToListActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setText("<- Insert data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jButtonSaveToSet.setText("Save to Set ->");
        jButtonSaveToSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- Insert data Set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jButtonSaveToMap.setText("Save to Map ->");
        jButtonSaveToMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- Insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jLabelItemName.setText("Item name:");

        jLabelDataList.setText("Data Tersimpan = ");

        jLabelDataSet.setText("Data Tersimpan = ");

        jLabelDataMap.setText("Data Tersimpan = ");

        jTextFieldItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemNameActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveToList, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataList, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonInsertDataList, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveToSet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataSet, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonInsertDataSet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveToMap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataMap, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldItemName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToList)
                            .addComponent(jLabelDataList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToSet)
                            .addComponent(jLabelDataSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataSet)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToMap)
                            .addComponent(jLabelDataMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToListActionPerformed
        if (!listData.isEmpty()){
            listData.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            listData.add(dlm.getElementAt(i));
        }
        updateListLabel();
    }//GEN-LAST:event_jButtonSaveToListActionPerformed

    private void jTextFieldItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemNameActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
        for (String item : listData){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonSaveToSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToSetActionPerformed
        if (!setData.isEmpty()){
            setData.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            setData.add(dlm.getElementAt(i));
        }
        updateSetLabel();
    }//GEN-LAST:event_jButtonSaveToSetActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        for (String item : setData){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonSaveToMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToMapActionPerformed
        if (!mapData.isEmpty()){
            mapData.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++){
            mapData.put(mapKey++, dlm.getElementAt(i));
        }
        updateMapLabel();
    }//GEN-LAST:event_jButtonSaveToMapActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        for (String item : mapData.values()){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String itemName = jTextFieldItemName.getText();
        if(! itemName.isEmpty()){
            addItemToListModel(itemName);
            jTextFieldItemName.setText("");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int i = jListItems.getSelectedIndex();
        if (i != -1){
            String newItemName = jTextFieldItemName.getText();
            if(!newItemName.isEmpty()){
                dlm.setElementAt(newItemName, i);
                jTextFieldItemName.setText("");
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int i = jListItems.getSelectedIndex();
        if (i != -1){
            dlm.removeElementAt(i);
            jTextFieldItemName.setText("");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jListItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListItemsMouseClicked
        String item = jListItems.getSelectedValue();
        jTextFieldItemName.setText(item);
    }//GEN-LAST:event_jListItemsMouseClicked

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
            java.util.logging.Logger.getLogger(ProyekGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyekGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyekGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyekGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyekGUI4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveToList;
    private javax.swing.JButton jButtonSaveToMap;
    private javax.swing.JButton jButtonSaveToSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDataList;
    private javax.swing.JLabel jLabelDataMap;
    private javax.swing.JLabel jLabelDataSet;
    private javax.swing.JLabel jLabelItemName;
    private javax.swing.JList<String> jListItems;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItemName;
    // End of variables declaration//GEN-END:variables
}
