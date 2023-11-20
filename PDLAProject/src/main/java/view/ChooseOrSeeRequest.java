package view;

import controllers.NewUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ChooseOrSeeRequest {

    ChooseOrSeeRequest(String idVolunteer){

        NewFrame ChooseFrame = new NewFrame();

        JPanel logoutPanel = new JPanel();
        JButton LogoutButton = new JButton("Log Out");
        LogoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform logout actions, e.g., close the current frame and open the login frame
                ChooseFrame.dispose();
                WelcomePage welcomePage = new WelcomePage();
            }
        });
        logoutPanel.add(LogoutButton);

        JLabel MessageLabel = new JLabel("What do you want to do? ");

        JButton ChooseButton = new JButton("Choose an available mission.");
        ChooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                       AvailableRequests chooseRequest = new AvailableRequests(idVolunteer);
                        ChooseFrame.dispose();
                    }
        });

        JButton SeeButton = new JButton("See taken requests.");
        SeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TakenRequests takenRequest = new TakenRequests(idVolunteer);
                ChooseFrame.dispose();
            }
        });

        //add everything to the frame
        ChooseFrame.setLayout(new GridLayout(4, 1));
        ChooseFrame.add(logoutPanel);
        ChooseFrame.add(MessageLabel);
        ChooseFrame.add(ChooseButton);
        ChooseFrame.add(SeeButton);
    }
}

