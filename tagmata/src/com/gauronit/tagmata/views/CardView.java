/*******************************************************************************
 * Copyright (c) 2012 Gauronit Technologies.
 * All rights reserved. Tagmata and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Jayesh Jadhav - initial API and implementation
 ******************************************************************************/
package com.gauronit.tagmata.views;

import com.gauronit.tagmata.Main;
import com.gauronit.tagmata.core.CardSnapshot;
import com.gauronit.tagmata.core.Indexer;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;

public class CardView extends javax.swing.JDialog {

    String indexDisplayName = null;
    String indexName = null;
    CardSnapshot cardSnap = null;

    /** Creates new form Card */
    public CardView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if (cardSnap != null) {
            titleTxtBox.setText(cardSnap.getTitle());
            tagsTxtBox.setText(cardSnap.getTags());
            textTxtBox.setText(cardSnap.getText());
            indexName = cardSnap.getDoc().get("indexName");
            indexDisplayName = MainView.mainView.getIndexDisplayName(indexName);
            indexNameLbl.setText("Card stored in index, '" + indexDisplayName + "'");
        } else {
            indexDisplayName = MainView.mainView.getSelectedIndexDisplayName();
            indexName = MainView.mainView.getSelectedIndexName();
            indexNameLbl.setText("Index Selected is '" + indexDisplayName + "'");
        }
        setSize(600, 500);
        textTxtBox.setSize(540, 440);
        
    }

    /**
     * @wbp.parser.constructor
     */
    public CardView(CardSnapshot cardSnap, java.awt.Frame parent, boolean modal) {
        this(parent, modal);
        this.cardSnap = cardSnap;
        if (cardSnap != null) {
            titleTxtBox.setText(cardSnap.getTitle());
            tagsTxtBox.setText(cardSnap.getTags());
            textTxtBox.setText(cardSnap.getText());
            indexName = cardSnap.getDoc().get("indexName");
            indexDisplayName = MainView.mainView.getIndexDisplayName(indexName);
            indexNameLbl.setText("Card stored in index, '" + indexDisplayName + "'");
        } else {
            indexDisplayName = MainView.mainView.getSelectedIndexDisplayName();
            indexName = MainView.mainView.getSelectedIndexName();
            indexNameLbl.setText("Index Selected is '" + indexDisplayName + "'");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titleTxtBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tagsTxtBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textScrollPane = new javax.swing.JScrollPane();
        textTxtBox = new javax.swing.JEditorPane();
        addBtn = new javax.swing.JButton();
        indexNameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.gauronit.tagmata.Main.class).getContext().getResourceMap(CardView.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Form"); // NOI18N

        jLabel1.setText("Title"); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        titleTxtBox.setText(resourceMap.getString("titleTxtBox.text")); // NOI18N
        titleTxtBox.setName("titleTxtBox"); // NOI18N
        titleTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Tags"); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        tagsTxtBox.setText(resourceMap.getString("tagsTxtBox.text")); // NOI18N
        tagsTxtBox.setName("tagsTxtBox"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        textScrollPane.setName("jScrollPane1"); // NOI18N

        textTxtBox.setName("textTxtBox"); // NOI18N
        textScrollPane.setViewportView(textTxtBox);

        addBtn.setText("Save Card"); // NOI18N
        addBtn.setName("addBtn"); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        indexNameLbl.setFont(resourceMap.getFont("indexNameLbl.font")); // NOI18N
        indexNameLbl.setText(resourceMap.getString("indexNameLbl.text")); // NOI18N
        indexNameLbl.setName("indexNameLbl"); // NOI18N
        
        JLabel lblText = new JLabel();
        lblText.setText("Text");
        lblText.setName("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(textScrollPane, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        				.addComponent(addBtn, Alignment.TRAILING)
        				.addComponent(indexNameLbl, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(tagsTxtBox, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        						.addComponent(titleTxtBox, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
        				.addComponent(lblText, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(indexNameLbl)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(titleTxtBox))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(tagsTxtBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblText)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(textScrollPane, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(addBtn)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String title = titleTxtBox.getText().trim();
        String tags = tagsTxtBox.getText().trim();
        String text = textTxtBox.getText().trim();

        if (title.equals("") && tags.equals("") && text.equals("")) {
            JOptionPane.showMessageDialog(Main.getApplication().getMainFrame(), "Please enter at least one field to save.", "Saving a Card", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            if (cardSnap == null) {
                Indexer.currentInstance().saveCard(title, tags, text, indexName);
            } else {
                Indexer.currentInstance().updateCard(cardSnap, title, tags, text);
                MainView.mainView.fillResults();
                MainView.mainView.refreshBookmarks();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CardView dialog = new CardView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel indexNameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane textScrollPane;
    private javax.swing.JTextField tagsTxtBox;
    private javax.swing.JEditorPane textTxtBox;
    private javax.swing.JTextField titleTxtBox;
}
