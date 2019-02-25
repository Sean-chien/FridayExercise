package week02;

import java.sql.SQLOutput;

public class IronMan {
    //‘static’ variable - belongs to the class ,not to
    private static int ID = 666666;
    //‘final’ - final value,CONSTANT;you cannot change.

    //attributes(variables)-instance(member) variables(dataFields)
    private int sin;
    private int healthPoints;
    private int attackPoints;
    private String suitColour;
    private boolean inRelationship;
    private int money;

    //constructor
    public IronMan(int attackPoints, String suitColour,int money,boolean inRelationship) {
        this.sin = ID++;
        this.healthPoints = 1000;
        this.attackPoints = attackPoints;
        this.suitColour = suitColour;
        this.money = money;
        this.inRelationship = inRelationship;
    }

    //getter & setter
    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getMoney() {
        return this.money;
    }

    public int getSin() {
        return sin;
    }

    //behaviours(methods)
    public void fly() {
        if (this.money > 100) {
            System.out.println("I am IronMan.");
            this.money -= 100;
        } else {
            System.out.println("You suck!");
            System.out.println("Make more money");
        }
    }

    public void fight(IronMan other) {
        if (this.money > 10) {
            other.healthPoints -= this.attackPoints;
            System.out.println("HaHa you loser!");
        } else {
            this.healthPoints -= 5;
            System.out.println("You just get kicked!");
            System.out.println("Go home and cry like a baby.");
        }
    }

    public void breakUp() {
        if (this.inRelationship) {
            this.inRelationship = false;
            this.money += 100;
            System.out.println("I am single!");
            System.out.println("I am still a rich bastard!");
        } else {
            System.out.println("You need a girlfriend first!");
        }
    }

    public void match() {
        if (!this.inRelationship && this.money > 500) {
            this.inRelationship = true;
            System.out.println("You are now in a relationship!");
        } else if (this.inRelationship && this.money > 1000) {
            System.out.println("They are coming to you...");
        } else {
            System.out.println("You are a single dog!");
        }
    }

}
