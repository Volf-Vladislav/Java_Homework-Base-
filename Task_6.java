import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Главный класс
public class Task_6 {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
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


    void start() {
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

    boolean stop() {
        System.out.println("Car was stopped");
        startStop = false;
        return startStop;
    }
    boolean isGoes() {
        if ((fuel > 1)&&(startStop)) {
            System.out.println("Car in motion");
            return false;
        }
        else {
            System.out.println("Car not in motion");
            return true;
        }

    }
    void refuel() {
        System.out.println("Car is full");
        fuel = 10;
    }
    int getFuelLevel() {
        System.out.println("Fuel level is = " + fuel);
        return fuel;
    }

}

class Lorry extends Car {
    void start() {
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