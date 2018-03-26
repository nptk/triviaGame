
import com.google.gson.Gson;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
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
        startButton = new javax.swing.JButton();
        titleButton = new javax.swing.JLabel();
        settingPanel = new javax.swing.JPanel();
        amountQBox = new javax.swing.JComboBox<>();
        lvlBox = new javax.swing.JComboBox<>();
        amountQLabel = new javax.swing.JLabel();
        settingLvlLabel = new javax.swing.JLabel();
        timerNoteLabel = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        triviaPage = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        answer1Button = new javax.swing.JButton();
        answer2Button = new javax.swing.JButton();
        answer3Button = new javax.swing.JButton();
        answer4Button = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        timerBar = new javax.swing.JProgressBar();
        difficultyLabel = new javax.swing.JLabel();
        endPage = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        endScorePanel = new javax.swing.JPanel();
        endScore = new javax.swing.JLabel();
        toHighScoreButton = new javax.swing.JButton();
        scorePage = new javax.swing.JPanel();
        highScoreTabPanel = new javax.swing.JTabbedPane();
        anyScorePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        anyTextArea = new javax.swing.JTextArea();
        easyScorePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        easyTextArea = new javax.swing.JTextArea();
        medScorePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medTextArea = new javax.swing.JTextArea();
        hardScorePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hardTextArea = new javax.swing.JTextArea();
        highScoreTitleLabel = new javax.swing.JLabel();
        highScoreToMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPage.setLayout(new java.awt.CardLayout());

        startButton.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        titleButton.setFont(new java.awt.Font("orange juice", 0, 80)); // NOI18N
        titleButton.setText("Trivia !");

        settingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        amountQBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20" }));

        lvlBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Easy", "Medium", "Hard" }));

        amountQLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        amountQLabel.setText("Amount of questions");

        settingLvlLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        settingLvlLabel.setText("Difficulty");

        timerNoteLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timerNoteLabel.setText("The Timer is 10 seconds.");
        timerNoteLabel.setToolTipText("");

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addComponent(timerNoteLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountQLabel)
                            .addComponent(settingLvlLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountQBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );

        settingPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amountQBox, lvlBox});

        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountQBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountQLabel))
                .addGap(43, 43, 43)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingLvlLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(timerNoteLabel)
                .addGap(33, 33, 33))
        );

        settingPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amountQBox, lvlBox});

        userPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        inputName.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
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
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(settingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(titleButton)))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        startPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {settingPanel, userPanel});

        startPageLayout.setVerticalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleButton)
                .addGap(38, 38, 38)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(settingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        mainPage.add(startPage, "startCard");

        questionLabel.setFont(new java.awt.Font("Palanquin", 0, 18)); // NOI18N
        questionLabel.setText("Question");

        answer1Button.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        answer1Button.setText("answers");
        answer1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ButtonActionPerformed(evt);
            }
        });

        answer2Button.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        answer2Button.setText("answers");
        answer2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ButtonActionPerformed(evt);
            }
        });

        answer3Button.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        answer3Button.setText("answers");
        answer3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ButtonActionPerformed(evt);
            }
        });

        answer4Button.setFont(new java.awt.Font("Palanquin", 0, 16)); // NOI18N
        answer4Button.setText("answers");
        answer4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4ButtonActionPerformed(evt);
            }
        });

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreLabel.setText("Score: 0");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText("Player");

        timerBar.setMaximum(10);
        timerBar.setValue(10);

        difficultyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        difficultyLabel.setText("Difficulty: ");

        javax.swing.GroupLayout triviaPageLayout = new javax.swing.GroupLayout(triviaPage);
        triviaPage.setLayout(triviaPageLayout);
        triviaPageLayout.setHorizontalGroup(
            triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                        .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answer4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                            .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triviaPageLayout.createSequentialGroup()
                        .addComponent(timerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(triviaPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nameLabel)
                .addGap(116, 116, 116)
                .addComponent(difficultyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        triviaPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {answer1Button, answer2Button, answer3Button, answer4Button});

        triviaPageLayout.setVerticalGroup(
            triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triviaPageLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(triviaPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(difficultyLabel))
                .addGap(37, 37, 37)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(answer2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(answer3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(timerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        mainPage.add(triviaPage, "triviaCard");

        menuButton.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        menuButton.setText("Main Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        endScorePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your score is", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palanquin", 0, 50))); // NOI18N

        endScore.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        endScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endScore.setText("SSCCCOOORRREE");

        javax.swing.GroupLayout endScorePanelLayout = new javax.swing.GroupLayout(endScorePanel);
        endScorePanel.setLayout(endScorePanelLayout);
        endScorePanelLayout.setHorizontalGroup(
            endScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endScorePanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(endScore, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        endScorePanelLayout.setVerticalGroup(
            endScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endScorePanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(endScore, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        toHighScoreButton.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        toHighScoreButton.setText("High Score");
        toHighScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHighScoreButtonActionPerformed(evt);
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
                        .addComponent(menuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toHighScoreButton))
                    .addComponent(endScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        endPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {menuButton, toHighScoreButton});

        endPageLayout.setVerticalGroup(
            endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endPageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(endScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuButton)
                    .addComponent(toHighScoreButton))
                .addGap(47, 47, 47))
        );

        endPageLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {menuButton, toHighScoreButton});

        mainPage.add(endPage, "endCard");

        highScoreTabPanel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        anyTextArea.setColumns(20);
        anyTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        anyTextArea.setRows(5);
        jScrollPane4.setViewportView(anyTextArea);

        javax.swing.GroupLayout anyScorePanelLayout = new javax.swing.GroupLayout(anyScorePanel);
        anyScorePanel.setLayout(anyScorePanelLayout);
        anyScorePanelLayout.setHorizontalGroup(
            anyScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        anyScorePanelLayout.setVerticalGroup(
            anyScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        highScoreTabPanel.addTab("Any", anyScorePanel);

        easyTextArea.setColumns(20);
        easyTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        easyTextArea.setRows(5);
        jScrollPane3.setViewportView(easyTextArea);

        javax.swing.GroupLayout easyScorePanelLayout = new javax.swing.GroupLayout(easyScorePanel);
        easyScorePanel.setLayout(easyScorePanelLayout);
        easyScorePanelLayout.setHorizontalGroup(
            easyScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        easyScorePanelLayout.setVerticalGroup(
            easyScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        highScoreTabPanel.addTab("Easy", easyScorePanel);

        medTextArea.setColumns(20);
        medTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        medTextArea.setRows(5);
        jScrollPane2.setViewportView(medTextArea);

        javax.swing.GroupLayout medScorePanelLayout = new javax.swing.GroupLayout(medScorePanel);
        medScorePanel.setLayout(medScorePanelLayout);
        medScorePanelLayout.setHorizontalGroup(
            medScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        medScorePanelLayout.setVerticalGroup(
            medScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        highScoreTabPanel.addTab("Medium", medScorePanel);

        hardTextArea.setColumns(20);
        hardTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        hardTextArea.setRows(5);
        jScrollPane1.setViewportView(hardTextArea);

        javax.swing.GroupLayout hardScorePanelLayout = new javax.swing.GroupLayout(hardScorePanel);
        hardScorePanel.setLayout(hardScorePanelLayout);
        hardScorePanelLayout.setHorizontalGroup(
            hardScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        hardScorePanelLayout.setVerticalGroup(
            hardScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        highScoreTabPanel.addTab("Hard", hardScorePanel);

        highScoreTitleLabel.setFont(new java.awt.Font("orange juice", 0, 50)); // NOI18N
        highScoreTitleLabel.setText("High Score");

        highScoreToMenuButton.setFont(new java.awt.Font("Palanquin", 0, 30)); // NOI18N
        highScoreToMenuButton.setText("Main Menu");
        highScoreToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreToMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scorePageLayout = new javax.swing.GroupLayout(scorePage);
        scorePage.setLayout(scorePageLayout);
        scorePageLayout.setHorizontalGroup(
            scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(highScoreTabPanel)
            .addGroup(scorePageLayout.createSequentialGroup()
                .addGroup(scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scorePageLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(highScoreTitleLabel))
                    .addGroup(scorePageLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(highScoreToMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scorePageLayout.setVerticalGroup(
            scorePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePageLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(highScoreTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(highScoreTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(highScoreToMenuButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mainPage.add(scorePage, "scoreCard");

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

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        numQ = 0;
        score = 0;
        scoreLabel.setText("Score: " + String.valueOf(score));

        if (inputName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input your name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (inputName.getText().length() > 20) {
            name = inputName.getText().substring(0, 20);
        } else {
            name = inputName.getText();
        }
        nameLabel.setText("Player: " + name);
        try {
            startQ();
            CardLayout card = (CardLayout) mainPage.getLayout();
            card.show(mainPage, "triviaCard");

        } catch (Exception ex) {
            Logger.getLogger(trivia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void answer1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ButtonActionPerformed
        checkAnswer(answer1Button);
    }//GEN-LAST:event_answer1ButtonActionPerformed

    private void answer2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ButtonActionPerformed
        checkAnswer(answer2Button);
    }//GEN-LAST:event_answer2ButtonActionPerformed

    private void answer3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ButtonActionPerformed
        checkAnswer(answer3Button);
    }//GEN-LAST:event_answer3ButtonActionPerformed

    private void answer4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4ButtonActionPerformed
        checkAnswer(answer4Button);
    }//GEN-LAST:event_answer4ButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        CardLayout card = (CardLayout) mainPage.getLayout();
        showScore();
        card.show(mainPage, "startCard");
    }//GEN-LAST:event_menuButtonActionPerformed

    private void toHighScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toHighScoreButtonActionPerformed
        CardLayout card = (CardLayout) mainPage.getLayout();
        showScore();
        card.show(mainPage, "scoreCard");
    }//GEN-LAST:event_toHighScoreButtonActionPerformed

    private void highScoreToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreToMenuButtonActionPerformed
        CardLayout card = (CardLayout) mainPage.getLayout();
        card.show(mainPage, "startCard");
    }//GEN-LAST:event_highScoreToMenuButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
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

        public void setMyList(List<OutputMore> easy, List<OutputMore> medium, List<OutputMore> hard, List<OutputMore> any) {
            this.easy = easy;
            this.medium = medium;
            this.hard = hard;
            this.any = any;
        }
    }

    static class OutputMore {
        String name;
        int score;

        public OutputMore(String name, int sscore) {
            this.name = name;
            this.score = sscore;
        }

        public static class CompId implements Comparator<OutputMore> {

            @Override
            public int compare(OutputMore arg0, OutputMore arg1) {
                return -1 * (arg0.score - arg1.score);
            }

            // 0 if = | + if more | - is less | asc
            // *-1 if decs
        }
    }

    public static String html2text(String html) {
        return Jsoup.parse(html).text();
    }

    public void startQ() throws Exception {
        String baseURL = "https://www.opentdb.com/api.php?amount=";
        switch (amountQBox.getSelectedIndex()) {
            case 1://10
                baseURL += 10;
                break;
            case 2://20
                baseURL += 20;
                break;
            default: //5
                baseURL += 5;
                break;
        }

        switch (lvlBox.getSelectedIndex()) {
            case 1: //easy
                baseURL += "&difficulty=easy";
                break;
            case 2: // med
                baseURL = "&difficulty=medium";
                break;
            case 3: //hard
                baseURL = "&difficulty=hard";
                break;
            default: //any
                break;
        }
        difficultyLabel.setText("Difficulty: " + lvlBox.getSelectedItem());

        String json = readUrl(baseURL);
        Gson gson = new Gson();
        Page page = gson.fromJson(json, Page.class);
        myList = new ArrayList<>(page.results);
        setQ();

        pBarTimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (timerBar.getValue() == timerBar.getMinimum() + 1) {
                    pBarTimer.stop();
                    checkAnswer(null);
                }
                //show pbar value
                timerBar.setValue(timerBar.getValue() - pBarDecreaseRateInSec);
            }
        });
        pBarTimer.setRepeats(true);
    }

    public void setQ() {
        pBarTimer.stop();
        if (myList.size() == numQ) {
            CardLayout card = (CardLayout) mainPage.getLayout();
            card.show(mainPage, "endCard");
            endScore.setText(String.valueOf(score));

            return;
        }// change to end game screen

        answer1Button.setForeground(Color.BLACK);
        answer2Button.setForeground(Color.BLACK);
        answer3Button.setForeground(Color.BLACK);
        answer4Button.setForeground(Color.BLACK);

        answer1Button.setBackground(Color.WHITE);
        answer2Button.setBackground(Color.WHITE);
        answer3Button.setBackground(Color.WHITE);
        answer4Button.setBackground(Color.WHITE);

        answer3Button.setVisible(true);
        answer4Button.setVisible(true);

        questionLabel.setText("<html>" + myList.get(numQ).question + "</html>");

        if (myList.get(numQ).type.equals("boolean")) {
            answer3Button.setVisible(false);
            answer4Button.setVisible(false);

            answer1Button.setText("True");
            answer2Button.setText("False");
        } else {
            List<String> tempList = new ArrayList<>();
            tempList.add(myList.get(numQ).correct_answer);
            tempList.addAll(Arrays.asList(myList.get(numQ).incorrect_answers));
            Collections.shuffle(tempList);

            answer1Button.setText(html2text(tempList.get(0)));
            answer2Button.setText(html2text(tempList.get(1)));
            answer3Button.setText(html2text(tempList.get(2)));
            answer4Button.setText(html2text(tempList.get(3)));
        }

        timerBar.setMaximum(questionTimeInSec);
        timerBar.setValue(timerBar.getMaximum());
        pBarTimer.start();
    }

    public void checkAnswer(JButton x) {
        if (isClick == 1) {
            return;
        }
        isClick = 1;

        if (x != null) { //user choose the answer
            x.setForeground(Color.WHITE);
            if (x.getText().equals(html2text(myList.get(numQ).correct_answer))) {
                score++;
                scoreLabel.setText("Score: " + String.valueOf(score));
                x.setBackground(Color.GREEN);
            } else {
                List<JButton> bList = new ArrayList<>();
                bList.add(answer1Button);
                bList.add(answer2Button);
                bList.add(answer3Button);
                bList.add(answer4Button);
                bList.remove(bList.indexOf(x));

                for (int i = 0; i < bList.size(); i++) {
                    showCorrect(bList.get(i));
                }

                x.setBackground(Color.RED);
            }
        } else { // user didnt choose the answer and the time run out
            List<JButton> bList = new ArrayList<>();
            bList.add(answer1Button);
            bList.add(answer2Button);
            bList.add(answer3Button);
            bList.add(answer4Button);
            for (int i = 0; i < bList.size(); i++) {
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

    public void showCorrect(JButton inputButton) {
        if (inputButton.getText().equals(html2text(myList.get(numQ).correct_answer))) {
            inputButton.setForeground(Color.WHITE);
            inputButton.setBackground(Color.GREEN);
        }
    }

    public void writeToFile(String name, String content) throws IOException {
        FileWriter writer;
        writer = new FileWriter(name + ".json");
        writer.write(content);
        writer.close();
    }

    private boolean checkScoreFileExist() {
        return new File("score.json").isFile();
    }

    private void createDefaultScoreFile() throws MalformedURLException, IOException {
        URL url = new URL("https://raw.githubusercontent.com/nptk/triviaGame/master/score.json");
        Scanner scan = new Scanner(url.openStream());
        scan.useDelimiter("\\Z");
        String output = scan.next();
        writeToFile("score", output);
    }

    public void showScore() {
        try {
            if (!checkScoreFileExist()) {
                createDefaultScoreFile();
            }

            BufferedReader br = new BufferedReader(new FileReader("score.json"));

            Gson gson = new Gson();
            OutputScore outputscore = gson.fromJson(br, OutputScore.class);
            easyList = new ArrayList<>(outputscore.easy);
            medList = new ArrayList<>(outputscore.medium);
            hardList = new ArrayList<>(outputscore.hard);
            anyList = new ArrayList<>(outputscore.any);

            switch (lvlBox.getSelectedIndex()) {
                case 1: //easy
                    easyList.add(new OutputMore(name, score));
                    Collections.sort(easyList, new OutputMore.CompId());
                    break;
                case 2: // med
                    medList.add(new OutputMore(name, score));
                    Collections.sort(medList, new OutputMore.CompId());
                    break;
                case 3: //hard
                    hardList.add(new OutputMore(name, score));
                    Collections.sort(hardList, new OutputMore.CompId());
                    break;
                default: //any
                    anyList.add(new OutputMore(name, score));
                    Collections.sort(anyList, new OutputMore.CompId());
                    break;
            }

            easyTextArea.setText("");
            medTextArea.setText("");
            hardTextArea.setText("");
            anyTextArea.setText("");

            for (int i = 0; i < easyList.size(); i++) {
                easyTextArea.append(String.format("%-26s %d", easyList.get(i).name, easyList.get(i).score) + "\n");
            }

            for (int i = 0; i < medList.size(); i++) {
                medTextArea.append(String.format("%-26s %d", medList.get(i).name, medList.get(i).score) + "\n");
            }

            for (int i = 0; i < hardList.size(); i++) {
                hardTextArea.append(String.format("%-26s %d", hardList.get(i).name, hardList.get(i).score) + "\n");
            }

            for (int i = 0; i < anyList.size(); i++) {
                anyTextArea.append(String.format("%-26s %d", anyList.get(i).name, anyList.get(i).score) + "\n");
            }

            outputscore.easy = easyList;
            outputscore.medium = medList;
            outputscore.hard = hardList;
            outputscore.any = anyList;

            String outjson = gson.toJson(outputscore);

            writeToFile("score", outjson);

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> amountQBox;
    private javax.swing.JLabel amountQLabel;
    private javax.swing.JButton answer1Button;
    private javax.swing.JButton answer2Button;
    private javax.swing.JButton answer3Button;
    private javax.swing.JButton answer4Button;
    private javax.swing.JPanel anyScorePanel;
    private javax.swing.JTextArea anyTextArea;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JPanel easyScorePanel;
    private javax.swing.JTextArea easyTextArea;
    private javax.swing.JPanel endPage;
    private javax.swing.JLabel endScore;
    private javax.swing.JPanel endScorePanel;
    private javax.swing.JPanel hardScorePanel;
    private javax.swing.JTextArea hardTextArea;
    private javax.swing.JTabbedPane highScoreTabPanel;
    private javax.swing.JLabel highScoreTitleLabel;
    private javax.swing.JButton highScoreToMenuButton;
    private javax.swing.JTextField inputName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> lvlBox;
    private javax.swing.JPanel mainPage;
    private javax.swing.JPanel medScorePanel;
    private javax.swing.JTextArea medTextArea;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JPanel scorePage;
    private javax.swing.JLabel settingLvlLabel;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startPage;
    private javax.swing.JProgressBar timerBar;
    private javax.swing.JLabel timerNoteLabel;
    private javax.swing.JLabel titleButton;
    private javax.swing.JButton toHighScoreButton;
    private javax.swing.JPanel triviaPage;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
    int numQ, score, isClick;
    static int questionTimeInSec = 10, pBarDecreaseRateInSec = 1;
    
    String name;

    List<MyResult> myList;
    List<OutputMore> easyList, medList, hardList, anyList;
    Timer pBarTimer = new Timer(pBarDecreaseRateInSec * 1000, null);

}
