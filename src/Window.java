import javax.swing.*;

public class Window implements Runnable{

    // поле для рисования
    JFrame frame;

    @Override
    public void run(){
        initFrame();
    }

    void initFrame(){
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(300,200);
        frame.getDefaultCloseOperation();
        frame.setVisible(true);
        frame.setTitle("Game of Life");


    }
}
