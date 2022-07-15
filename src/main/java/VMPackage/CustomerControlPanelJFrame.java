package VMPackage;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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

    public static double insertedCoin; // currently inserted coin by the user in an active transaction
    public static double totalInsertedCoins; // all inserted coins by the user in an active transaction

    public static double drinkPrice1;
    public static double drinkPrice2;
    public static double drinkPrice3;
    public static double drinkPrice4;
    public static double drinkPrice5;
    public static double drinkPrice6;

    public static int drinkStock1;
    public static int drinkStock2;
    public static int drinkStock3;
    public static int drinkStock4;
    public static int drinkStock5;
    public static int drinkStock6;

    public static int coinStock10;
    public static int coinStock20;
    public static int coinStock50;
    public static int coinStock1;

    public static String VMhasChange;
    public static String purchasedDrink;

//    stock & change part
    Double remainder = null;

    private void extracted(Double remainder, Double bill, List<Double> outPut) {
        Double denominator = this.remainder / bill;
        for (int i = 0; i < Math.floor(denominator); i++) {
            outPut.add(bill);
        }
        this.remainder = this.remainder % bill;
    }

    public List<Double> giveChange(Double remainder) {
        List<Double> outPut = new ArrayList<>();
        List<Double> bills = List.of(1.00, 0.5, 0.20, 0.10);
        bills.stream().forEach(e -> extracted((double) Math.round(this.remainder * 100) / 100, e, outPut));
        return outPut;
    }

//    end of stoock part
    public static void getDrinksPrice(ArrayList<String> drinksPrices) {
        drinkPrice1 = Double.parseDouble(drinksPrices.get(1));
        drinkPrice2 = Double.parseDouble(drinksPrices.get(3));
        drinkPrice3 = Double.parseDouble(drinksPrices.get(5));
        drinkPrice4 = Double.parseDouble(drinksPrices.get(7));
        drinkPrice5 = Double.parseDouble(drinksPrices.get(9));
        drinkPrice6 = Double.parseDouble(drinksPrices.get(11));
    }

    public static void getDrinksStock(ArrayList<String> drinksStock) {
        drinkStock1 = Integer.parseInt(drinksStock.get(1));
        drinkStock2 = Integer.parseInt(drinksStock.get(3));
        drinkStock3 = Integer.parseInt(drinksStock.get(5));
        drinkStock4 = Integer.parseInt(drinksStock.get(7));
        drinkStock5 = Integer.parseInt(drinksStock.get(9));
        drinkStock6 = Integer.parseInt(drinksStock.get(11));
    }

    public static void getCoinsStock(ArrayList<String> coinsStock) {
        coinStock10 = Integer.parseInt(coinsStock.get(1));
        coinStock20 = Integer.parseInt(coinsStock.get(3));
        coinStock50 = Integer.parseInt(coinsStock.get(5));
        coinStock1 = Integer.parseInt(coinsStock.get(7));
    }

    private void enableButtons() {
        if (drinkStock1 == 0) {
            stock1.setForeground(Color.RED);
            Drink1Select.setEnabled(false);
        } else {
            stock1.setForeground(Color.GRAY);
        }
        if (drinkStock2 == 0) {
            stock2.setForeground(Color.RED);
            Drink2Select.setEnabled(false);
        } else {
            stock2.setForeground(Color.GRAY);
        }
        if (drinkStock3 == 0) {
            stock3.setForeground(Color.RED);
            Drink3Select.setEnabled(false);
        } else {
            stock3.setForeground(Color.GRAY);
        }
        if (drinkStock4 == 0) {
            stock4.setForeground(Color.RED);
            Drink4Select.setEnabled(false);
        } else {
            stock4.setForeground(Color.GRAY);
        }
        if (drinkStock5 == 0) {
            stock5.setForeground(Color.RED);
            Drink5Select.setEnabled(false);
        } else {
            stock5.setForeground(Color.GRAY);
        }
        if (drinkStock6 == 0) {
            stock6.setForeground(Color.RED);
            Drink6Select.setEnabled(false);
        } else {
            stock6.setForeground(Color.GRAY);
        }
    }

    public CustomerControlPanelJFrame() {
        initComponents();
        // DISPLAY PRICE
        getDrinksPrice(FileHandler.readFile("DrinksPrice.txt"));

        DrinkBrand1Price.setText(String.valueOf(drinkPrice1));
        DrinkBrand2Price.setText(String.valueOf(drinkPrice2));
        DrinkBrand3Price.setText(String.valueOf(drinkPrice3));
        DrinkBrand4Price.setText(String.valueOf(drinkPrice4));
        DrinkBrand5Price.setText(String.valueOf(drinkPrice5));
        DrinkBrand6Price.setText(String.valueOf(drinkPrice6));

        // GET DRINKS STOCK
        getDrinksStock(FileHandler.readFile("DrinksStock.txt"));
        getCoinsStock(FileHandler.readFile("CoinStock.txt"));
        enableButtons();

        CollectCash.disable();
        CollectCan.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        jLabel19 = new javax.swing.JLabel();
        CollectCash = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        CollectDrink = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        TotalInserted = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        CollectCan = new javax.swing.JButton();
        InvalidCoins = new javax.swing.JLabel();
        NoChangeAvailable = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vending Machine Cutomer Panel");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        stock1.setForeground(new java.awt.Color(153, 153, 153));
        stock1.setText("NOT IN STOCK");

        stock2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock2.setForeground(new java.awt.Color(153, 153, 153));
        stock2.setText("NOT IN STOCK");

        stock3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock3.setForeground(new java.awt.Color(153, 153, 153));
        stock3.setText("NOT IN STOCK");

        stock4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock4.setForeground(new java.awt.Color(153, 153, 153));
        stock4.setText("NOT IN STOCK");

        stock5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock5.setForeground(new java.awt.Color(153, 153, 153));
        stock5.setText("NOT IN STOCK");

        stock6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stock6.setForeground(new java.awt.Color(153, 153, 153));
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cash Collection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel19.setText("Collect Change/Returned Cash Here");

        CollectCash.setText("Press Here");
        CollectCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CollectCash)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(CollectCash))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complete Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        CollectDrink.setText("Press Here");
        CollectDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectDrinkActionPerformed(evt);
            }
        });

        jLabel20.setText("Return Cash & Terminate Transaction");

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

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("TOTAL MONEY INSERTED");

        TotalInserted.setBackground(new java.awt.Color(153, 153, 153));
        TotalInserted.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalInserted.setText("0.00");
        TotalInserted.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Can Collection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel23.setText("Collect Can Here");

        CollectCan.setText("Press Here");
        CollectCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CollectCan)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CollectCan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InvalidCoins.setBackground(new java.awt.Color(153, 153, 153));
        InvalidCoins.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        InvalidCoins.setForeground(new java.awt.Color(153, 153, 153));
        InvalidCoins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InvalidCoins.setText("COINS NOT VALID");
        InvalidCoins.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NoChangeAvailable.setBackground(new java.awt.Color(153, 153, 153));
        NoChangeAvailable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NoChangeAvailable.setForeground(new java.awt.Color(153, 153, 153));
        NoChangeAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoChangeAvailable.setText("NO CHANGE AVAILABLE");
        NoChangeAvailable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CoinsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvalidCoins, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(TotalInserted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NoChangeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(InvalidCoins, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CoinsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalInserted, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoChangeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CUSTOMER CONTROL PANEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CollectCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollectCashActionPerformed
        if ("true".equals(VMhasChange)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Change of " + ((double) Math.round(remainder * 100) / 100) + " has been collected.");
            totalInsertedCoins = 0;
            remainder = null;

            NoChangeAvailable.setForeground(Color.GRAY);
        } else if ("false".equals(VMhasChange)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Sorry, the vending machine does not have change.");
            NoChangeAvailable.setForeground(Color.RED);
        }
        CollectCash.setEnabled(false);
        VMhasChange = null;
    }//GEN-LAST:event_CollectCashActionPerformed

    private void CollectCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollectCanActionPerformed
        // If purchase is successful, then Drink X has been collected
        String drinkName = null;
        switch (purchasedDrink) {
            case "drinksStock1" ->
                drinkName = "Blueberry";
            case "drinksStock2" ->
                drinkName = "Raspberry";
            case "drinksStock3" ->
                drinkName = "Passionfruit";
            case "drinksStock4" ->
                drinkName = "Strawberry";
            case "drinksStock5" ->
                drinkName = "Orange";
            case "drinksStock6" ->
                drinkName = "Lime";
        }
        if (purchasedDrink != null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Drink" + drinkName + " has been dispensed.");
            purchasedDrink = null;
            CollectCan.setEnabled(false);
        }
    }//GEN-LAST:event_CollectCanActionPerformed

    private void CoinsInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CoinsInputActionPerformed
        // N/A
    }
    // GEN-LAST:event_CoinsInputActionPerformed

    private void CollectDrinkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CollectDrinkActionPerformed
        double isSufficient = (double) Math.round(totalInsertedCoins * 100) / 100; // a var for checking if the coins inserted are sufficient to purchase
        if (Drink1Select.isSelected() == false && Drink2Select.isSelected() == false && Drink3Select.isSelected() == false && Drink4Select.isSelected() == false && Drink5Select.isSelected() == false && Drink6Select.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane,
                    "Please, select a drink.");
        } else {
            String selectedDrink = null;

            if (isSufficient <= 0) {
                JOptionPane.showMessageDialog(rootPane, "No/Not enough money was inserted. Please, insert more money.");
            } else {
                if (Drink1Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice1 * 100) / 100;
                    selectedDrink = "drinksStock1";
                } else if (Drink2Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice2 * 100) / 100;
                    selectedDrink = "drinksStock2";
                } else if (Drink3Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice3 * 100) / 100;
                    selectedDrink = "drinksStock3";
                } else if (Drink4Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice4 * 100) / 100;
                    selectedDrink = "drinksStock4";
                } else if (Drink5Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice5 * 100) / 100;;
                    selectedDrink = "drinksStock5";
                } else if (Drink6Select.isSelected()) {
                    isSufficient -= (double) Math.round(drinkPrice6 * 100) / 100;
                    selectedDrink = "drinksStock6";
                }
                if (isSufficient < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Insufficient Funds. Please, insert more money");
                } else if (isSufficient == 0 || isSufficient > 0) { // aka, successful
                    // Reduce stock by 1 from the selected drink
                    FileHandler.reduce("DrinksStock.txt", selectedDrink, 1);
                    purchasedDrink = selectedDrink;
                    getDrinksStock(FileHandler.readFile("DrinksStock.txt"));
                    enableButtons();

                    if (isSufficient == 0) { // No change needed
                        JOptionPane.showMessageDialog(rootPane,
                                "Item purchased successfully! Please, collect the dispensed drink.");
                        CollectCan.enable();
                        totalInsertedCoins = 0;
                        TotalInserted.setText("0.00");
                        remainder = null;
                    } else if (isSufficient > 0) { //Change needed
                        getCoinsStock(FileHandler.readFile("CoinStock.txt"));
                        CollectCash.setEnabled(true);
                        CollectCan.setEnabled(true);
//                        checkiing VM Stock
                        if (coinStock1 + coinStock20 + coinStock10 + coinStock50 < isSufficient) { //if no change in VM
                            JOptionPane.showMessageDialog(rootPane,
                                    "Item purchased successfully! Please, collect the dispensed drink.");
                            VMhasChange = "false";
                            NoChangeAvailable.setForeground(Color.RED);
                        } else if (coinStock1 + coinStock20 + coinStock10 + coinStock50 >= isSufficient) { //there is change in VM
                            JOptionPane.showMessageDialog(rootPane,
                                    "Item purchased successfully! Please, collect the dispensed change & drink.");
                            VMhasChange = "true";
                            NoChangeAvailable.setForeground(Color.GRAY);
                            remainder = isSufficient;
                            List<Double> change = giveChange(isSufficient);
                            for (int i = 0; i < change.size(); i++) {
                                System.out.println(change.get(i));
                                if (change.get(i) == 1.0) {
                                    coinStock1 -= 1;
                                    FileHandler.reduce("CoinStock.txt", "coinsStock-1", 1);
                                } else if (change.get(i) == 0.5) {
                                    coinStock50 -= 1;
                                    FileHandler.reduce("CoinStock.txt", "coinsStock50", 1);
                                } else if (change.get(i) == 0.2) {
                                    coinStock20 -= 1;
                                    FileHandler.reduce("CoinStock.txt", "coinsStock20", 1);
                                } else if (change.get(i) == 0.1) {
                                    coinStock10 -= 1;
                                    FileHandler.reduce("CoinStock.txt", "coinsStock10", 1);
                                }
                            }
//                        System.out.println("==Sum of change: ==");
//                        System.out.println(change.stream().reduce(0.0, (subtotal, element) -> subtotal + element));
                            // RESET ALL
                            CoinsInput.setText("0.00");
//                        HOHO: CoinsChange.setText(String.valueOf((double) Math.round(isSufficient * 100) / 100));
//                        new CustomerControlPanelJFrame().enableButtons();
                        }
                    }
                }
            }
        }
    }// GEN-LAST:event_CollectDrinkActionPerformed

    private void Drink2SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink2SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink2Select.isSelected()) {
            Drink1Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink2SelectActionPerformed

    private void Drink1SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink1SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink1Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink1SelectActionPerformed

    private void Drink3SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink3SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink3Select.isSelected()) {
            Drink1Select.setSelected(false);
            Drink2Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink3SelectActionPerformed

    private void Drink5SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink5SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink5Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink1Select.setSelected(false);
            Drink6Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink5SelectActionPerformed

    private void Drink6SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink6SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink6Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink4Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink1Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink6SelectActionPerformed

    private void Drink4SelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Drink4SelectActionPerformed
        // Enable selection of only 1 Radio Button
        if (Drink4Select.isSelected()) {
            Drink2Select.setSelected(false);
            Drink3Select.setSelected(false);
            Drink6Select.setSelected(false);
            Drink5Select.setSelected(false);
            Drink1Select.setSelected(false);
        }
    }// GEN-LAST:event_Drink4SelectActionPerformed

    private void terminateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_terminateActionPerformed
        dispose();
    }// GEN-LAST:event_terminateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_InsertActionPerformed
//      MESH ELMAFROUD N7OTOHOM FEL STOCK TALAMA LESSA MASHTARASH 3ASHAN MOMKEN MAYESHTEREESH FEL AKHER

        insertedCoin = Double.valueOf(CoinsInput.getText());
        String updateStock = null;

        if (insertedCoin == 0.1) {
            InvalidCoins.enable();
            InvalidCoins.setForeground(Color.GRAY);
            totalInsertedCoins += 0.1;
            updateStock = "coinsStock10";
        } else if (insertedCoin == 0.2) {
            InvalidCoins.enable();
            InvalidCoins.setForeground(Color.GRAY);
            updateStock = "coinsStock20";
            totalInsertedCoins += 0.2;
        } else if (insertedCoin == 0.5) {
            InvalidCoins.enable();
            InvalidCoins.setForeground(Color.GRAY);
            updateStock = "coinsStock50";
            totalInsertedCoins += 0.5;
        } else if (insertedCoin == 1) {
            InvalidCoins.enable();
            InvalidCoins.setForeground(Color.GRAY);
            updateStock = "coinsStock-1";
            totalInsertedCoins += 1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please, insert valid money (0.10 / 0.20 / 0.50 / 1)");
            InvalidCoins.enable();
            InvalidCoins.setForeground(Color.RED);
        }

//        HENA DA ELLY ELMAFROUD YE7SAL FEL AKHER MESH HENA
        if (updateStock == "coinsStock10" || updateStock == "coinsStock20" || updateStock == "coinsStock50"
                || updateStock == "coinsStock-1") {
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

        totalInsertedCoins = (double) (Math.round(totalInsertedCoins * 100.0) / 100.0);

        TotalInserted.setText(String.valueOf(totalInsertedCoins));

        insertedCoin = 0.00;
        CoinsInput.setText(String.valueOf(insertedCoin));
    }// GEN-LAST:event_InsertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulatorControlPanelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoinsInput;
    private javax.swing.JButton CollectCan;
    private javax.swing.JButton CollectCash;
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
    private javax.swing.JLabel InvalidCoins;
    private javax.swing.JLabel NoChangeAvailable;
    private javax.swing.JLabel TotalInserted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel stock1;
    private javax.swing.JLabel stock2;
    private javax.swing.JLabel stock3;
    private javax.swing.JLabel stock4;
    private javax.swing.JLabel stock5;
    private javax.swing.JLabel stock6;
    // End of variables declaration//GEN-END:variables

}
