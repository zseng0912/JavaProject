/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class CustomCalendarPanel extends JPanel {

    private JLabel monthLabel;
    private JPanel calendarPanel;
    private JLabel timeLabel;
    private SimpleDateFormat monthFormat;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;
    private Calendar calendar;

    public CustomCalendarPanel() {
        setPreferredSize(new Dimension(250, 220));
        setBackground(new Color(238, 238, 238));
        setLayout(new BorderLayout());

        monthFormat = new SimpleDateFormat("MMMM yyyy");
        dateFormat = new SimpleDateFormat("d");
        timeFormat = new SimpleDateFormat("HH:mm:ss");

        calendar = Calendar.getInstance();

        monthLabel = new JLabel(monthFormat.format(calendar.getTime()));
        monthLabel.setFont(new Font("Arial", Font.BOLD, 16));
        monthLabel.setHorizontalAlignment(SwingConstants.CENTER);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        calendarPanel = new JPanel(new GridLayout(0, 7, 10, 10));
        calendarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        updateCalendar();

//        add(monthLabel, BorderLayout.NORTH);
//        add(timeLabel, BorderLayout.CENTER);
        add(calendarPanel, BorderLayout.CENTER);

//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                updateTime();
//            }
//        });
//        timer.start();
    }

    private void updateCalendar() {
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendarPanel.removeAll();

        // Add weekday labels
        String[] weekdays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String weekday : weekdays) {
            JLabel weekdayLabel = new JLabel(weekday, SwingConstants.CENTER);
            weekdayLabel.setFont(new Font("Arial", Font.BOLD, 12));
            weekdayLabel.setOpaque(true);
            weekdayLabel.setBackground(new Color(0,153,204));
            weekdayLabel.setForeground(Color.WHITE);
            calendarPanel.add(weekdayLabel);
        }

        int month = calendar.get(Calendar.MONTH);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the current date
        Calendar currentDate = Calendar.getInstance();
        int currentMonth = currentDate.get(Calendar.MONTH);
        int currentYear = currentDate.get(Calendar.YEAR);

        // Set the calendar to the first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the starting day of the week (Sunday = 1, Monday = 2, etc.)
        int startingDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Adjust the calendar to the start of the current week
        int daysToSubtract = startingDayOfWeek - Calendar.SUNDAY;
        if (daysToSubtract < 0) {
            daysToSubtract += 7;
        }
        calendar.add(Calendar.DAY_OF_MONTH, -daysToSubtract);

        // Add day labels for the current month
        for (int i = 1; i <= 42; i++) {
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            JLabel dayLabel = new JLabel(Integer.toString(day), SwingConstants.CENTER);
            dayLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            dayLabel.setOpaque(true);
            dayLabel.setBackground(new Color(238, 238, 238));

            if (calendar.get(Calendar.MONTH) == currentMonth && calendar.get(Calendar.YEAR) == currentYear) {
                if (day == currentDate.get(Calendar.DAY_OF_MONTH)) {
                    dayLabel.setBackground(new Color(0,153,204));
                    dayLabel.setForeground(Color.WHITE);
                } else {
                    dayLabel.setBackground(new Color(238, 238, 238));
                    dayLabel.setForeground(Color.BLACK);
                }
            } else {
                dayLabel.setBackground(new Color(198,196,201));
                dayLabel.setForeground(Color.DARK_GRAY);
            }

            calendarPanel.add(dayLabel);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        monthLabel.setText(monthFormat.format(calendar.getTime()));
        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

//    private void updateTime() {
//        timeLabel.setText(timeFormat.format(Calendar.getInstance().getTime()));
//    }
}
