package homework.day2.task0;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        TrainMethodsIf y = new TrainMethodsIf();
        System.out.println("метод <TrainMethodsIf> i = " + y.returnNewInt(32));
        System.out.println("метод <TrainMethodsIf> l = " + y.returnNewLong(32));
        System.out.println("метод <TrainMethodsIf> p = " + y.returnNewChar('p'));
        System.out.println("метод <TrainMethodsIf> f = " + y.returnNewFloat(0.25F));
        System.out.println("метод <TrainMethodsIf> d = " + y.returnNewDouble(30.32));
        y.returnNewBoolean(true);
    }

}
