public enum Status {
    None,
    Born,
    Live,
    Died;

    public Status step1(int around){
        switch (this)
        {
            //Если количество клеток-соседей равно 3, то рождается новая, иначе ничего
            case None: return (around == 3) ? Born : None;
            // Если количество клеток-соседей выходит за "комфортные" границы, то клетка умирает
            // от одиночества или перенаселения
            case Live: return (around<=1 || around>4) ? Died : Live;
            //если ничего не подходит. оставляем все как есть
            default: return  this;
        }
    }

    public Status step2(int around){
        switch (this)
        {
            case Born: return Live;

            case Died: return None;

            default: return  this;
        }
    }
}