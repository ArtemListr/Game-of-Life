import javax.swing.*;
import java.awt.*;

//класс самой клетки
public class Cell extends JPanel {

    // конструктор клетки
    public Cell(int x, int y){
        super();
        //размер и положение клетки
        setBounds(x*Config.SIZE,y*Config.SIZE, Config.SIZE, Config.SIZE);
        //цвет клетки
        setBackground(Color.BLUE);
    }
}
