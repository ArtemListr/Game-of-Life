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
        frame.setSize(Config.WIDTH*Config.SIZE, Config.HEIGHT*Config.SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Game of Life");


    }
}
