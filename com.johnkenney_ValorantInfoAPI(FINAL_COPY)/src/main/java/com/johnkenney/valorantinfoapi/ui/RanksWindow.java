/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.ui;

import com.johnkenney.valorantinfoapi.ranks.ValorantRanksAPI;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author John
 */
public class RanksWindow extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form RanksWindow
     */
    ValorantRanksAPI api = ValorantRanksAPI.getInstance();
    private static RanksWindow inst = null;
    public static RanksWindow getInstance() throws URISyntaxException, IOException
    {
        if(inst ==null)
        {
            inst = new RanksWindow();
        }
        return inst;
    } 
        ArrayList<Icon> ironRankIcons = new ArrayList<>();
        ArrayList<Icon> bronzeRankIcons = new ArrayList<>();
        ArrayList<Icon> goldRankIcons = new ArrayList<>();
        ArrayList<Icon> platRankIcons = new ArrayList<>();
        ArrayList<Icon> diamondRankIcons = new ArrayList<>();
        ArrayList<Icon> silverRankIcons = new ArrayList<>();
        ArrayList<Icon> immortalRankIcons = new ArrayList<>();
        ArrayList<Icon> radiantRankIcons = new ArrayList<>();
    private RanksWindow() throws URISyntaxException, MalformedURLException, IOException {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\main\\java\\com\\johnkenney\\valorantinfoapi\\resources\\valorantIcon.png");  
         this.setIconImage(icon);
        
         for(int i = 3; i < api.ranks.get(0).getTiers().length; i++)
         {
             if("IRON".equals(api.ranks.get(0).getTiers()[i].getDivisionName()) )
             {
                URI iconIronURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL ironRankURL = iconIronURI.toURL();
                Image ironImage = (Image) ImageIO.read(ironRankURL);
                Icon ironIcon = new ImageIcon(ironImage);
                ironRankIcons.add(ironIcon);
                    
             }
             else if("BRONZE".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconBronzeURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL bronzeRankURL = iconBronzeURI.toURL();
                Image bronzeImage = (Image) ImageIO.read(bronzeRankURL);
                Icon bronzeIcon = new ImageIcon(bronzeImage);
                bronzeRankIcons.add(bronzeIcon);
             }
             else if("SILVER".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconSilverURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL silverRankURL = iconSilverURI.toURL();
                Image silverImage = (Image) ImageIO.read(silverRankURL);
                Icon silverIcon = new ImageIcon(silverImage);
                silverRankIcons.add(silverIcon);
             }
             else if("GOLD".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconGoldURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL goldRankURL = iconGoldURI.toURL();
                Image goldImage = (Image) ImageIO.read(goldRankURL);
                Icon goldIcon = new ImageIcon(goldImage);
                goldRankIcons.add(goldIcon);
             }
             else if("PLATINUM".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconPlatURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL platRankURL = iconPlatURI.toURL();
                Image platImage = (Image) ImageIO.read(platRankURL);
                Icon platIcon = new ImageIcon(platImage);
                platRankIcons.add(platIcon);
             }
             else if("DIAMOND".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconDiamondURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL diamondRankURL = iconDiamondURI.toURL();
                Image diamondImage = (Image) ImageIO.read(diamondRankURL);
                Icon diamondIcon = new ImageIcon(diamondImage);
                diamondRankIcons.add(diamondIcon);
                
             }
             else if("IMMORTAL".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconImmortalURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL immortalRankURL = iconImmortalURI.toURL();
                Image immortalImage = (Image) ImageIO.read(immortalRankURL);
                Icon immortalIcon = new ImageIcon(immortalImage);
                immortalRankIcons.add(immortalIcon);
                
             }
             else if("RADIANT".equals(api.ranks.get(0).getTiers()[i].getDivisionName()))
             {
                URI iconRadiantURI = new URI (api.ranks.get(0).getTiers()[i].getLargeIcon());
                URL radiantRankURL = iconRadiantURI.toURL();
                Image radiantImage = (Image) ImageIO.read(radiantRankURL);
                Icon    radiantIcon = new ImageIcon(radiantImage);
                radiantRankIcons.add(radiantIcon);
                
             }
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTabbedRanksPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblIron1 = new javax.swing.JLabel();
        lblIron2 = new javax.swing.JLabel();
        lblIron3 = new javax.swing.JLabel();
        lblIron1Name = new javax.swing.JLabel();
        lblIron2Name = new javax.swing.JLabel();
        lblIron3Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBronze1 = new javax.swing.JLabel();
        lblBronze2 = new javax.swing.JLabel();
        lblBronze3 = new javax.swing.JLabel();
        lblDisplayedBronze1 = new javax.swing.JLabel();
        lblDisplayedBronze2 = new javax.swing.JLabel();
        lblDisplayedBronze3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblSilver1 = new javax.swing.JLabel();
        lblSilver2 = new javax.swing.JLabel();
        lblSilver3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblGold1 = new javax.swing.JLabel();
        lblGold3 = new javax.swing.JLabel();
        lblGold2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPlat1 = new javax.swing.JLabel();
        lblPlat2 = new javax.swing.JLabel();
        lblPlat3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblDiamond1 = new javax.swing.JLabel();
        lblDiamond2 = new javax.swing.JLabel();
        lblDiamond3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblImmortal2 = new javax.swing.JLabel();
        lblImmortal1 = new javax.swing.JLabel();
        lblImmortal3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblRadiant = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Competitve Ranks Page");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Ranks");

        jTabbedRanksPane.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jTabbedRanksPane.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jTabbedRanksPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedRanksPaneStateChanged(evt);
            }
        });
        jTabbedRanksPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedRanksPaneMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedRanksPaneMousePressed(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblIron1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblIron2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblIron3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblIron1Name.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        lblIron2Name.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        lblIron3Name.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIron1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417)
                .addComponent(lblIron2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(lblIron3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(744, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblIron1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(296, 296, 296)
                .addComponent(lblIron2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(299, 299, 299)
                .addComponent(lblIron3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIron2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addComponent(lblIron1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIron3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIron2Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIron1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIron3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 228, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Iron", jPanel1);

        lblBronze1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblBronze2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblBronze3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDisplayedBronze1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(lblDisplayedBronze2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(lblDisplayedBronze3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(804, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblBronze1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291)
                .addComponent(lblBronze2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBronze3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBronze2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBronze3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBronze1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDisplayedBronze1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblDisplayedBronze2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplayedBronze3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Bronze", jPanel2);

        lblSilver1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblSilver2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblSilver3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblSilver1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(lblSilver2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(lblSilver3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSilver3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSilver1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addComponent(lblSilver2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Silver", jPanel3);

        lblGold1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblGold3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblGold2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblGold1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(lblGold2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(lblGold3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGold3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(lblGold1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(lblGold2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Gold", jPanel4);

        lblPlat1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblPlat2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblPlat3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblPlat1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addComponent(lblPlat2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(lblPlat3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlat3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(lblPlat2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addComponent(lblPlat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 237, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Platinum", jPanel5);

        lblDiamond1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblDiamond2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblDiamond3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblDiamond1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(lblDiamond2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(lblDiamond3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiamond1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(lblDiamond2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(lblDiamond3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Diamond", jPanel6);

        lblImmortal2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblImmortal1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        lblImmortal3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblImmortal1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288)
                .addComponent(lblImmortal2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(lblImmortal3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImmortal1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImmortal2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImmortal3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Immortal", jPanel7);

        lblRadiant.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(651, 651, 651)
                .addComponent(lblRadiant, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(772, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblRadiant, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedRanksPane.addTab("Radiant", jPanel8);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedRanksPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedRanksPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedRanksPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedRanksPaneMouseClicked
        // TODO add your handling code here:
        //Iron 
        lblIron1.setIcon(ironRankIcons.get(0));
        lblIron2.setIcon(ironRankIcons.get(1));
        lblIron3.setIcon(ironRankIcons.get(2));
        
        
        //Bronze
        lblBronze1.setIcon(bronzeRankIcons.get(0));
        lblBronze2.setIcon(bronzeRankIcons.get(1));
        lblBronze3.setIcon(bronzeRankIcons.get(2));
        //Silver
        lblSilver1.setIcon(silverRankIcons.get(0));
        lblSilver2.setIcon(silverRankIcons.get(1));
        lblSilver3.setIcon(silverRankIcons.get(2));
        //Gold
        lblGold1.setIcon(goldRankIcons.get(0));
        lblGold2.setIcon(goldRankIcons.get(1));
        lblGold3.setIcon(goldRankIcons.get(2));
        //Plat
        lblPlat1.setIcon(platRankIcons.get(0));
        lblPlat2.setIcon(platRankIcons.get(1));
        lblPlat3.setIcon(platRankIcons.get(2));
        //Diamond
        lblDiamond1.setIcon(diamondRankIcons.get(0));
        lblDiamond2.setIcon(diamondRankIcons.get(1));
        lblDiamond3.setIcon(diamondRankIcons.get(2));
        //Immortal
        lblImmortal1.setIcon(immortalRankIcons.get(0));
        lblImmortal2.setIcon(immortalRankIcons.get(1));
        lblImmortal3.setIcon(immortalRankIcons.get(2));
        
        //Radiant
        lblRadiant.setIcon(radiantRankIcons.get(0));
        
      
        
    }//GEN-LAST:event_jTabbedRanksPaneMouseClicked

    private void jTabbedRanksPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedRanksPaneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedRanksPaneMousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTabbedRanksPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedRanksPaneStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTabbedRanksPaneStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomeScreen home = new HomeScreen();
        this.setVisible(false);
        home.setVisible(true);
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
            java.util.logging.Logger.getLogger(RanksWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RanksWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RanksWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RanksWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RanksWindow().setVisible(true);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(RanksWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RanksWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedRanksPane;
    private javax.swing.JLabel lblBronze1;
    private javax.swing.JLabel lblBronze2;
    private javax.swing.JLabel lblBronze3;
    private javax.swing.JLabel lblDiamond1;
    private javax.swing.JLabel lblDiamond2;
    private javax.swing.JLabel lblDiamond3;
    private javax.swing.JLabel lblDisplayedBronze1;
    private javax.swing.JLabel lblDisplayedBronze2;
    private javax.swing.JLabel lblDisplayedBronze3;
    private javax.swing.JLabel lblGold1;
    private javax.swing.JLabel lblGold2;
    private javax.swing.JLabel lblGold3;
    private javax.swing.JLabel lblImmortal1;
    private javax.swing.JLabel lblImmortal2;
    private javax.swing.JLabel lblImmortal3;
    private javax.swing.JLabel lblIron1;
    private javax.swing.JLabel lblIron1Name;
    private javax.swing.JLabel lblIron2;
    private javax.swing.JLabel lblIron2Name;
    private javax.swing.JLabel lblIron3;
    private javax.swing.JLabel lblIron3Name;
    private javax.swing.JLabel lblPlat1;
    private javax.swing.JLabel lblPlat2;
    private javax.swing.JLabel lblPlat3;
    private javax.swing.JLabel lblRadiant;
    private javax.swing.JLabel lblSilver1;
    private javax.swing.JLabel lblSilver2;
    private javax.swing.JLabel lblSilver3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
