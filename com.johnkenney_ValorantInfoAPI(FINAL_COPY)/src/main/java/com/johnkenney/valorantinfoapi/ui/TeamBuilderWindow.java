/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.ui;

import com.johnkenney.valorantinfoapi.Agents.Agent;
import com.johnkenney.valorantinfoapi.ValorantAgentAPI;
import com.johnkenney.valorantinfoapi.guns.Gun;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class TeamBuilderWindow extends javax.swing.JFrame {

    /**
     * Creates new form TeamBuilderWindow
     */
    Image winIcon = Toolkit.getDefaultToolkit().getImage("src\\main\\java\\com\\johnkenney\\valorantinfoapi\\resources\\valorantIcon.png");  
    ValorantAgentAPI api = ValorantAgentAPI.getInstance();
    int currentLbl = 1;
    public ArrayList<String> currentTeam;
    public ArrayList<Agent> currentAgents;
    private static TeamBuilderWindow inst = null;
    public static TeamBuilderWindow getInstance() throws IOException
    {
        if(inst == null)
        {
            inst = new TeamBuilderWindow();
        }
        return inst;
    }
    private TeamBuilderWindow() throws IOException {
        
        this.setIconImage(winIcon);
        initComponents();
       
        DefaultListModel agentList = new DefaultListModel();
   
        currentTeam = new ArrayList(); 
        currentAgents = new ArrayList();
        for(int i = 0; i < api.agents.size(); i++)
        {
            agentList.addElement(api.agents.get(i).getName() );
            
        }
        listAllAgents.setFixedCellHeight(50);
        listAllAgents.setModel(agentList);
        
        btnAddAgent.setEnabled(false);
        btnDelete.setEnabled(false);
       
       checkIfSave();
    }
    
    
    void checkIfSave()
    {
         if(currentLbl == 6)
        {
            btnSaveTeam.setEnabled(true);
        }
        else
        {
            btnSaveTeam.setEnabled(false);
        }
    }
    void addAgentToTeam(String name)
    {
        currentTeam.add(name);
        
        Agent tmp = null;
        for(int i = 0; i < api.agents.size();i++)
        {
            if(api.agents.get(i).getName() == name)
            {
                tmp = api.agents.get(i);
                currentAgents.add(tmp);
            }
        }
      
        try {
        URI imageURI = new URI(tmp.getDisplayIconSmall());
            URL agentIconURL = imageURI.toURL();
            Image image = (Image) ImageIO.read(agentIconURL).getScaledInstance(150, 150, 150);
            Image popUpImage = Toolkit.getDefaultToolkit().getImage("src\\main\\java\\com\\johnkenney\\valorantinfoapi\\resources\\valorantIcon.png").getScaledInstance(100, 100, 100);
            Icon popUpIcon = new ImageIcon(popUpImage);
            Icon icon = new ImageIcon(image);
            if(currentLbl == 1)
            {
                lblTeamPic1.setIcon(icon);
                lblTeamName1.setText(tmp.getName()+ ":" + tmp.role.displayName);
                currentLbl = 2;
                
            }
            else if(currentLbl == 2)
            {
                lblTeamPic2.setIcon(icon);
                lblTeamName2.setText(tmp.getName()+ ":" + tmp.role.displayName);
                currentLbl = 3;
            }
            else if(currentLbl == 3)
            {
                lblTeamPic3.setIcon(icon);
                lblTeamName3.setText(tmp.getName()+ ":" + tmp.role.displayName);
                currentLbl = 4;
            }
            else if(currentLbl == 4)
            {
                lblTeamPic4.setIcon(icon);
                lblTeamName4.setText(tmp.getName() + ":" + tmp.role.displayName);
                currentLbl = 5;
            }
            else if(currentLbl == 5)
            {
                lblTeamPic5.setIcon(icon);
                lblTeamName5.setText(tmp.getName()+ ":" + tmp.role.displayName);
                currentLbl = 6;
                String msg = (String) JOptionPane.showInputDialog(rootPane, "Give your team a name:", "NAME YOUR TEAM", HEIGHT, popUpIcon, null, "");
                lblTeamName.setText(msg);
                 
                btnAddAgent.setEnabled(false);
            }
            checkIfSave();
            
        }catch (URISyntaxException | IOException ex) {
            Logger.getLogger(AgentWindow.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllAgents = new javax.swing.JList<>();
        lblTeamPic1 = new javax.swing.JLabel();
        lblTeamPic2 = new javax.swing.JLabel();
        lblTeamPic3 = new javax.swing.JLabel();
        lblTeamPic4 = new javax.swing.JLabel();
        lblTeamPic5 = new javax.swing.JLabel();
        lblTeamName1 = new javax.swing.JLabel();
        lblTeamName2 = new javax.swing.JLabel();
        lblTeamName3 = new javax.swing.JLabel();
        lblTeamName4 = new javax.swing.JLabel();
        lblTeamName5 = new javax.swing.JLabel();
        btnSaveTeam = new javax.swing.JButton();
        btnAddAgent = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTeamName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Builer Page");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Team Builder ");

        listAllAgents.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        listAllAgents.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        listAllAgents.setForeground(new java.awt.Color(255, 255, 255));
        listAllAgents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listAllAgents.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAllAgentsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listAllAgents);

        lblTeamPic1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblTeamPic2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblTeamPic3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblTeamPic4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblTeamPic5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblTeamName1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        lblTeamName2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        lblTeamName3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        lblTeamName4.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        lblTeamName5.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N

        btnSaveTeam.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        btnSaveTeam.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveTeam.setText("Save Team");
        btnSaveTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTeamActionPerformed(evt);
            }
        });

        btnAddAgent.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAddAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAgent.setText("Add");
        btnAddAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAgentActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTeamName.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTeamName.setForeground(new java.awt.Color(255, 102, 102));

        jButton1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAddAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamPic1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(lblTeamName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamPic2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(lblTeamName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(615, 615, 615)
                        .addComponent(btnSaveTeam)))
                .addGap(470, 470, 470))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamPic3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(lblTeamName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTeamPic4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(lblTeamName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTeamPic5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(lblTeamName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jButton1))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnAddAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTeamPic3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTeamPic4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTeamPic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTeamName3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTeamName5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblTeamName4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSaveTeam)
                                        .addGap(256, 256, 256))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTeamPic2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTeamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(481, 481, 481)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTeamPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTeamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTeamActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(inst);
       
        
        File f = fc.getSelectedFile();
        
        try{
            FileWriter fw = new FileWriter(f);
            fw.write(lblTeamName.getText() + "\n" + "\n");
           for(int i = 0; i < currentAgents.size(); i++)
           {
               fw.write(currentAgents.get(i).getName() + ": " + currentAgents.get(i).role.displayName + "\n" + 
                        "Abilties: " + currentAgents.get(i).abilities[0].displayName + ", " + currentAgents.get(i).abilities[1].displayName + ", " + currentAgents.get(i).abilities[2].displayName + ", " +  currentAgents.get(i).abilities[3].displayName + "\n" + "\n");
           }
            fw.close();
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_btnSaveTeamActionPerformed

    private void btnAddAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAgentActionPerformed
        // TODO add your handling code here:
        String name = listAllAgents.getSelectedValue();
        btnAddAgent.setEnabled(false);
        addAgentToTeam(name);
    }//GEN-LAST:event_btnAddAgentActionPerformed

    private void listAllAgentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listAllAgentsValueChanged
        // TODO add your handling code here:
        boolean isInList = false;
        if(currentLbl == 1)
            btnDelete.setEnabled(false);
        else
            btnDelete.setEnabled(true);
     
        String selectedAgent = listAllAgents.getSelectedValue();
        for(int i = 0; i < currentTeam.size(); i++)
        {
            if(selectedAgent.equals(currentTeam.get(i)))
            {
                isInList = true;
                btnAddAgent.setEnabled(false);
            }
        }
        
           if(listAllAgents.getSelectedValue() != null && currentLbl <= 5 && isInList == false )
           {
               btnAddAgent.setEnabled(true);
           }
           else
           {
               btnAddAgent.setEnabled(false);
           }
        
       
    }//GEN-LAST:event_listAllAgentsValueChanged

    public void removeAgentFromTeam(String name)
    {
        String tmp = name;
       
        
        for(int i = 0; i < currentTeam.size();i++)
        {
            if(tmp.equals(currentTeam.get(i)))
            {
                currentTeam.remove(i);
                currentAgents.remove(i);
                
            }
        }
        checkIfSave();
    }
    
    
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       String tmp = "";
        
        if(currentLbl == 2)
        {
            
            lblTeamPic1.setIcon(null);
            tmp = lblTeamName1.getText().substring(0, lblTeamName1.getText().indexOf(":"));
            lblTeamName1.setText("");
           
            currentLbl = 1;
            btnDelete.setEnabled(false);
            
        }
        else if(currentLbl == 3)
        {
            
            lblTeamPic2.setIcon(null);
            tmp = lblTeamName2.getText().substring(0, lblTeamName2.getText().indexOf(":"));
            lblTeamName2.setText("");
             
            currentLbl = 2;
        }
        else if(currentLbl == 4)
        {
            
            lblTeamPic3.setIcon(null);
            tmp = lblTeamName3.getText().substring(0, lblTeamName3.getText().indexOf(":"));
            lblTeamName3.setText("");
             
            currentLbl = 3;
        }
        else if(currentLbl == 5)
        {
            
            lblTeamPic4.setIcon(null);
            tmp = lblTeamName4.getText().substring(0, lblTeamName4.getText().indexOf(":"));
            lblTeamName4.setText("");
             
            currentLbl = 4;
        }
        else if(currentLbl == 6)
        {
            lblTeamPic5.setIcon(null);
            tmp = lblTeamName5.getText().substring(0, lblTeamName5.getText().indexOf(":"));
            lblTeamName5.setText("");
             
            currentLbl = 5;
           
            
            
        }
        
        removeAgentFromTeam(tmp);
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomeScreen home = new HomeScreen();
        home.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(TeamBuilderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamBuilderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamBuilderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamBuilderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TeamBuilderWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TeamBuilderWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAgent;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveTeam;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTeamName;
    private javax.swing.JLabel lblTeamName1;
    private javax.swing.JLabel lblTeamName2;
    private javax.swing.JLabel lblTeamName3;
    private javax.swing.JLabel lblTeamName4;
    private javax.swing.JLabel lblTeamName5;
    private javax.swing.JLabel lblTeamPic1;
    private javax.swing.JLabel lblTeamPic2;
    private javax.swing.JLabel lblTeamPic3;
    private javax.swing.JLabel lblTeamPic4;
    private javax.swing.JLabel lblTeamPic5;
    private javax.swing.JList<String> listAllAgents;
    // End of variables declaration//GEN-END:variables
}
