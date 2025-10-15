import java.util.ArrayList;

public class Cell {
    Status status;
    ArrayList<Cell> near;

    //конструктор клетки
    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

    // добавление в список соседней ячейки
    void addNear(Cell cell){
        near.add(cell);
    }


    void step1(){
        int around = countNearCells();
        status = status.step1(around);
    }

    void step2(){
        status = status.step2();
    }

    // Подсчет количества соседних ячеек
    int countNearCells(){
        int count = 0;
        for (Cell cell : near) // еcть ли клетки по соседству
            if (cell.status.isCell())
                count ++; //счет клеток по соседству
        return count;
    }

    void turn(){
        for (Cell cell : near)
            cell.status = cell.status.isCell()? Status.NONE : Status.Live;
    }
}
