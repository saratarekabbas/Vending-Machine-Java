package VMPackage;

import static VMPackage.MaintainerControlPanelJFrame.coinstock1;
import static VMPackage.MaintainerControlPanelJFrame.coinstock10;
import static VMPackage.MaintainerControlPanelJFrame.coinstock20;
import static VMPackage.MaintainerControlPanelJFrame.coinstock50;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Sara
 */
public class MachinerySimulationControlPanelJFrame extends javax.swing.JFrame {

    public String drinksStock1;
    public String drinksStock2;
    public String drinksStock3;
    public String drinksStock4;
    public String drinksStock5;
    public String drinksStock6;

    public static String coinsStock10;
    public static String coinsStock20;
    public static String coinsStock50;
    public static String coinsStock1;

    //    Set All Coins
    public void setCoin10(int coin10) {
        MaintainerControlPanelJFrame.coinstock10 = coin10;
    }

    public void setCoin20(int coin20) {
        MaintainerControlPanelJFrame.coinstock20 = coin20;
    }

    public void setCoin50(int coin50) {
        MaintainerControlPanelJFrame.coinstock50 = coin50;
    }

    public void setCoin1(int coin1) {
        MaintainerControlPanelJFrame.coinstock1 = coin1;
    }

    //    Get All Coins
    public static int getCoins10() {
        return coinstock10;
    }

    public static int getCoins20() {
        return coinstock20;
    }

    public static int getCoins50() {
        return coinstock50;
    }

    public static int getCoins1() {
        return coinstock1;
    }

    /**
     * Creates new form NewJFrame
     */
    public MachinerySimulationControlPanelJFrame() {
        initComponents();
    }

//        THIS IS FOR RESETTING THE STOCK TO 0 AFTER WE WITHDRAW ALL MONEY FROM THE MAINTAINER'S SIDE
    public MachinerySimulationControlPanelJFrame(int coinsStock10, int coinsStock20, int coinsStock50, int coinsStock1) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stock7 = new javax.swing.JLabel();
        Stock8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DisplayDrinksStockButton = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        NewDrinkStock1 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        NewDrinkStock2 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        NewDrinkStock3 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        NewDrinkStock4 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        NewDrinkStock5 = new javax.swing.JTextPane();
        DrinkStock1 = new javax.swing.JLabel();
        DrinkStock2 = new javax.swing.JLabel();
        DrinkStock3 = new javax.swing.JLabel();
        DrinkStock5 = new javax.swing.JLabel();
        DrinkStock6 = new javax.swing.JLabel();
        DrinkStock4 = new javax.swing.JLabel();
        UpdateDrinksStockButton = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        NewDrinkStock6 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CoinStock20 = new javax.swing.JLabel();
        CoinStock10 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        NewCoinStock2 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        NewCoinStock1 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        NewCoinStock3 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        NewCoinStock4 = new javax.swing.JTextPane();
        CoinStock50 = new javax.swing.JLabel();
        CoinStock1 = new javax.swing.JLabel();
        UpdateCoinsStockButton = new javax.swing.JButton();
        DisplayCoinsStockButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        Stock7.setText("Stock2");

        Stock8.setText("Stock1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vending Machine Machinery Simulation Panel");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("VIMTO SOFT DRINKS DISPENSER");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display/Change Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel5.setText("Blueberry");

        jLabel6.setText("Raspberry");

        jLabel8.setText("Passionfruit");

        jLabel9.setText("Strawberry");

        jLabel10.setText("Orange");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("Drinks");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("New Value");

        jLabel12.setText("Lime");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setText("Stock");

        DisplayDrinksStockButton.setText("Display Drinks Stock");
        DisplayDrinksStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayDrinksStockButtonActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(NewDrinkStock1);

        jScrollPane10.setViewportView(NewDrinkStock2);

        jScrollPane11.setViewportView(NewDrinkStock3);

        jScrollPane17.setViewportView(NewDrinkStock4);

        jScrollPane18.setViewportView(NewDrinkStock5);

        DrinkStock1.setText("?");

        DrinkStock2.setText("?");

        DrinkStock3.setText("?");

        DrinkStock5.setText("?");

        DrinkStock6.setText("?");

        DrinkStock4.setText("?");

        UpdateDrinksStockButton.setText("Update Drinks Stock");
        UpdateDrinksStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDrinksStockButtonActionPerformed(evt);
            }
        });

        jScrollPane19.setViewportView(NewDrinkStock6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(132, 132, 132)
                        .addComponent(DrinkStock3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DisplayDrinksStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateDrinksStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DrinkStock4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(DrinkStock1)
                                    .addComponent(DrinkStock5)
                                    .addComponent(DrinkStock2)
                                    .addComponent(DrinkStock6))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(DrinkStock3)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DrinkStock4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(DrinkStock1)
                        .addGap(15, 15, 15)
                        .addComponent(DrinkStock2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DrinkStock5)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DrinkStock6)
                        .addComponent(jLabel12))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayDrinksStockButton)
                    .addComponent(UpdateDrinksStockButton))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jButton5.setText("Terminate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel19.setText("Exit Machinery Panel");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel19))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display/Change Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel14.setText("10c");

        jLabel15.setText("20c");

        jLabel16.setText("50c");

        jLabel20.setText("RM1");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel22.setText("Coins");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setText("New Value");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel25.setText("Stock");

        CoinStock20.setText("?");

        CoinStock10.setText("?");

        jScrollPane12.setViewportView(NewCoinStock2);

        jScrollPane13.setViewportView(NewCoinStock1);

        jScrollPane14.setViewportView(NewCoinStock3);

        jScrollPane15.setViewportView(NewCoinStock4);

        CoinStock50.setText("?");

        CoinStock1.setText("?");

        UpdateCoinsStockButton.setText("Update Coins Stock");
        UpdateCoinsStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCoinsStockButtonActionPerformed(evt);
            }
        });

        DisplayCoinsStockButton.setText("Display Coins Stock");
        DisplayCoinsStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCoinsStockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(CoinStock1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CoinStock10)
                                            .addComponent(CoinStock20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(CoinStock50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(DisplayCoinsStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateCoinsStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(CoinStock20)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CoinStock10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(CoinStock50))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CoinStock1)
                        .addComponent(jLabel20)))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayCoinsStockButton)
                    .addComponent(UpdateCoinsStockButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("MACHINERY SIMULATION CONTROL PANEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void DisplayDrinksStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayDrinksStockButtonActionPerformed
        try {
            File myObj = new File("DrinksStock.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> drinksStockList = new ArrayList<String>();
            while (myReader.hasNext()) {
                drinksStockList.add(myReader.next());
            }
            myReader.close();

            DrinkStock1.setText(String.valueOf(drinksStockList.get(1)));
            DrinkStock2.setText(String.valueOf(drinksStockList.get(3)));
            DrinkStock3.setText(String.valueOf(drinksStockList.get(5)));
            DrinkStock4.setText(String.valueOf(drinksStockList.get(7)));
            DrinkStock5.setText(String.valueOf(drinksStockList.get(9)));
            DrinkStock6.setText(String.valueOf(drinksStockList.get(11)));

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

            DrinkStock1.setText("0");
            DrinkStock2.setText("0");
            DrinkStock3.setText("0");
            DrinkStock4.setText("0");
            DrinkStock5.setText("0");
            DrinkStock6.setText("0");
        }
    }//GEN-LAST:event_DisplayDrinksStockButtonActionPerformed

    private void UpdateDrinksStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDrinksStockButtonActionPerformed
//      GET TEXT FROM INPUT FIELD
        drinksStock1 = NewDrinkStock1.getText();
        drinksStock2 = NewDrinkStock2.getText();
        drinksStock3 = NewDrinkStock3.getText();
        drinksStock4 = NewDrinkStock4.getText();
        drinksStock5 = NewDrinkStock5.getText();
        drinksStock6 = NewDrinkStock6.getText();

        if (JavaChecker.stringIsNull(drinksStock1) == true || JavaChecker.stringIsNull(drinksStock2) == true || JavaChecker.stringIsNull(drinksStock3) == true || JavaChecker.stringIsNull(drinksStock4) == true || JavaChecker.stringIsNull(drinksStock5) == true || JavaChecker.stringIsNull(drinksStock6) == true) {
            JOptionPane.showMessageDialog(rootPane, "Drinks Stock value cannot be empty!");
        } else if (JavaChecker.isWhole(drinksStock1) == false || JavaChecker.isWhole(drinksStock2) == false || JavaChecker.isWhole(drinksStock3) == false || JavaChecker.isWhole(drinksStock4) == false || JavaChecker.isWhole(drinksStock5) == false || JavaChecker.isWhole(drinksStock6) == false) {
            JOptionPane.showMessageDialog(rootPane, "Invalid stock value! Please only insert whole number [0-20].");
        } else if (Integer.valueOf(drinksStock1) < 0 || Integer.valueOf(drinksStock2) < 0 || Integer.valueOf(drinksStock3) < 0 || Integer.valueOf(drinksStock4) < 0 || Integer.valueOf(drinksStock5) < 0 || Integer.valueOf(drinksStock6) < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid stock value! Please only insert positive number [0-20].");

        } else if ((Integer.valueOf(drinksStock1)> 20 ) || Integer.valueOf(drinksStock2) > 20 || Integer.valueOf(drinksStock3) > 20 || Integer.valueOf(drinksStock4) > 20 || Integer.valueOf(drinksStock5) > 20 || Integer.valueOf(drinksStock6) > 20) {
            JOptionPane.showMessageDialog(rootPane, "Drinks stock cannot exceed 20!");
        } else {
            try {
                FileWriter myWriter = new FileWriter("DrinksStock.txt");
                myWriter.write(
                        "drinksStock1 " + drinksStock1
                        + "\ndrinksStock2 " + drinksStock2
                        + "\ndrinksStock3 " + drinksStock3
                        + "\ndrinksStock4 " + drinksStock4
                        + "\ndrinksStock5 " + drinksStock5
                        + "\ndrinksStock6 " + drinksStock6
                );
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(rootPane, "Drinks Stock updated successfully!");
        }
    }//GEN-LAST:event_UpdateDrinksStockButtonActionPerformed

    private void DisplayCoinsStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCoinsStockButtonActionPerformed
        try {
            File myObj = new File("CoinStock.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> coinsStockList = new ArrayList<String>();
            while (myReader.hasNext()) {
                coinsStockList.add(myReader.next());
            }
            myReader.close();

            CoinStock10.setText(String.valueOf(coinsStockList.get(1)));
            CoinStock20.setText(String.valueOf(coinsStockList.get(3)));
            CoinStock50.setText(String.valueOf(coinsStockList.get(5)));
            CoinStock1.setText(String.valueOf(coinsStockList.get(7)));

        } catch (FileNotFoundException e) {
            CoinStock10.setText("0");
            CoinStock20.setText("0");
            CoinStock50.setText("0");
            CoinStock1.setText("0");

            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }//GEN-LAST:event_DisplayCoinsStockButtonActionPerformed

    private void UpdateCoinsStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCoinsStockButtonActionPerformed
//    GET TEXT FROM INPUT FIELD
//        coinsStock10 = Integer.parseInt(NewCoinStock1.getText());
//        coinsStock20 = Integer.parseInt(NewCoinStock2.getText());
//        coinsStock50 = Integer.parseInt(NewCoinStock3.getText());
//        coinsStock1 = Integer.parseInt(NewCoinStock4.getText());

//      FILES
//      WRITE VALUES INSERTED INTO THE DrinksStock.txt file
//        try {
//            FileWriter myWriter = new FileWriter("CoinStock.txt");
//            myWriter.write(
//                    "coinsStock10 " + coinsStock10
//                    + "\ncoinsStock20 " + coinsStock20
//                    + "\ncoinsStock50 " + coinsStock50
//                    + "\ncoinsStock-1 " + coinsStock1
//            );
//            myWriter.close();
//            System.out.println("Successfully wrote to CoinStock.txt file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        JOptionPane.showMessageDialog(rootPane, "Coins Stock updated successfully!");
    }//GEN-LAST:event_UpdateCoinsStockButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SimulatorControlPanelJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatorControlPanelJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatorControlPanelJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatorControlPanelJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulatorControlPanelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoinStock1;
    private javax.swing.JLabel CoinStock10;
    private javax.swing.JLabel CoinStock20;
    private javax.swing.JLabel CoinStock50;
    private javax.swing.JButton DisplayCoinsStockButton;
    private javax.swing.JButton DisplayDrinksStockButton;
    private javax.swing.JLabel DrinkStock1;
    private javax.swing.JLabel DrinkStock2;
    private javax.swing.JLabel DrinkStock3;
    private javax.swing.JLabel DrinkStock4;
    private javax.swing.JLabel DrinkStock5;
    private javax.swing.JLabel DrinkStock6;
    private javax.swing.JTextPane NewCoinStock1;
    private javax.swing.JTextPane NewCoinStock2;
    private javax.swing.JTextPane NewCoinStock3;
    private javax.swing.JTextPane NewCoinStock4;
    private javax.swing.JTextPane NewDrinkStock1;
    private javax.swing.JTextPane NewDrinkStock2;
    private javax.swing.JTextPane NewDrinkStock3;
    private javax.swing.JTextPane NewDrinkStock4;
    private javax.swing.JTextPane NewDrinkStock5;
    private javax.swing.JTextPane NewDrinkStock6;
    private javax.swing.JLabel Stock7;
    private javax.swing.JLabel Stock8;
    private javax.swing.JButton UpdateCoinsStockButton;
    private javax.swing.JButton UpdateDrinksStockButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
