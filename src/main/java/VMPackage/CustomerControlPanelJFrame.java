package VMPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
public class CustomerControlPanelJFrame extends javax.swing.JFrame {

    public static double insertedCoin; //currently inserted coin by the user in an active transaction
    public static double totalInsertedCoins; //all inserted coins by the user in an active transaction

    public static double drinkPrice1;
    public static double drinkPrice2;
    public static double drinkPrice3;
    public static double drinkPrice4;
    public static double drinkPrice5;
    public static double drinkPrice6;

    public CustomerControlPanelJFrame() {
        initComponents();
        try {
            File myObj = new File("DrinksPrice.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> drinksPriceList = new ArrayList<String>();
            while (myReader.hasNext()) {
                drinksPriceList.add(myReader.next());
            }
            myReader.close();

            drinkPrice1 = Double.parseDouble(drinksPriceList.get(1));
            drinkPrice2 = Double.parseDouble(drinksPriceList.get(3));
            drinkPrice3 = Double.parseDouble(drinksPriceList.get(5));
            drinkPrice4 = Double.parseDouble(drinksPriceList.get(7));
            drinkPrice5 = Double.parseDouble(drinksPriceList.get(9));
            drinkPrice6 = Double.parseDouble(drinksPriceList.get(11));

            DrinkBrand1Price.setText(String.valueOf(drinkPrice1));
            DrinkBrand2Price.setText(String.valueOf(drinkPrice2));
            DrinkBrand3Price.setText(String.valueOf(drinkPrice3));
            DrinkBrand4Price.setText(String.valueOf(drinkPrice4));
            DrinkBrand5Price.setText(String.valueOf(drinkPrice5));
            DrinkBrand6Price.setText(String.valueOf(drinkPrice6));

//            DrinkBrand6Price.setText(String.valueOf(drinksPriceList.get(11)));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

            DrinkBrand1Price.setText("0");
            DrinkBrand2Price.setText("0");
            DrinkBrand3Price.setText("0");
            DrinkBrand4Price.setText("0");
            DrinkBrand5Price.setText("0");
            DrinkBrand6Price.setText("0");
        }

        try {
            File myObj = new File("DrinksStock.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> drinksStockList = new ArrayList<String>();
            while (myReader.hasNext()) {
                drinksStockList.add(myReader.next());
            }
            myReader.close();

            if (Integer.parseInt(drinksStockList.get(1)) == 0) {
                stock1.enable();
                Drink1Select.setEnabled(false);
            } else {
                stock1.disable();
            }
            if (Integer.parseInt(drinksStockList.get(3)) == 0) {
                stock2.enable();
                Drink2Select.setEnabled(false);
            } else {
                stock2.disable();
            }
            if (Integer.parseInt(drinksStockList.get(5)) == 0) {
                stock3.enable();
                Drink3Select.setEnabled(false);
            } else {
                stock3.disable();
            }
            if (Integer.parseInt(drinksStockList.get(7)) == 0) {
                stock4.enable();
                Drink4Select.setEnabled(false);
            } else {
                stock4.disable();
            }
            if (Integer.parseInt(drinksStockList.get(9)) == 0) {
                stock5.enable();
                Drink5Select.setEnabled(false);
            } else {
                stock5.disable();
            }
            if (Integer.parseInt(drinksStockList.get(11)) == 0) {
                stock6.enable();
                Drink6Select.setEnabled(false);
            } else {
                stock6.disable();
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CoinsInput = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        DrinkBrand1 = new javax.swing.JLabel();
        DrinkBrand2 = new javax.swing.JLabel();
        DrinkBrand3 = new javax.swing.JLabel();
        DrinkBrand4 = new javax.swing.JLabel();
        DrinkBrand5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DrinkBrand6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Drink2Select = new javax.swing.JRadioButton();
        Drink1Select = new javax.swing.JRadioButton();
        Drink3Select = new javax.swing.JRadioButton();
        Drink5Select = new javax.swing.JRadioButton();
        Drink6Select = new javax.swing.JRadioButton();
        Drink4Select = new javax.swing.JRadioButton();
        DrinkBrand1Price = new javax.swing.JLabel();
        DrinkBrand2Price = new javax.swing.JLabel();
        DrinkBrand3Price = new javax.swing.JLabel();
        DrinkBrand4Price = new javax.swing.JLabel();
        DrinkBrand5Price = new javax.swing.JLabel();
        DrinkBrand6Price = new javax.swing.JLabel();
        stock1 = new javax.swing.JLabel();
        stock2 = new javax.swing.JLabel();
        stock3 = new javax.swing.JLabel();
        stock4 = new javax.swing.JLabel();
        stock5 = new javax.swing.JLabel();
        stock6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        CollectDrink = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        terminate = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        CoinsChange = new javax.swing.JLabel();
        TotalInserted = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vending Machine Cutomer Panel");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("VIMTO SOFT DRINKS DISPENSER");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("INSERT COINS HERE");

        CoinsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsInputActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select a Drink", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        DrinkBrand1.setText("Blueberry");

        DrinkBrand2.setText("Raspberry");

        DrinkBrand3.setText("Passionfruit");

        DrinkBrand4.setText("Strawberry");

        DrinkBrand5.setText("Orange");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("Drinks Brand");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Select");

        DrinkBrand6.setText("Lime");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setText("Stock");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setText("Price");

        Drink2Select.setText("Select");
        Drink2Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink2SelectActionPerformed(evt);
            }
        });

        Drink1Select.setText("Select");
        Drink1Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink1SelectActionPerformed(evt);
            }
        });

        Drink3Select.setText("Select");
        Drink3Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink3SelectActionPerformed(evt);
            }
        });

        Drink5Select.setText("Select");
        Drink5Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink5SelectActionPerformed(evt);
            }
        });

        Drink6Select.setText("Select");
        Drink6Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink6SelectActionPerformed(evt);
            }
        });

        Drink4Select.setText("Select");
        Drink4Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Drink4SelectActionPerformed(evt);
            }
        });

        DrinkBrand1Price.setText("?");

        DrinkBrand2Price.setText("?");

        DrinkBrand3Price.setText("?");

        DrinkBrand4Price.setText("?");

        DrinkBrand5Price.setText("?");

        DrinkBrand6Price.setText("?");

        stock1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock1.setForeground(new java.awt.Color(255, 0, 0));
        stock1.setText("NOT IN STOCK");

        stock2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock2.setForeground(new java.awt.Color(255, 0, 0));
        stock2.setText("NOT IN STOCK");

        stock3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock3.setForeground(new java.awt.Color(255, 0, 0));
        stock3.setText("NOT IN STOCK");

        stock4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock4.setForeground(new java.awt.Color(255, 0, 0));
        stock4.setText("NOT IN STOCK");

        stock5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock5.setForeground(new java.awt.Color(255, 0, 0));
        stock5.setText("NOT IN STOCK");

        stock6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock6.setForeground(new java.awt.Color(255, 0, 0));
        stock6.setText("NOT IN STOCK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DrinkBrand6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DrinkBrand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(DrinkBrand4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(DrinkBrand3Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand4Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand5Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand6Price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkBrand2Price, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(DrinkBrand1Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(stock5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Drink5Select))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(stock1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Drink1Select)
                            .addComponent(jLabel13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stock4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stock3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stock2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stock6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Drink3Select)
                            .addComponent(Drink2Select)
                            .addComponent(Drink4Select)
                            .addComponent(Drink6Select))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Drink1Select)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DrinkBrand1)
                        .addComponent(DrinkBrand1Price)
                        .addComponent(stock1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drink2Select)
                    .addComponent(stock2)
                    .addComponent(DrinkBrand2Price)
                    .addComponent(DrinkBrand2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drink3Select)
                    .addComponent(stock3)
                    .addComponent(DrinkBrand3Price)
                    .addComponent(DrinkBrand3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drink4Select)
                    .addComponent(stock4)
                    .addComponent(DrinkBrand4Price)
                    .addComponent(DrinkBrand4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drink5Select)
                    .addComponent(stock5)
                    .addComponent(DrinkBrand5Price)
                    .addComponent(DrinkBrand5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drink6Select)
                    .addComponent(DrinkBrand6Price)
                    .addComponent(DrinkBrand6)
                    .addComponent(stock6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clear/New Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ClearButton.setText("Press Here");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Clear all selections");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearButton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("CHANGE");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Collect Drink", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        CollectDrink.setText("Press Here");
        CollectDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectDrinkActionPerformed(evt);
            }
        });

        jLabel20.setText("Collect Drink & Remaining Change");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CollectDrink)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CollectDrink)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complete Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        terminate.setText("Press Here");
        terminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminateActionPerformed(evt);
            }
        });

        jLabel21.setText("Finish");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminate)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminate)
                    .addComponent(jLabel21))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("TOTAL INSERTED");

        CoinsChange.setText("0.00");

        TotalInserted.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CoinsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Insert))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalInserted, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CoinsChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CoinsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CoinsChange)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalInserted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("CUSTOMER CONTROL PANEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoinsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsInputActionPerformed
        // N/A
    }//GEN-LAST:event_CoinsInputActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
//        Drink1Select.setSelected(false);
//        Drink2Select.setSelected(false);
//        Drink3Select.setSelected(false);
//        Drink4Select.setSelected(false);
//        Drink5Select.setSelected(false);
//        Drink6Select.setSelected(false);
//
//        insertedCoinTotal = 0;
//        CoinsChange.setText("0.00");
//        CoinsInput.setText(" ");
//        TotalInserted.setText(String.valueOf(insertedCoinTotal));
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CollectDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollectDrinkActionPerformed

        double isSufficient = totalInsertedCoins; //a var for checking if the coins inserted are sufficient to purchase drink
        String selectedDrink = null;

        if (isSufficient <= 0) {
            JOptionPane.showMessageDialog(rootPane, "No/Not enough money was inserted. Please, insert money.");
        } else {
            if (Drink1Select.isSelected()) {
                isSufficient -= drinkPrice1;
                selectedDrink = "drinkPrice1";
            } else if (Drink2Select.isSelected()) {
                isSufficient -= drinkPrice2;
                selectedDrink = "drinkPrice2";
            } else if (Drink3Select.isSelected()) {
                isSufficient -= drinkPrice3;
                selectedDrink = "drinkPrice3";
            } else if (Drink4Select.isSelected()) {
                isSufficient -= drinkPrice4;
                selectedDrink = "drinkPrice4";
            } else if (Drink5Select.isSelected()) {
                isSufficient -= drinkPrice5;
                selectedDrink = "drinkPrice5";
            } else if (Drink6Select.isSelected()) {
                isSufficient -= drinkPrice6;
                selectedDrink = "drinkPrice6";
            }

            if (isSufficient < 0) {
                JOptionPane.showMessageDialog(rootPane, "Insufficient Funds. Please, insert more money");
            } else if (isSufficient == 0 || isSufficient > 0) { //aka, successful
//                Reduce stock by 1 from the selected drink
                try {
                    File originalFile = new File("DrinksStock.txt");
                    BufferedReader br = new BufferedReader(new FileReader(originalFile));

                    // Construct the new file that will later be renamed to the original
                    // filename.
                    File tempFile = new File("tempfile.txt");
                    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                    String line = null;
                    // Read from the original file and write to the new
                    // unless content matches data to be removed
                    while ((line = br.readLine()) != null) {
                        if (line.contains(selectedDrink)) {
                            String strCurrentStock = line.substring(line.lastIndexOf(" "), line.length());
                            if (strCurrentStock != null || !strCurrentStock.trim().isEmpty()) {
                                int newStock = Integer.parseInt(strCurrentStock.trim()) - 1;
                                System.out.println("new stock : " + newStock);
                                line = line.substring(0, line.lastIndexOf(" ")) + " " + newStock;
                            }
                        }
                        pw.println(line);
                        pw.flush();
                    }
                    pw.close();
                    br.close();
                    // Delete the original file
                    if (!originalFile.delete()) {
                        System.out.println("Could not delete file");
                        return;
                    }
                    // Rename the new file to the filename the original file had.
                    if (!tempFile.renameTo(originalFile)) {
                        System.out.println("Could not rename file");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                if (isSufficient == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Item purchased successfully! Please, collect the dispensed drink.");
                } else if (isSufficient > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Item purchased successfully! Please, collect the dispensed change & drink.");

                    // REDUCE COIN STOCK
                    
//                    String coinstomoney10 = String.valueOf(Double.parseDouble(coinStockList.get(1)) * 0.1);
//                    String coinstomoney20 = String.valueOf(Double.parseDouble(coinStockList.get(3)) * 0.2);
//                    String coinstomoney50 = String.valueOf(Double.parseDouble(coinStockList.get(5)) * 0.5);
//                    String coinstomoney1 = String.valueOf(Double.parseDouble(coinStockList.get(1)) * 1);
//
//                    totalCash = coinstomoney10 + coinstomoney20 + coinstomoney50 + coinstomoney1;
//                            
//                    TotalCash.setText(String.valueOf(totalCash));
//                    String doubleAsString = Double.toString(123.456);
//                    String wholeNumber = String.valueOf(isSufficient.substring(0, isSufficient.indexOf("."))); //123
//                    String fractionNumber = String.valueOf(isSufficient.substring(doubleAsString.indexOf(".") + 1)); //456
//                    


//                    1. CALCULATIONS TO KNOW WHICH TO REDUCE
//                    
//                    try {
////                        EL ACTUAL FILE MODIFICATION
//
//                        File myObj = new File("CoinStock.txt");
//                        Scanner myReader = new Scanner(myObj);
//                        ArrayList<String> coinStockList = new ArrayList<String>();
//                        while (myReader.hasNext()) {
//                            coinStockList.add(myReader.next());
//                        }
//                        myReader.close();
//
////                        double coinstomoney10 = Double.parseDouble(coinStockList.get(1)) * 0.1;
////                        double coinstomoney20 = Double.parseDouble(coinStockList.get(3)) * 0.2;
////                        double coinstomoney50 = Double.parseDouble(coinStockList.get(5)) * 0.5;
////                        double coinstomoney1 = Double.parseDouble(coinStockList.get(1)) * 1;
//                                File originalFile = new File("CoinStock.txt");
//                        BufferedReader br = new BufferedReader(new FileReader(originalFile));
//                        File tempFile = new File("tempfile.txt");
//                        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
//
//                        String line = null;
//
//                        while ((line = br.readLine()) != null) {
//                            if (line.contains(selectedDrink)) {
//                                String strCurrentStock = line.substring(line.lastIndexOf(" "), line.length());
//                                if (strCurrentStock != null || !strCurrentStock.trim().isEmpty()) {
//                                    int newStock = Integer.parseInt(strCurrentStock.trim()) - 1;
//                                    System.out.println("new stock : " + newStock);
//                                    line = line.substring(0, line.lastIndexOf(" ")) + " " + newStock;
//                                }
//                            }
//                            pw.println(line);
//                            pw.flush();
//                        }
//                        pw.close();
//                        br.close();
//                        // Delete the original file
//                        if (!originalFile.delete()) {
//                            System.out.println("Could not delete file");
//                            return;
//                        }
//                        // Rename the new file to the filename the original file had.
//                        if (!tempFile.renameTo(originalFile)) {
//                            System.out.println("Could not rename file");
//                        }
//                    } catch (IOException e) {
//                        System.out.println("An error occurred.");
//                        e.printStackTrace();
//                    }
//
////                    String.valueOf(isSufficient)
//                }
//
////                RESET ALL
////                checkStorage();
//////                ReduceCoinStorage();
//                TotalInserted.setText("0.00");
//                CoinsInput.setText(" ");
//                CoinsChange.setText(String.valueOf(isSufficient));
                }
            }
        }
    }//GEN-LAST:event_CollectDrinkActionPerformed

    private void Drink2SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink2SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink2Select.isSelected()) {
            Drink1Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink2SelectActionPerformed

    private void Drink1SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink1SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink1Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink1SelectActionPerformed

    private void Drink3SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink3SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink3Select.isSelected()) {
            Drink1Select.setSelected(false);
            Drink2Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink3SelectActionPerformed

    private void Drink5SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink5SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink5Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink1Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink5SelectActionPerformed

    private void Drink6SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink6SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink6Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink1Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink6SelectActionPerformed

    private void Drink4SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Drink4SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink4Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink6Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink1Select.setSelected(false);
        }
    }//GEN-LAST:event_Drink4SelectActionPerformed

    private void terminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminateActionPerformed
        dispose();
    }//GEN-LAST:event_terminateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        insertedCoin = Double.valueOf(CoinsInput.getText());
        String updateStock = null;

        if (insertedCoin == 0.1) {
            totalInsertedCoins += 0.1;
            updateStock = "coinsStock10";
        } else if (insertedCoin == 0.2) {
            updateStock = "coinsStock20";
            totalInsertedCoins += 0.2;
        } else if (insertedCoin == 0.5) {
            updateStock = "coinsStock50";
            totalInsertedCoins += 0.5;
        } else if (insertedCoin == 1) {
            updateStock = "coinsStock1";
            totalInsertedCoins += 1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please, insert valid money (0.10 / 0.20 / 0.50 / 1)");
        }

        if (updateStock == "coinsStock10" || updateStock == "coinsStock20" || updateStock == "coinsStock50" || updateStock == "coinsStock1") {
            try {
                File originalFile = new File("CoinStock.txt");
                BufferedReader br = new BufferedReader(new FileReader(originalFile));

                // Construct the new file that will later be renamed to the original
                // filename.
                File tempFile = new File("tempfile.txt");
                PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                String line = null;
                // Read from the original file and write to the new
                // unless content matches data to be removed
                while ((line = br.readLine()) != null) {
                    if (line.contains(updateStock)) {
                        String strCurrentStock = line.substring(line.lastIndexOf(" "), line.length());
                        if (strCurrentStock != null || !strCurrentStock.trim().isEmpty()) {
                            int newStock = Integer.parseInt(strCurrentStock.trim()) + 1;
                            System.out.println("new stock : " + newStock);
                            line = line.substring(0, line.lastIndexOf(" ")) + " " + newStock;
                        }
                    }
                    pw.println(line);
                    pw.flush();
                }
                pw.close();
                br.close();

                // Delete the original file
                if (!originalFile.delete()) {
                    System.out.println("Could not delete file");
                    return;
                }

                // Rename the new file to the filename the original file had.
                if (!tempFile.renameTo(originalFile)) {
                    System.out.println("Could not rename file");
                }

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");
        totalInsertedCoins = (double) (Math.round(totalInsertedCoins * 100.0) / 100.0);

        TotalInserted.setText(String.valueOf(totalInsertedCoins));

        insertedCoin = 0.00;
        CoinsInput.setText(String.valueOf(insertedCoin));
    }//GEN-LAST:event_InsertActionPerformed

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
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel CoinsChange;
    private javax.swing.JTextField CoinsInput;
    private javax.swing.JButton CollectDrink;
    private javax.swing.JRadioButton Drink1Select;
    private javax.swing.JRadioButton Drink2Select;
    private javax.swing.JRadioButton Drink3Select;
    private javax.swing.JRadioButton Drink4Select;
    private javax.swing.JRadioButton Drink5Select;
    private javax.swing.JRadioButton Drink6Select;
    private javax.swing.JLabel DrinkBrand1;
    public javax.swing.JLabel DrinkBrand1Price;
    private javax.swing.JLabel DrinkBrand2;
    public javax.swing.JLabel DrinkBrand2Price;
    private javax.swing.JLabel DrinkBrand3;
    public javax.swing.JLabel DrinkBrand3Price;
    private javax.swing.JLabel DrinkBrand4;
    public javax.swing.JLabel DrinkBrand4Price;
    private javax.swing.JLabel DrinkBrand5;
    public javax.swing.JLabel DrinkBrand5Price;
    private javax.swing.JLabel DrinkBrand6;
    public javax.swing.JLabel DrinkBrand6Price;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel TotalInserted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel stock1;
    private javax.swing.JLabel stock2;
    private javax.swing.JLabel stock3;
    private javax.swing.JLabel stock4;
    private javax.swing.JLabel stock5;
    private javax.swing.JLabel stock6;
    private javax.swing.JButton terminate;
    // End of variables declaration//GEN-END:variables
}
