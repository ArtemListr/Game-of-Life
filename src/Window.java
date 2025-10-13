import javax.swing.*;

public class Window implements Runnable{

    // поле для рисования
    JFrame frame;
    // двумерная коллекция клеток (поле где они будут жить)
    Cell[][] cells;

    @Override
    public void run(){
        initFrame();
        // инициализация клеток (поля)
        initCells();
    }

    void initFrame(){
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(Config.WIDTH*Config.SIZE, Config.HEIGHT*Config.SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Game of Life");
    }

    // метод инициализации клеток
    void initCells(){
        // создание поля, где клетки будут жить
        cells = new Cell[Config.WIDTH][Config.HEIGHT];
        // заполнение поля клетками
        for (int x = 0; x < Config.WIDTH; x++)
            for (int y = 0; y < Config.HEIGHT; y++)
            {
                // задание новой клетки
                cells[x][y] = new Cell(x,y);
                // ее визуализация на экране
                frame.add(cells[x][y]);
            }


    }
}
