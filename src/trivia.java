import com.google.gson.Gson;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.jsoup.Jsoup;

/**
 *
 * @author NK
 */
public class trivia extends javax.swing.JFrame {

    public trivia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPage = new javax.swing.JPanel();
        startPage = new javax.swing.JPanel();
        submitName = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalQcBox = new javax.swing.JComboBox<>();
        lvlcBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        triviaPage = new javax.swing.JPanel();
        questionL = new javax.swing.JLabel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        scoreL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        pBar = new javax.swing.JProgressBar();
        levelL = new javax.swing.JLabel();
        endPage = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        endScore = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        scorePage = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        anyta = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        easyta = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medta = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hardta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPage.setLayout(new java.awt.CardLayout());

        submitName.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N
        submitName.setText("Start");
        submitName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("orange juice", 0, 80)); // NOI18N
        jLabel3.setText("Trivia !");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        totalQcBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20" }));

        lvlcBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Easy", "Medium", "Hard" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Amount of questions");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Difficulty");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("The Timer is 10 seconds.");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlcBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalQcBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lvlcBox, totalQcBox});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalQcBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlcBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lvlcBox, totalQcBox});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        inputName.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout startPageLayout = new javax.swing.GroupLayout(startPage);
        startPage.setLayout(startPageLayout);
        startPageLayout.setHorizontalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(submitName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel3)))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        startPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        startPageLayout.setVerticalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(submitName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        mainPage.add(startPage, "card2");

        questionL.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N
        questionL.setText("Question");

        a1.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        a1.setText("answers");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        a2.setText("answers");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        a3.setText("answers");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        a4.setText("answers");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        scoreL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreL.setText("Score: 0");

        nameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameL.setText("Player");

        pBar.setMaximum(10);
        pBar.setValue(10);

        levelL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        levelL.setText("Difficulty: ");

        javax.swing.GroupLayout triviaPageLayout = new javax.swing.GroupLayout(triviaPage);
        triviaPage.setLayout(triviaPageLayout);
        triviaPageLayout.setHorizontalGroup(
            triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                        .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                            .addComponent(questionL, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                        .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(triviaPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nameL)
                .addGap(116, 116, 116)
                .addComponent(levelL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreL, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        triviaPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {a1, a2, a3, a4});

        triviaPageLayout.setVerticalGroup(
            triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triviaPageLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(scoreL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelL))
                .addGap(37, 37, 37)
                .addComponent(questionL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        mainPage.add(triviaPage, "card3");

        jButton1.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your score is", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palanquin", 0, 50))); // NOI18N

        endScore.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        endScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endScore.setText("SSCCCOOORRREE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(endScore, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(endScore, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        jButton2.setText("High Score");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endPageLayout = new javax.swing.GroupLayout(endPage);
        endPage.setLayout(endPageLayout);
        endPageLayout.setHorizontalGroup(
            endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endPageLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(endPageLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        endPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        endPageLayout.setVerticalGroup(
            endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endPageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(47, 47, 47))
        );

        endPageLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        mainPage.add(endPage, "card4");

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        anyta.setColumns(20);
        anyta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        anyta.setRows(5);
        jScrollPane4.setViewportView(anyta);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Any", jPanel9);

        easyta.setColumns(20);
        easyta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        easyta.setRows(5);
        jScrollPane3.setViewportView(easyta);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Easy", jPanel10);

        medta.setColumns(20);
        medta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        medta.setRows(5);
        jScrollPane2.setViewportView(medta);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Medium", jPanel11);

        hardta.setColumns(20);
        hardta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        hardta.setRows(5);
        jScrollPane1.setViewportView(hardta);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Hard", jPanel12);

        jLabel5.setFont(new java.awt.Font("orange juice", 0, 50)); // NOI18N
        jLabel5.setText("High Score");

        jButton3.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scorePageLayout = new javax.swing.GroupLayout(scorePage);
        scorePage.setLayout(scorePageLayout);
        scorePageLayout.setHorizontalGroup(
            scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(scorePageLayout.createSequentialGroup()
                .addGroup(scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scorePageLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel5))
                    .addGroup(scorePageLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scorePageLayout.setVerticalGroup(
            scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePageLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mainPage.add(scorePage, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitNameActionPerformed
        // TODO add your handling code here:
        numQ = 0;
        score = 0;
        scoreL.setText("Score: "+String.valueOf(score));
        
        if (inputName.getText().isEmpty()){
            JOptionPane.showMessageDialog( null, "Please input your name", "Error", JOptionPane.ERROR_MESSAGE); return;
        }
        
        if (inputName.getText().length()>20){
            name = inputName.getText().substring(0,20);
        }else{
            name = inputName.getText();
        }
        nameL.setText("Player: "+name);
        try {
            startQ();
            CardLayout card = (CardLayout)mainPage.getLayout();
            //card.next(mainPage);
            card.show(mainPage,"card3");
            
        } catch (Exception ex) {
            Logger.getLogger(trivia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitNameActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
        checkAnswer(a1);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
        checkAnswer(a2);
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
        checkAnswer(a3);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
        checkAnswer(a4);
    }//GEN-LAST:event_a4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPage.getLayout();
        showScore();
        card.show(mainPage,"card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPage.getLayout();
        showScore();
        card.show(mainPage,"card6");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPage.getLayout();
        card.show(mainPage,"card2");
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /*try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(trivia.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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
            java.util.logging.Logger.getLogger(trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trivia().setVisible(true);
            }
        });
        
    }
    
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read); 

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
    
    static class Page {
        String response_code;
        List<MyResult> results;
    }

    static class MyResult {
        String category;
        String type;
        String difficulty;
        String question;
        String correct_answer;
        String[] incorrect_answers;
    }
    
    static class OutputScore {
        List<OutputMore> easy;
        List<OutputMore> medium;
        List<OutputMore> hard;
        List<OutputMore> any;
        
        public void setMyList(List<OutputMore> easy,List<OutputMore> medium,List<OutputMore> hard,List<OutputMore> any){
            this.easy = easy;
            this.medium = medium;
            this.hard = hard;
            this.any = any;
        }
    }
    
    static class OutputMore {
        String name;
        int score;
        
        public OutputMore(String name, int sscore){
            this.name = name;
            this.score = sscore;
        }
        public static class CompId implements Comparator<OutputMore> {
            @Override
            public int compare(OutputMore arg0, OutputMore arg1) {
                return -1*(arg0.score-arg1.score);
            }
            
            // 0 if = | + if more | - is less | asc
            // *-1 if decs
        }
    }
    
    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }
    
    public void startQ() throws Exception{
        String myUrl;
        int totalQ;
        
        switch(totalQcBox.getSelectedIndex()){
            case 1://10
                totalQ = 10;
                break;
            case 2://20
                totalQ = 20;
                break;
            default:
                totalQ = 5;
                break;
                
        }
        
        switch(lvlcBox.getSelectedIndex()){
            case 1: //easy
                myUrl = "https://www.opentdb.com/api.php?amount="+totalQ+"&difficulty=easy";;
                break;
            case 2: // med
                myUrl = "https://www.opentdb.com/api.php?amount="+totalQ+"&difficulty=medium";
                break;
            case 3: //hard
                myUrl = "https://www.opentdb.com/api.php?amount="+totalQ+"&difficulty=hard";
                break;
            default: //any
                myUrl = "https://www.opentdb.com/api.php?amount="+totalQ;
                break;    
        }
        levelL.setText("Difficulty: "+lvlcBox.getSelectedItem());
        String json = readUrl(myUrl);
        Gson gson = new Gson();
        Page page = gson.fromJson(json, Page.class);
        myList = new ArrayList<>(page.results);
        setQ();
        for( ActionListener x : pBarTimer.getActionListeners() ) {
        pBarTimer.removeActionListener(x);
        }
        pBarTimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            if (pBar.getValue() == pBar.getMinimum()+1){pBarTimer.stop();checkAnswer(null);}
            
            //show pbar value
            pBar.setValue(pBar.getValue()-pBarDecreaseRateInSec);
            }
        });
        pBarTimer.setRepeats(true);
    }
    
    public void setQ(){
        
        pBarTimer.stop();
        if (myList.size() == numQ){
            CardLayout card = (CardLayout)mainPage.getLayout();
            card.show(mainPage,"card4");//show end page
            endScore.setText(String.valueOf(score));
            
            return;
        }// change to end game screen
        
        //show console correct answer
        //System.out.println(myList.get(numQ).correct_answer);//remove this
        
        a1.setForeground(Color.BLACK);
        a2.setForeground(Color.BLACK);
        a3.setForeground(Color.BLACK);
        a4.setForeground(Color.BLACK);
        
        a1.setBackground(Color.WHITE);
        a2.setBackground(Color.WHITE);
        a3.setBackground(Color.WHITE);
        a4.setBackground(Color.WHITE);
        
        a3.setVisible(true);
        a4.setVisible(true);
        
        questionL.setText( "<html>"+myList.get(numQ).question+"</html>" );
            
        if (myList.get(numQ).type.equals("boolean")){
            a3.setVisible(false);
            a4.setVisible(false);
            
            a1.setText("True");
            a2.setText("False");
        }
        else {
            List<String> tempList = new ArrayList<>();
            tempList.add(myList.get(numQ).correct_answer);
            for (int i=0; i<myList.get(numQ).incorrect_answers.length;i++){
                tempList.add(myList.get(numQ).incorrect_answers[i]);
            }
            Collections.shuffle(tempList);
            
            a1.setText( html2text(tempList.get(0)) );
            a2.setText( html2text(tempList.get(1)) );
            a3.setText( html2text(tempList.get(2)) );
            a4.setText( html2text(tempList.get(3)) );
        }
        
        pBar.setMaximum(qTimeInSec);
        pBar.setValue(pBar.getMaximum());
        //pBarTimer.stop();
        pBarTimer.start();
    }
    public void checkAnswer(JButton x){
        //System.out.println(x.getText());
        if (isClick == 1 ){return;}
        isClick = 1;
        
        if ( x!= null){
            x.setForeground(Color.WHITE);
            if (x.getText().equals(html2text(myList.get(numQ).correct_answer)) ){
                score++;
                scoreL.setText("Score: "+String.valueOf(score));
                x.setBackground(Color.GREEN);
            }
            else{
                List<JButton> bList = new ArrayList<>();
                bList.add(a1);bList.add(a2);bList.add(a3);bList.add(a4);
                bList.remove(   bList.indexOf(x)   );

                for (int i=0; i<bList.size();i++){
                    showCorrect(bList.get(i));
                }

                x.setBackground(Color.RED);
            }
        }
        else{
            List<JButton> bList = new ArrayList<>();
            bList.add(a1);bList.add(a2);bList.add(a3);bList.add(a4);
            for (int i=0; i<bList.size();i++){
                    showCorrect(bList.get(i));
            }
        }
                
        pBarTimer.stop();
        numQ++;
        
        //delay before start new question
        Timer timer = new Timer(2000, new ActionListener() {
	@Override
		public void actionPerformed(ActionEvent ae) {                    
                    isClick = 0;
                    setQ();
		}
	});
        timer.setRepeats(false);
        timer.start();
    }
    
    public void showCorrect(JButton x){
        if (x.getText().equals(html2text(myList.get(numQ).correct_answer))){
            x.setForeground(Color.WHITE);
            x.setBackground(Color.GREEN);
        }
    }
    
    public void showScore(){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("score.json"));
            Gson gson = new Gson();
            OutputScore outputscore = gson.fromJson(br, OutputScore.class);
            easyList = new ArrayList<>(outputscore.easy);
            medList = new ArrayList<>(outputscore.medium);
            hardList = new ArrayList<>(outputscore.hard);
            anyList = new ArrayList<>(outputscore.any);
            
            switch(lvlcBox.getSelectedIndex()){
            case 1: //easy
                easyList.add(new OutputMore(name,score));
                Collections.sort(easyList, new OutputMore.CompId());
                break;
            case 2: // med
                medList.add(new OutputMore(name,score));
                Collections.sort(medList, new OutputMore.CompId());
                break;
            case 3: //hard
                hardList.add(new OutputMore(name,score));
                Collections.sort(hardList, new OutputMore.CompId());
                break;
            default: //any
                anyList.add(new OutputMore(name,score));
                Collections.sort(anyList, new OutputMore.CompId());
                break;    
            }
            
            easyta.setText("");
            medta.setText("");
            hardta.setText("");
            anyta.setText("");
            
            for(int i=0; i<easyList.size();i++){
                
                easyta.append(  String.format("%-26s %d", easyList.get(i).name, easyList.get(i).score)  +"\n"  );
            }
            
            for(int i=0; i<medList.size();i++){
                medta.append(   String.format("%-26s %d", medList.get(i).name, medList.get(i).score)  +"\n"  );
            }
            
            for(int i=0; i<hardList.size();i++){
                hardta.append(     String.format("%-26s %d", hardList.get(i).name, hardList.get(i).score)+"\n" );
            }
            
            for(int i=0; i<anyList.size();i++){
                anyta.append(   String.format("%-26s %d", anyList.get(i).name, anyList.get(i).score)+"\n"  );
            }
            
            outputscore.easy = easyList;
            outputscore.medium = medList;
            outputscore.hard = hardList;
            outputscore.any = anyList;
            /*
            outputscore.setMyList(easyList, medList, hardList, anyList);*/
            String outjson = gson.toJson(outputscore);  
            
            FileWriter writer;
            try {
                writer = new FileWriter("score.json");
                writer.write(outjson);
                writer.close(); 
            } catch (IOException ex) {
                Logger.getLogger(trivia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(trivia.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JTextArea anyta;
    private javax.swing.JTextArea easyta;
    private javax.swing.JPanel endPage;
    private javax.swing.JLabel endScore;
    private javax.swing.JTextArea hardta;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel levelL;
    private javax.swing.JComboBox<String> lvlcBox;
    private javax.swing.JPanel mainPage;
    private javax.swing.JTextArea medta;
    private javax.swing.JLabel nameL;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel questionL;
    private javax.swing.JLabel scoreL;
    private javax.swing.JPanel scorePage;
    private javax.swing.JPanel startPage;
    private javax.swing.JButton submitName;
    private javax.swing.JComboBox<String> totalQcBox;
    private javax.swing.JPanel triviaPage;
    // End of variables declaration//GEN-END:variables
    int numQ, score, isClick, qTimeInSec = 10, pBarDecreaseRateInSec = 1;
    String name;
    
    List<MyResult> myList;
    List<OutputMore> easyList,medList,hardList, anyList;
    Timer pBarTimer = new Timer(pBarDecreaseRateInSec*1000, null);
    
}