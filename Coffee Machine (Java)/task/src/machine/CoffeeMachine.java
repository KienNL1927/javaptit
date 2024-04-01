package machine;
import java.util.*;
public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int water = 400, milk = 540, beans = 120, cups = 9, money = 550;
    public static void info(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money+ " of money");

    }
    public static void espresso(){
        if(water >= 250 && beans >= 16) {
            water -= 250;
            beans -= 16;
            money += 4;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(water < 250)
                System.out.println("Sorry, not enough water!");
            else
                System.out.println("Sorry, not enough beans");
        }
    }
    public static void latte(){
        if(water >= 350 && beans >= 20 && milk >= 75) {
            water -= 350;
            beans -= 20;
            milk -= 75;
            money += 7;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(water < 350)
                System.out.println("Sorry, not enough water!");
            else if(milk < 75)
                System.out.println("Sorry, not enough milk!");
            else
                System.out.println("Sorry, not enough beans!");
        }
    }
    public static void cappuccino(){
        if(water >= 200 && beans >= 12 && milk >= 100) {
            water -= 200;
            beans -= 12;
            milk -= 100;
            money += 6;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
        else{
            if(water < 200)
                System.out.println("Sorry, not enough water!");
            else if(milk < 100)
                System.out.println("Sorry, not enough milk!");
            else
                System.out.println("Sorry, not enough beans!");
        }
    }
    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String a = sc.next();
        if(a.equals("back"))
            return;
        else if(a.equals("1")){
            espresso();
        }
        else if(a.equals("2")){
            latte();
        }
        else {
            cappuccino();
        }
    }
    public static void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int wt = sc.nextInt();
        water += wt;
        System.out.println("Write how many ml of milk you want to add:");
        int m = sc.nextInt();
        milk += m;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int b = sc.nextInt();
        beans += b;
        System.out.println("Write how many disposable cups you want to add:");
        int c = sc.nextInt();
        cups += c;
    }
    public static void take(){
        System.out.println("I gave you" + money);
        money = 0;
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String s = sc.next();
            if(s.equals("remaining"))
                info();
            else if (s.equals("buy"))
                buy();
            else if (s.equals("fill"))
                fill();
            else if (s.equals("take"))
                take();
            else
                break;
        }
    }
}
