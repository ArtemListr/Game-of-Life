import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//класс ячейки для клетки
public class Box extends JPanel {

    Cell cell;

    // конструктор ячейки
    public Box(int x, int y){
        super();
        cell = new Cell();
        //размер и положение ячейки
        setBounds(x*Config.SIZE,y*Config.SIZE, Config.SIZE, Config.SIZE);
        //цвет ячейки
        setBackground(Config.getColor(Status.NONE));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cell.turn();
            }
        });
    }

    public void setColor(){
        setBackground(Config.getColor(cell.status));
    }

    void step1(){
        cell.step1();
        setColor();
    }

    void step2(){
        cell.step2();
        setColor();
    }

}
