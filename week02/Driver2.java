package week02;


public class Driver2 {
    public static void main(String[] args) {
        IronMan jasper = new IronMan(1,"Black",10000,true);
        IronMan kei = new IronMan(2,"Gold",10000,false);
        jasper.fight(kei);
        System.out.println("Jasper HP: " + jasper.getHealthPoints());
        System.out.println("Kei Hp: " + kei.getHealthPoints());

        jasper.fly();
        System.out.println("Jasper : $ " + jasper.getMoney());

        System.out.println("Jasper sin: " + jasper.getSin());
        System.out.println("Kei sin: " + kei.getSin());


    }
}
