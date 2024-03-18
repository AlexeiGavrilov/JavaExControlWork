package exeptions;

public class MaxCountOfData extends RuntimeException{

    public MaxCountOfData() {
        super("Количество данных больше запрашиваемых");
    }
}
