package exeptions;

public class MinCountOfData extends RuntimeException{

    public MinCountOfData() {
        super("Количество данных меньше запрашиваемых");
    }
}
