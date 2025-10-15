import java.awt.*;

public class Config {
    public static final int SIZE = 10;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 75;
    public static final int SLEEPMS = 100;

    public static Color getColor(Status status){
        switch (status){

            case NONE: return Color.BLACK;
            case Born: return Color.GRAY;
            case Live: return Color.WHITE;
            case Died: return Color.PINK;
            default: return Color.GREEN;
        }
    }
}
