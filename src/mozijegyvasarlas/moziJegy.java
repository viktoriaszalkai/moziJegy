/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mozijegyvasarlas;



public class MoziJegy extends javax.swing.JFrame {

    
    double vegsoAr;
    int jegyek;
    int jegyFelnott, dbFelnott;
    int jegyGyermek, dbGyermek ;
    int jegyNyudijjas, dbNyugdijjas;
    String helyszin, osszegzesKiiras, nap, film, rendeltJegyek;
    String felnott, gyermek, nyugdijjas;
    
    
    
    public MoziJegy() {
        initComponents();
       
        vegsoAr = 0;
        jegyFelnott = 0;
        jegyGyermek = 0;
        jegyNyudijjas = 0;
        dbFelnott = 0;
        dbGyermek = 0;
        dbNyugdijjas = 0;
        jegyek = (jegyFelnott *dbFelnott) + (jegyGyermek * dbGyermek) + (jegyNyudijjas * dbNyugdijjas);
        
        felnott = "     -felnőtt";
        gyermek = "     -gyermek";
        nyugdijjas = "     -nyugdíjjas/diák";
                
       
        jegySzamitas();
                
                
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbVaros = new javax.swing.JComboBox<>();
        chbHetfo = new javax.swing.JCheckBox();
        chbKedd = new javax.swing.JCheckBox();
        chbSzerda = new javax.swing.JCheckBox();
        chbCsutortok = new javax.swing.JCheckBox();
        chbSzombat = new javax.swing.JCheckBox();
        chbPentek = new javax.swing.JCheckBox();
        chbVasarnap = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        spnrDbFelnott = new javax.swing.JSpinner();
        spnrDbGyermek = new javax.swing.JSpinner();
        spnrDbNyugdijjasDiak = new javax.swing.JSpinner();
        rbnFelnott = new javax.swing.JRadioButton();
        rbnGyermek = new javax.swing.JRadioButton();
        rbnNyugdijjasDiak = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        chbBarbie = new javax.swing.JCheckBox();
        chbMammaMia = new javax.swing.JCheckBox();
        chbAgymanok = new javax.swing.JCheckBox();
        chbShrek = new javax.swing.JCheckBox();
        chbApaca = new javax.swing.JCheckBox();
        chbDemonok = new javax.swing.JCheckBox();
        chbHalalos = new javax.swing.JCheckBox();
        chbOppenheimer = new javax.swing.JCheckBox();
        chbMenInBlack = new javax.swing.JCheckBox();
        chbSzellemirtok = new javax.swing.JCheckBox();
        chbCreed = new javax.swing.JCheckBox();
        chbSzemfenyvesztok = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblVegosszeg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRendeles = new javax.swing.JButton();
        btnMegse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(114, 148, 114));
        jLabel2.setText("kertmozi élmény");

        jPanel4.setBackground(new java.awt.Color(137, 179, 137));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dátum, helyszín", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(137, 179, 137));

        cmbVaros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--válasszon várost--", "Budapest", "Győr", "Tihany", "Velence" }));
        cmbVaros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVarosActionPerformed(evt);
            }
        });

        chbHetfo.setText("Hétfő");
        chbHetfo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbHetfoItemStateChanged(evt);
            }
        });

        chbKedd.setText("Kedd");
        chbKedd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbKeddItemStateChanged(evt);
            }
        });

        chbSzerda.setText("Szerda");
        chbSzerda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbSzerdaItemStateChanged(evt);
            }
        });

        chbCsutortok.setText("Csütörtök");
        chbCsutortok.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbCsutortokItemStateChanged(evt);
            }
        });

        chbSzombat.setText("Szombat");
        chbSzombat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbSzombatItemStateChanged(evt);
            }
        });

        chbPentek.setText("Péntek");
        chbPentek.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbPentekItemStateChanged(evt);
            }
        });

        chbVasarnap.setText("Vasárnap");
        chbVasarnap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbVasarnapItemStateChanged(evt);
            }
        });

        jLabel6.setText("Heti ajánlatunk");

        jLabel7.setText("2023.11.20.-2023.11.26.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbVaros, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbVasarnap)
                    .addComponent(chbHetfo)
                    .addComponent(chbSzerda)
                    .addComponent(chbPentek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSzombat)
                    .addComponent(chbCsutortok)
                    .addComponent(chbKedd))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cmbVaros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbHetfo)
                    .addComponent(chbKedd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbSzerda)
                    .addComponent(chbCsutortok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbPentek)
                    .addComponent(chbSzombat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbVasarnap)
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(137, 179, 137));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Jegyek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        spnrDbFelnott.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnrDbFelnott.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrDbFelnottStateChanged(evt);
            }
        });

        spnrDbGyermek.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnrDbGyermek.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrDbGyermekStateChanged(evt);
            }
        });

        spnrDbNyugdijjasDiak.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        spnrDbNyugdijjasDiak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrDbNyugdijjasDiakStateChanged(evt);
            }
        });

        rbnFelnott.setText("felnőtt (2000 ft)");
        rbnFelnott.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnFelnottItemStateChanged(evt);
            }
        });

        rbnGyermek.setText("gyermek (1000 ft)");
        rbnGyermek.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnGyermekItemStateChanged(evt);
            }
        });

        rbnNyugdijjasDiak.setText("nyugdíjjas-diák (1500 ft)");
        rbnNyugdijjasDiak.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnNyugdijjasDiakItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbnNyugdijjasDiak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnrDbNyugdijjasDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbnFelnott)
                            .addComponent(rbnGyermek))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnrDbGyermek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrDbFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnFelnott)
                    .addComponent(spnrDbFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnGyermek)
                    .addComponent(spnrDbGyermek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrDbNyugdijjasDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnNyugdijjasDiak))
                .addGap(9, 9, 9))
        );

        jPanel8.setBackground(new java.awt.Color(137, 179, 137));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Filmek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        chbBarbie.setText("Barbie");
        chbBarbie.setEnabled(false);

        chbMammaMia.setText("Mamma mia!");
        chbMammaMia.setEnabled(false);

        chbAgymanok.setText("Agymanók");
        chbAgymanok.setEnabled(false);

        chbShrek.setText("Shrek ");
        chbShrek.setEnabled(false);

        chbApaca.setText("Apáca ");
        chbApaca.setEnabled(false);

        chbDemonok.setText("Démonok között");
        chbDemonok.setEnabled(false);

        chbHalalos.setText("Halálos iramban ");
        chbHalalos.setEnabled(false);

        chbOppenheimer.setText("Oppenheimer");
        chbOppenheimer.setEnabled(false);

        chbMenInBlack.setText("Men in black");
        chbMenInBlack.setEnabled(false);

        chbSzellemirtok.setText("Szellemírtók");
        chbSzellemirtok.setEnabled(false);

        chbCreed.setText("Creed III");
        chbCreed.setEnabled(false);

        chbSzemfenyvesztok.setText("Szemfényvesztők");
        chbSzemfenyvesztok.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbBarbie)
                    .addComponent(chbMammaMia)
                    .addComponent(chbAgymanok)
                    .addComponent(chbShrek)
                    .addComponent(chbApaca)
                    .addComponent(chbDemonok)
                    .addComponent(chbHalalos)
                    .addComponent(chbOppenheimer)
                    .addComponent(chbMenInBlack)
                    .addComponent(chbSzellemirtok)
                    .addComponent(chbCreed)
                    .addComponent(chbSzemfenyvesztok))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbBarbie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbMammaMia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAgymanok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbShrek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbApaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbDemonok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbHalalos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbOppenheimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbMenInBlack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbSzellemirtok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbCreed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSzemfenyvesztok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(137, 179, 137));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Vásárlásom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bauhaus 93", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(137, 179, 137));

        jLabel4.setText("végösszeg:");

        txaOsszesito.setEditable(false);
        txaOsszesito.setBackground(new java.awt.Color(204, 255, 204));
        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        jScrollPane3.setViewportView(txaOsszesito);

        jLabel8.setText("ft");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(lblVegosszeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(lblVegosszeg)))
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/png.monster-120-299x370.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/png.monster-120-299x374.png"))); // NOI18N

        btnRendeles.setBackground(new java.awt.Color(137, 179, 137));
        btnRendeles.setText("Rendelés");
        btnRendeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRendelesMouseClicked(evt);
            }
        });

        btnMegse.setBackground(new java.awt.Color(137, 179, 137));
        btnMegse.setText("Mégse");
        btnMegse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMegseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(btnRendeles)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 85, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRendeles)
                            .addComponent(btnMegse))
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbHetfoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbHetfoItemStateChanged
    if (chbHetfo.isSelected()){
        nap = "hétfő";
        chbBarbie.setEnabled(true);
        chbMammaMia.setEnabled(true);
    }else{
        chbBarbie.setEnabled(false);
        chbMammaMia.setEnabled(false);
    }
    }//GEN-LAST:event_chbHetfoItemStateChanged

    private void chbKeddItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbKeddItemStateChanged
    if (chbKedd.isSelected()){
            nap = "kedd";
            chbAgymanok.setEnabled(true);
            chbShrek.setEnabled(true);
        }else{
            chbAgymanok.setEnabled(false);
            chbShrek.setEnabled(false);
        }   
    }//GEN-LAST:event_chbKeddItemStateChanged

    private void chbSzerdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbSzerdaItemStateChanged
    if (chbSzerda.isSelected()){
        nap = "szerda";
        chbApaca.setEnabled(true);
        chbDemonok.setEnabled(true);
    }else{
        chbApaca.setEnabled(false);
        chbDemonok.setEnabled(false);
    }   
    }//GEN-LAST:event_chbSzerdaItemStateChanged

    private void chbCsutortokItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbCsutortokItemStateChanged
    if (chbCsutortok.isSelected()){
        nap = "csütörtök";
        chbHalalos.setEnabled(true);
        chbOppenheimer.setEnabled(true);
    }else{
        chbHalalos.setEnabled(false);
        chbOppenheimer.setEnabled(false);
    }    
    }//GEN-LAST:event_chbCsutortokItemStateChanged

    private void chbPentekItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbPentekItemStateChanged
    if (chbPentek.isSelected()){
        nap = "péntek";
        chbMenInBlack.setEnabled(true);
        chbSzellemirtok.setEnabled(true);
    }else{
        chbMenInBlack.setEnabled(false);
        chbSzellemirtok.setEnabled(false);
    }    
    }//GEN-LAST:event_chbPentekItemStateChanged

    private void chbSzombatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbSzombatItemStateChanged
    if (chbSzombat.isSelected()){
        nap = "szombat";
        chbCreed.setEnabled(true);
        chbSzemfenyvesztok.setEnabled(true);
    }else{
        chbCreed.setEnabled(false);
        chbSzemfenyvesztok.setEnabled(false);
    }
    }//GEN-LAST:event_chbSzombatItemStateChanged

    private void chbVasarnapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbVasarnapItemStateChanged
    if (chbVasarnap.isSelected()){
        nap = "vasárnap";
        chbBarbie.setEnabled(true);
        chbShrek.setEnabled(true);
        chbApaca.setEnabled(true);
        chbSzellemirtok.setEnabled(true);
    }else{
        chbBarbie.setEnabled(false);
        chbShrek.setEnabled(false);
        chbApaca.setEnabled(false);
        chbSzellemirtok.setEnabled(false);
    }
    }//GEN-LAST:event_chbVasarnapItemStateChanged

    private void spnrDbFelnottStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrDbFelnottStateChanged
    dbFelnott = (int)spnrDbFelnott.getValue();
    jegySzamitas();
    }//GEN-LAST:event_spnrDbFelnottStateChanged

    private void spnrDbGyermekStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrDbGyermekStateChanged
    dbGyermek = (int)spnrDbGyermek.getValue();
    jegySzamitas();
    }//GEN-LAST:event_spnrDbGyermekStateChanged

    private void spnrDbNyugdijjasDiakStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrDbNyugdijjasDiakStateChanged
    dbNyugdijjas = (int)spnrDbNyugdijjasDiak.getValue();
    jegySzamitas();
    }//GEN-LAST:event_spnrDbNyugdijjasDiakStateChanged

    private void rbnGyermekItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnGyermekItemStateChanged
    if (rbnGyermek.isSelected()){
            jegyGyermek = 1000;
        }else{
            jegyGyermek = 0;}
        jegySzamitas();
    }//GEN-LAST:event_rbnGyermekItemStateChanged

    private void rbnNyugdijjasDiakItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnNyugdijjasDiakItemStateChanged
    if (rbnNyugdijjasDiak.isSelected()){
            jegyNyudijjas = 1500;
        }else{
            jegyNyudijjas = 0;}
        jegySzamitas();
    }//GEN-LAST:event_rbnNyugdijjasDiakItemStateChanged

    private void rbnFelnottItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnFelnottItemStateChanged
    if (rbnFelnott.isSelected()){
            jegyFelnott= 2000;
        }else{
            jegyFelnott= 0;
    }
        jegySzamitas();
    }//GEN-LAST:event_rbnFelnottItemStateChanged

    private void btnRendelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRendelesMouseClicked
    if (chbBarbie.isSelected()){
        film = "Barbie";
    }else if(chbMammaMia.isSelected()){
        film = "Mamma Mia!";
    }else if (chbAgymanok.isSelected()){
        film = "Agymanók";
    }else if(chbShrek.isSelected()){
        film = "Shrek";
    }else if (chbApaca.isSelected()){
        film = "Apáca";
    }else if(chbDemonok.isSelected()){
        film = "Démonok között";
    }else if (chbHalalos.isSelected()){
        film = "Halálos iramban";
    }else if(chbOppenheimer.isSelected()){
        film = "Oppenheimer";
    }else if (chbMenInBlack.isSelected()){
        film = "Men in black";
    }else if(chbSzellemirtok.isSelected()){
        film = "Szellemírtók";
    }else if (chbCreed.isSelected()){
        film = "Creed III";
    }else if(chbSzemfenyvesztok.isSelected()){
        film = "Szemfényvesztők";
    }
        
        osszegzes();
    
    }//GEN-LAST:event_btnRendelesMouseClicked

    private void btnMegseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegseMouseClicked
    System.exit(0);     
    }//GEN-LAST:event_btnMegseMouseClicked

    private void cmbVarosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVarosActionPerformed
        int varosIndex = cmbVaros.getSelectedIndex();
        
        if(varosIndex == 0){
            helyszin = "";
        }else if(varosIndex == 1){
            helyszin = "Budapest";
        }else if(varosIndex == 2){
             helyszin = "Győr";
        }else if(varosIndex == 3){
             helyszin = "Tihany";
        }else if(varosIndex == 4){
             helyszin = "Velence";
        }
    }//GEN-LAST:event_cmbVarosActionPerformed
    private void jegySzamitas() {
        vegsoAr = jegyek;
        jegyek = (jegyFelnott *dbFelnott) + (jegyGyermek * dbGyermek) + (jegyNyudijjas * dbNyugdijjas);
        
        lblVegosszeg.setText(jegyek + "");
    }
    private void osszegzes(){
        osszegzesKiiras = "-Az előadás helyszine: "+helyszin+System.lineSeparator()+"-Az előadás napja: "+nap+System.lineSeparator()+"-Kiválasztott film: "+film+System.lineSeparator()+"-Jegyek:"+System.lineSeparator()+felnott+"("+dbFelnott+"db)"+System.lineSeparator()+gyermek+"("+dbGyermek+"db)"+System.lineSeparator()+nyugdijjas+"("+dbNyugdijjas+"db)";
        
        txaOsszesito.setText(osszegzesKiiras);
    }
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(MoziJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoziJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoziJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoziJegy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoziJegy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnRendeles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chbAgymanok;
    private javax.swing.JCheckBox chbApaca;
    private javax.swing.JCheckBox chbBarbie;
    private javax.swing.JCheckBox chbCreed;
    private javax.swing.JCheckBox chbCsutortok;
    private javax.swing.JCheckBox chbDemonok;
    private javax.swing.JCheckBox chbHalalos;
    private javax.swing.JCheckBox chbHetfo;
    private javax.swing.JCheckBox chbKedd;
    private javax.swing.JCheckBox chbMammaMia;
    private javax.swing.JCheckBox chbMenInBlack;
    private javax.swing.JCheckBox chbOppenheimer;
    private javax.swing.JCheckBox chbPentek;
    private javax.swing.JCheckBox chbShrek;
    private javax.swing.JCheckBox chbSzellemirtok;
    private javax.swing.JCheckBox chbSzemfenyvesztok;
    private javax.swing.JCheckBox chbSzerda;
    private javax.swing.JCheckBox chbSzombat;
    private javax.swing.JCheckBox chbVasarnap;
    private javax.swing.JComboBox<String> cmbVaros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVegosszeg;
    private javax.swing.JRadioButton rbnFelnott;
    private javax.swing.JRadioButton rbnGyermek;
    private javax.swing.JRadioButton rbnNyugdijjasDiak;
    private javax.swing.JSpinner spnrDbFelnott;
    private javax.swing.JSpinner spnrDbGyermek;
    private javax.swing.JSpinner spnrDbNyugdijjasDiak;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables
}
