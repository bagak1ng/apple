package mini;
import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private FirstPage firstPage;
    private SecondPage secondPage;

    private Students[] students = {
            new Students("Jame","Avangar",5),
            new Students("Buster", "Pro",6),
            new Students("Leo", "shashlyk",7),
            new Students("Qikert", "Virtus",8),
            new Students("Neymar","Mibr",9)
    };

    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Students Application");
        setSize(500,500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setPlayers(Students[] students) {
        this.students = students;
    }
}