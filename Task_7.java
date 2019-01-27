package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Главный класс
public class Task_7 {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Lorry car2 = new Lorry();


        JFrame jFrameCar = getFrame();
        JPanel jPanelCar = new JPanel();
        jFrameCar.add(jPanelCar);
        JButton jButtonCar = new JButton("Car");
        jPanelCar.add(jButtonCar);
        jButtonCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = getFrame();
                JPanel jPanel = new JPanel();
                jFrame.add(jPanel);
                JButton jButton = new JButton("Start");
                jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        car.start();
                    }
                });
                JPanel jPanel2 = new JPanel();
                jFrame.add(jPanel2);
                JButton jButton2 = new JButton("Stop");
                jPanel2.add(jButton2);
                jButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        car.stop();
                    }
                });
                JPanel jPanel3 = new JPanel();
                jFrame.add(jPanel3);
                JButton jButton3 = new JButton("Is Goes?");
                jPanel3.add(jButton3);
                jButton3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        car.isGoes();
                    }
                });
                JPanel jPanel4 = new JPanel();
                jFrame.add(jPanel4);
                JButton jButton4 = new JButton("Fuel Level");
                jPanel4.add(jButton4);
                jButton4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        car.getFuelLevel();
                    }
                });
                JPanel jPanel5 = new JPanel();
                jFrame.add(jPanel5);
                JButton jButton5 = new JButton("Refuel");
                jPanel5.add(jButton5);
                jButton5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        car.refuel();
                    }
                });
                jFrameCar.setVisible(false);
            }

        });

        JPanel jPanelLorry = new JPanel();
        jFrameCar.add(jPanelLorry);
        JButton jButtonLorry = new JButton("Lorry");
        jPanelLorry.add(jButtonLorry);
        jButtonCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = getFrame();
                JPanel jPanel = new JPanel();
                jFrame.add(jPanel);
                JButton jButton = new JButton("Start");
                jPanel.add(jButton);
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Lorry.start();
                    }
                });
                JPanel jPanel2 = new JPanel();
                jFrame.add(jPanel2);
                JButton jButton2 = new JButton("Stop");
                jPanel2.add(jButton2);
                jButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Lorry.stop();
                    }
                });
                JPanel jPanel3 = new JPanel();
                jFrame.add(jPanel3);
                JButton jButton3 = new JButton("Is Goes?");
                jPanel3.add(jButton3);
                jButton3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Lorry.isGoes();
                    }
                });
                JPanel jPanel4 = new JPanel();
                jFrame.add(jPanel4);
                JButton jButton4 = new JButton("Fuel Level");
                jPanel4.add(jButton4);
                jButton4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Lorry.getFuelLevel();
                    }
                });
                JPanel jPanel5 = new JPanel();
                jFrame.add(jPanel5);
                JButton jButton5 = new JButton("Refuel");
                jPanel5.add(jButton5);
                jButton5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Lorry.refuel();
                    }
                });
                jFrameCar.setVisible(false);
            }

        });
    }

// Графическая панель

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE    );
        jFrame.setBounds(500, 340, 600, 200);
        jFrame.setTitle("Game control panel");
        jFrame.setLayout(new GridBagLayout());
        return jFrame;

    }
}

// Класс с методами
    class Car {
    static int fuel = 10;
    static int metres = 0;
    static boolean startStop;


    static void start() {
        startStop = true;
        System.out.println("Car started");
        while (fuel > 0 && startStop) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            metres++;
            fuel--;
            System.out.println("Distance traveled: " + metres + " metres");
        }
        startStop = false;
    }

    static boolean stop() {
        System.out.println("Car was stopped");
        startStop = false;
        return startStop;
    }
    static boolean isGoes() {
        if ((fuel > 1)&&(startStop)) {
            System.out.println("Car in motion");
            return false;
        }
        else {
            System.out.println("Car not in motion");
            return true;
        }

    }
    static void refuel() {
        System.out.println("Car is full");
        fuel = 10;
    }
    static int getFuelLevel() {
        System.out.println("Fuel level is = " + fuel);
        return fuel;
    }

}

class Lorry extends Car {
    static void start() {
        startStop = true;
        System.out.println("Car started");
        while (fuel > 0 && startStop) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            metres++;
            fuel -= 2;
            System.out.println("Distance traveled: " + metres + " metres");
        }
        startStop = false;
    }
}