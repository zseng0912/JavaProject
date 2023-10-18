/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Hotel_System;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author USER
 */
public class Booking extends javax.swing.JInternalFrame {

    private JButton selectedRoomButton; // Stores the currently selected room button
    private JDateChooser checkOutDateChooser;

    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        checkOutDateChooser = new JDateChooser();

        ActionListener roomButtonClickListener = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                selectedRoomButton = (JButton) evt.getSource();

                showRoomDetails(selectedRoomButton.getText(), checkInDateChooser.getDate(), checkOutDateChooser.getDate());
            }
        };

//         Set the same ActionListener for all the buttons
        Room001.addActionListener(roomButtonClickListener);
        Room002.addActionListener(roomButtonClickListener);
        Room003.addActionListener(roomButtonClickListener);
        Room004.addActionListener(roomButtonClickListener);
        Room005.addActionListener(roomButtonClickListener);
        Room006.addActionListener(roomButtonClickListener);
        Room007.addActionListener(roomButtonClickListener);
        Room008.addActionListener(roomButtonClickListener);
        Room009.addActionListener(roomButtonClickListener);
        Room010.addActionListener(roomButtonClickListener);
        Room011.addActionListener(roomButtonClickListener);
        Room012.addActionListener(roomButtonClickListener);
        Room013.addActionListener(roomButtonClickListener);
        Room014.addActionListener(roomButtonClickListener);
        Room015.addActionListener(roomButtonClickListener);
        Room016.addActionListener(roomButtonClickListener);
        Room017.addActionListener(roomButtonClickListener);
        Room018.addActionListener(roomButtonClickListener);
        Room019.addActionListener(roomButtonClickListener);
        Room020.addActionListener(roomButtonClickListener);
    }

//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomButtons = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        Date = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkInDateChooser = new com.toedter.calendar.JDateChooser();
        FirstFloor = new javax.swing.JPanel();
        Room001 = new javax.swing.JButton();
        Room002 = new javax.swing.JButton();
        Room003 = new javax.swing.JButton();
        Room004 = new javax.swing.JButton();
        Room005 = new javax.swing.JButton();
        Room006 = new javax.swing.JButton();
        Room007 = new javax.swing.JButton();
        Room008 = new javax.swing.JButton();
        Room009 = new javax.swing.JButton();
        Room010 = new javax.swing.JButton();
        SecondFloor = new javax.swing.JPanel();
        Room011 = new javax.swing.JButton();
        Room012 = new javax.swing.JButton();
        Room013 = new javax.swing.JButton();
        Room014 = new javax.swing.JButton();
        Room015 = new javax.swing.JButton();
        Room016 = new javax.swing.JButton();
        Room017 = new javax.swing.JButton();
        Room018 = new javax.swing.JButton();
        Room019 = new javax.swing.JButton();
        Room020 = new javax.swing.JButton();
        Description = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkAvailability = new javax.swing.JButton();
        floortwoLabel1 = new javax.swing.JLabel();
        floortwoLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setInheritsPopupMenu(true);

        background.setBackground(new java.awt.Color(238, 238, 238));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date.setBackground(new java.awt.Color(238, 238, 238));
        Date.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Date:");
        Date.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 46, -1));

        checkInDateChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Date.add(checkInDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        background.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 19, 250, 44));

        FirstFloor.setBackground(new java.awt.Color(238, 238, 238));
        FirstFloor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Room001.setBackground(new java.awt.Color(238, 238, 238));
        Room001.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room001.setText("001");
        Room001.setBorder(null);
        roomButtons.add(Room001);
        Room001.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room001.setIconTextGap(-12);
        Room001.setMinimumSize(new java.awt.Dimension(80, 25));
        Room001.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Room001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room001ActionPerformed(evt);
            }
        });
        FirstFloor.add(Room001, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, 58, -1));

        Room002.setBackground(new java.awt.Color(238, 238, 238));
        Room002.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room002.setText("002");
        Room002.setBorder(null);
        roomButtons.add(Room002);
        Room002.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room002.setIconTextGap(-12);
        Room002.setMinimumSize(new java.awt.Dimension(80, 25));
        Room002.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room002, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 6, 58, -1));

        Room003.setBackground(new java.awt.Color(238, 238, 238));
        Room003.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room003.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room003.setText("003");
        Room003.setBorder(null);
        roomButtons.add(Room003);
        Room003.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room003.setIconTextGap(-12);
        Room003.setMinimumSize(new java.awt.Dimension(80, 25));
        Room003.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room003, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 6, 58, -1));

        Room004.setBackground(new java.awt.Color(238, 238, 238));
        Room004.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room004.setText("004");
        Room004.setBorder(null);
        roomButtons.add(Room004);
        Room004.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room004.setIconTextGap(-12);
        Room004.setMinimumSize(new java.awt.Dimension(80, 25));
        Room004.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room004, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 6, 58, -1));

        Room005.setBackground(new java.awt.Color(238, 238, 238));
        Room005.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room005.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room005.setText("005");
        Room005.setBorder(null);
        roomButtons.add(Room005);
        Room005.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room005.setIconTextGap(-12);
        Room005.setMinimumSize(new java.awt.Dimension(80, 25));
        Room005.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room005, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 6, 58, -1));

        Room006.setBackground(new java.awt.Color(238, 238, 238));
        Room006.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room006.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room006.setText("006");
        Room006.setBorder(null);
        roomButtons.add(Room006);
        Room006.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room006.setIconTextGap(-12);
        Room006.setMinimumSize(new java.awt.Dimension(80, 25));
        Room006.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room006, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 6, 58, -1));

        Room007.setBackground(new java.awt.Color(238, 238, 238));
        Room007.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room007.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room007.setText("007");
        Room007.setBorder(null);
        roomButtons.add(Room007);
        Room007.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room007.setIconTextGap(-12);
        Room007.setMinimumSize(new java.awt.Dimension(80, 25));
        Room007.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room007, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 6, 58, -1));

        Room008.setBackground(new java.awt.Color(238, 238, 238));
        Room008.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room008.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room008.setText("008");
        Room008.setBorder(null);
        roomButtons.add(Room008);
        Room008.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room008.setIconTextGap(-12);
        Room008.setMinimumSize(new java.awt.Dimension(80, 25));
        Room008.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room008, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 6, 58, -1));

        Room009.setBackground(new java.awt.Color(238, 238, 238));
        Room009.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room009.setText("009");
        Room009.setBorder(null);
        roomButtons.add(Room009);
        Room009.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room009.setIconTextGap(-12);
        Room009.setMinimumSize(new java.awt.Dimension(80, 25));
        Room009.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room009, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 6, 58, -1));

        Room010.setBackground(new java.awt.Color(238, 238, 238));
        Room010.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room010.setText("010");
        Room010.setBorder(null);
        roomButtons.add(Room010);
        Room010.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room010.setIconTextGap(-12);
        Room010.setMinimumSize(new java.awt.Dimension(80, 25));
        Room010.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FirstFloor.add(Room010, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 6, 58, -1));

        background.add(FirstFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 690, 120));

        SecondFloor.setBackground(new java.awt.Color(238, 238, 238));
        SecondFloor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Room011.setBackground(new java.awt.Color(238, 238, 238));
        Room011.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room011.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room011.setText("011");
        Room011.setBorder(null);
        roomButtons.add(Room011);
        Room011.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room011.setIconTextGap(-5);
        Room011.setMinimumSize(new java.awt.Dimension(80, 25));
        Room011.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room011, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 58, 110));

        Room012.setBackground(new java.awt.Color(238, 238, 238));
        Room012.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room012.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room012.setText("012");
        Room012.setBorder(null);
        roomButtons.add(Room012);
        Room012.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room012.setIconTextGap(-5);
        Room012.setMinimumSize(new java.awt.Dimension(80, 25));
        Room012.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room012, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 6, 58, 110));

        Room013.setBackground(new java.awt.Color(238, 238, 238));
        Room013.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room013.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room013.setText("013");
        Room013.setBorder(null);
        roomButtons.add(Room013);
        Room013.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room013.setIconTextGap(-5);
        Room013.setMinimumSize(new java.awt.Dimension(80, 25));
        Room013.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room013, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 58, 110));

        Room014.setBackground(new java.awt.Color(238, 238, 238));
        Room014.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room014.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room014.setText("014");
        Room014.setBorder(null);
        roomButtons.add(Room014);
        Room014.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room014.setIconTextGap(-5);
        Room014.setMinimumSize(new java.awt.Dimension(80, 25));
        Room014.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room014, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 6, 58, 110));

        Room015.setBackground(new java.awt.Color(238, 238, 238));
        Room015.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room015.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room015.setText("015");
        Room015.setBorder(null);
        roomButtons.add(Room015);
        Room015.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room015.setIconTextGap(-5);
        Room015.setMinimumSize(new java.awt.Dimension(80, 25));
        Room015.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room015, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 6, 58, 110));

        Room016.setBackground(new java.awt.Color(238, 238, 238));
        Room016.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room016.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room016.setText("016");
        Room016.setBorder(null);
        roomButtons.add(Room016);
        Room016.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room016.setIconTextGap(-5);
        Room016.setMinimumSize(new java.awt.Dimension(80, 25));
        Room016.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room016, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 6, 58, 110));

        Room017.setBackground(new java.awt.Color(238, 238, 238));
        Room017.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room017.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room017.setText("017");
        Room017.setBorder(null);
        roomButtons.add(Room017);
        Room017.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room017.setIconTextGap(-5);
        Room017.setMinimumSize(new java.awt.Dimension(80, 25));
        Room017.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room017, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 6, 58, 110));

        Room018.setBackground(new java.awt.Color(238, 238, 238));
        Room018.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room018.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room018.setText("018");
        Room018.setBorder(null);
        roomButtons.add(Room018);
        Room018.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room018.setIconTextGap(-5);
        Room018.setMinimumSize(new java.awt.Dimension(80, 25));
        Room018.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room018, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 6, 58, 110));

        Room019.setBackground(new java.awt.Color(238, 238, 238));
        Room019.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room019.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room019.setText("019");
        Room019.setBorder(null);
        roomButtons.add(Room019);
        Room019.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room019.setIconTextGap(-5);
        Room019.setMinimumSize(new java.awt.Dimension(80, 25));
        Room019.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room019, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 6, 58, 110));

        Room020.setBackground(new java.awt.Color(238, 238, 238));
        Room020.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Room020.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door.png"))); // NOI18N
        Room020.setText("020");
        Room020.setBorder(null);
        roomButtons.add(Room020);
        Room020.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Room020.setIconTextGap(-5);
        Room020.setMinimumSize(new java.awt.Dimension(80, 25));
        Room020.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SecondFloor.add(Room020, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 6, 58, 110));

        background.add(SecondFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 690, 130));

        Description.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("1st Floor:");
        jLabel2.setIconTextGap(-15);
        Description.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 67, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("2nd Floor:");
        jLabel3.setIconTextGap(-15);
        Description.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, -1, 39));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("ROOM DETAILS:");
        Description.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Single Beds Icon.png"))); // NOI18N
        jLabel5.setText("2 x Single Beds");
        jLabel5.setIconTextGap(-20);
        Description.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 230, 51));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Queen Bed Icon.png"))); // NOI18N
        jLabel6.setText("1 x Queen Bed");
        jLabel6.setIconTextGap(8);
        Description.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 170, 42));

        background.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 350, 140));

        checkAvailability.setBackground(new java.awt.Color(0, 153, 204));
        checkAvailability.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        checkAvailability.setForeground(new java.awt.Color(255, 255, 255));
        checkAvailability.setText("Check Available");
        checkAvailability.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvailabilityActionPerformed(evt);
            }
        });
        background.add(checkAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, 30));

        floortwoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        floortwoLabel1.setForeground(new java.awt.Color(0, 153, 204));
        floortwoLabel1.setText("2nd Floor:");
        background.add(floortwoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        floortwoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        floortwoLabel.setForeground(new java.awt.Color(0, 153, 204));
        floortwoLabel.setText("1st Floor:");
        background.add(floortwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvailabilityActionPerformed
        if (checkInDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select a check-in date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        checkAvailability();
    }//GEN-LAST:event_checkAvailabilityActionPerformed

    private void Room001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room001ActionPerformed
//        CustInfo custInfo = new CustInfo(); // Initialize the CustInfo instance
//        custInfo.showRoomDetails();// Call showRoomDetails method when button is clicked
    }//GEN-LAST:event_Room001ActionPerformed

    private void showRoomDetails(String roomNumber, Date checkInDate, Date checkOutDate) {
        JFrame roomDetailsFrame = new JFrame("Room Details - " + roomNumber);
        roomDetailsFrame.setLayout(new GridLayout(8, 4));
        roomDetailsFrame.getContentPane().setBackground(Color.LIGHT_GRAY); // Set background color
        roomDetailsFrame.getContentPane().setLayout(new BorderLayout());

        // Customer Information label
        JLabel customerInfoLabel = new JLabel("Customer Information");
        customerInfoLabel.setHorizontalAlignment(JLabel.CENTER);
        customerInfoLabel.setFont(new Font("Arial", Font.BOLD, 25));
        roomDetailsFrame.add(customerInfoLabel);
        roomDetailsFrame.add(new JLabel()); // Empty label for spacing
        roomDetailsFrame.add(new JLabel()); // Empty label for spacing
        roomDetailsFrame.add(new JLabel()); // Empty label for spacing
        roomDetailsFrame.add(customerInfoLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(8, 4));
        Font baseFont = new Font("Arial", Font.PLAIN, 12);
        Font boldItalicFont = baseFont.deriveFont(Font.BOLD | Font.ITALIC);
        // Room number
        JLabel roomNumberLabel = new JLabel("\tRoom Number:");
        JLabel roomNumberValue = new JLabel(roomNumber);
        roomDetailsFrame.add(roomNumberLabel);
        roomDetailsFrame.add(roomNumberValue);

        // Check-in date
        JLabel checkInDateLabel = new JLabel("Check-In Date:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        JLabel checkInDateValue = new JLabel(dateFormat.format(checkInDate));
        roomDetailsFrame.add(checkInDateLabel);
        roomDetailsFrame.add(checkInDateValue);

        // Customer name
        JLabel customerNameLabel = new JLabel("Customer Name:");
        JTextField customerNameField = new JTextField();
        roomDetailsFrame.add(customerNameLabel);
        roomDetailsFrame.add(customerNameField);

        // IC number
        JLabel icLabel = new JLabel("I/C Number:");
        JTextField icNumberField = new JTextField();
        roomDetailsFrame.add(icLabel);
        roomDetailsFrame.add(icNumberField);

        // Contact number
        JLabel contactNumberLabel = new JLabel("Contact Number:");
        JTextField contactNumberField = new JTextField();
        roomDetailsFrame.add(contactNumberLabel);
        roomDetailsFrame.add(contactNumberField);

        // Email address
        JLabel emailAddressLabel = new JLabel("Email Address:");
        JTextField emailAddressField = new JTextField();
        roomDetailsFrame.add(emailAddressLabel);
        roomDetailsFrame.add(emailAddressField);

        // Check-out date
        JLabel checkOutDateLabel = new JLabel("Check-Out Date:");
        checkOutDateChooser = new JDateChooser();
        roomDetailsFrame.add(checkOutDateLabel);
        roomDetailsFrame.add(checkOutDateChooser);

        //Set the text field border
        customerNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icNumberField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contactNumberField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emailAddressField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        checkOutDateChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        // Set the font for the labels
        roomNumberLabel.setFont(boldItalicFont);
        checkInDateLabel.setFont(boldItalicFont);
        customerNameLabel.setFont(boldItalicFont);
        icLabel.setFont(boldItalicFont);
        contactNumberLabel.setFont(boldItalicFont);
        emailAddressLabel.setFont(boldItalicFont);
        checkOutDateLabel.setFont(boldItalicFont);

        // Add the components to the form panel
        formPanel.add(roomNumberLabel);
        formPanel.add(roomNumberValue);
        formPanel.add(checkInDateLabel);
        formPanel.add(checkInDateValue);
        formPanel.add(customerNameLabel);
        formPanel.add(customerNameField);
        formPanel.add(icLabel);
        formPanel.add(icNumberField);
        formPanel.add(contactNumberLabel);
        formPanel.add(contactNumberField);
        formPanel.add(emailAddressLabel);
        formPanel.add(emailAddressField);
        formPanel.add(checkOutDateLabel);
        formPanel.add(checkOutDateChooser);

        roomDetailsFrame.add(formPanel, BorderLayout.CENTER);

        // Save button
        JButton saveButton = new JButton("Save");
        saveButton.setPreferredSize(new Dimension(180, 30));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered details
                String customerName = customerNameField.getText();
                String icNumber = icNumberField.getText();
                String contactNumber = contactNumberField.getText();
                String emailAddress = emailAddressField.getText();
                Date selectedCheckOutDate = checkOutDateChooser.getDate();

                // Validate text fields
                if (customerName.isEmpty() || icNumber.isEmpty() || contactNumber.isEmpty() || emailAddress.isEmpty()) {
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate check-out date
                if (selectedCheckOutDate == null) {
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Please select a check-out date.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate check-out date is not the same as check-in date
                Date checkInDate = checkInDateChooser.getDate();
                if (selectedCheckOutDate.compareTo(checkInDate) == 0) {
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Check-out date cannot be the same as check-in date.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Save the details to the bookings.txt file
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String checkInDateString = dateFormat.format(checkInDate);
                String checkOutDateString = dateFormat.format(selectedCheckOutDate);
                String bookingDetails = roomNumber + "," + customerName + "," + icNumber + "," + contactNumber + "," + emailAddress + "," + checkInDateString + "," + checkOutDateString;

                // Validate the format of bookingDetails string
                if (!bookingDetails.contains(",")) {
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Invalid booking details format.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String[] parts = bookingDetails.split(",");
                if (parts.length < 7) {
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Invalid booking details format.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String bookedRoom = parts[0];
                String bookedCheckInDate = parts[5];
                String bookedCheckOutDate = parts[6];
                try (PrintWriter writer = new PrintWriter(new FileWriter("bookings.txt", true))) {
                    writer.println(bookingDetails);
                    writer.flush();
                    JOptionPane.showMessageDialog(roomDetailsFrame, "Booked Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // Close the room details frame
                roomDetailsFrame.dispose();
            }
        });

        // Create a panel for the save button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(saveButton);
        roomDetailsFrame.add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and position the room details frame at the center
        roomDetailsFrame.setSize(450, 350);
        roomDetailsFrame.setLocationRelativeTo(null);
        roomDetailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        roomDetailsFrame.setVisible(true);
    }

    private void checkAvailability() {
        // Clear the background color of all buttons
        Enumeration<AbstractButton> allButtons = roomButtons.getElements();
        while (allButtons.hasMoreElements()) {
            AbstractButton button = allButtons.nextElement();
            button.setEnabled(true);
            button.setBackground(new Color(238, 238, 238));
        }

        // Get the selected check-in and check-out dates
        Date checkInDate = checkInDateChooser.getDate();
        Date checkOutDate = checkOutDateChooser.getDate();

        // Create the date format object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Read the bookings from the "bookings.txt" file
        try (BufferedReader reader = new BufferedReader(new FileReader("bookings.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");
                if (parts.length < 7) {
                    continue; // Skip invalid booking details
                }
                String bookedRoom = parts[0];
                String bookedCheckInDate = parts[5];
                String bookedCheckOutDate = parts[6];

                // Parse the booked check-in and check-out dates
                Date bookedCheckIn;
                Date bookedCheckOut;
                try {
                    bookedCheckIn = dateFormat.parse(bookedCheckInDate);
                    bookedCheckOut = dateFormat.parse(bookedCheckOutDate);
                } catch (ParseException e) {
                    continue; // Skip invalid date format
                }

                // Check if the selected check-in date is within the booked period
                if (checkInDate.compareTo(bookedCheckIn) >= 0 && checkInDate.before(bookedCheckOut)) {
                    // Mark the booked room as unavailable (disable the corresponding button)
                    Enumeration<AbstractButton> availableButtons = roomButtons.getElements();
                    while (availableButtons.hasMoreElements()) {
                        AbstractButton button = availableButtons.nextElement();
                        if (button.getText().equals(bookedRoom)) {
                            button.setEnabled(false);
                            button.setBackground(null);  // Change button color to red
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Date;
    private javax.swing.JPanel Description;
    private javax.swing.JPanel FirstFloor;
    private javax.swing.JButton Room001;
    private javax.swing.JButton Room002;
    private javax.swing.JButton Room003;
    private javax.swing.JButton Room004;
    private javax.swing.JButton Room005;
    private javax.swing.JButton Room006;
    private javax.swing.JButton Room007;
    private javax.swing.JButton Room008;
    private javax.swing.JButton Room009;
    private javax.swing.JButton Room010;
    private javax.swing.JButton Room011;
    private javax.swing.JButton Room012;
    private javax.swing.JButton Room013;
    private javax.swing.JButton Room014;
    private javax.swing.JButton Room015;
    private javax.swing.JButton Room016;
    private javax.swing.JButton Room017;
    private javax.swing.JButton Room018;
    private javax.swing.JButton Room019;
    private javax.swing.JButton Room020;
    private javax.swing.JPanel SecondFloor;
    private javax.swing.JPanel background;
    private javax.swing.JButton checkAvailability;
    private com.toedter.calendar.JDateChooser checkInDateChooser;
    private javax.swing.JLabel floortwoLabel;
    private javax.swing.JLabel floortwoLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.ButtonGroup roomButtons;
    // End of variables declaration//GEN-END:variables
}
