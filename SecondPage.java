package mini;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {


    private MainFrame parent;
    private JLabel label;
    private JButton back;
    private JTable table;

    public SecondPage(MainFrame parent) {
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("list users");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(100,150);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
        table = new JTable();
        table.setFont(new Font("Times", Font.PLAIN, 12));
        table.setRowHeight(30);

        //Создаем панель для прокрутки
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300,200);
        scrollPane.setLocation(100,200);
        add(scrollPane);
    }
}