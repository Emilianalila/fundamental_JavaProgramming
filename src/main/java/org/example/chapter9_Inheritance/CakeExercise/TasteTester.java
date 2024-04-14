package org.example.chapter9_Inheritance.CakeExercise;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake1 = new Cake("pina colada");
        cake1.setPrice(500.89);
        System.out.println("cake1 = " +"price: "+ cake1.getPrice()+" & flavor: "+ cake1.getFlavor());

        WeddingCake weddingCake1 = new WeddingCake();
        weddingCake1.setPrice(300.99);
        System.out.println("weddingCake1 = " +"price:" +weddingCake1.getPrice() + " & flavor: "+ weddingCake1.getFlavor());

        BirthdayCake birthdayCake1 = new BirthdayCake();
        birthdayCake1.setPrice(239);
        birthdayCake1.setCandles(34);
        System.out.println("birthdayCake1 = " +"price:" +birthdayCake1.getPrice()+ " & flavor: "+ birthdayCake1.getFlavor() + " candles: "+ birthdayCake1.getCandles());
    }
}
