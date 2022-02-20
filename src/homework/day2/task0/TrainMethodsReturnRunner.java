package homework.day2.task0;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn y = new TrainMethodsReturn();
        System.out.println("метод <returnNewInt> вернул " + y.returnNewInt(6));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewLong(56756756));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewChar('u'));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewFloat(0.5F));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewDouble(0.567675765));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewShort((short) 1347));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewByte((byte) 12));
        System.out.println("метод <returnNewInt> вернул " + y.returnNewBoolean( true));



    }
}
