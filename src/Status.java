public enum Status {
    NONE,
    Born,
    Live,
    Died;

    public Status step1(int around){
        switch (this)
        {
            //Если количество клеток-соседей равно 3, то рождается новая, иначе ничего
            case NONE: return (around == 3) ? Born : NONE;
            // Если количество клеток-соседей выходит за "комфортные" границы, то клетка умирает
            // от одиночества или перенаселения
            case Live: return (around<=1 || around>=4) ? Died : Live;
            //если ничего не подходит. оставляем все как есть
            default: return  this;
        }
    }

    public Status step2(){
        switch (this)
        {
            case Born: return Live;

            case Died: return NONE;

            default: return  this;
        }
    }

    public boolean isCell(){
        return this==Live || this==Died;
    }
}