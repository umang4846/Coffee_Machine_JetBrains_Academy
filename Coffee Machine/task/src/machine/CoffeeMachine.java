package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choice = scanner.next();
            ActionEnum actionEnum = ActionEnum.valueOf(choice.toUpperCase());
            isExit = CoffeeExpress.choiceOperation(actionEnum);
        } while (!isExit);
    }
}

class CoffeeExpress {

    private static int water = 400;
    private static int milk = 540;
    private static int coffee = 120;
    private static int disposableCups = 9;
    private static int money = 550;
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean choiceOperation(ActionEnum actionEnum) {

        switch (actionEnum) {
            case BUY:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                String typeOfCoffee = scanner.next();
                makeCoffee(typeOfCoffee);
                break;
            case FILL:
                fillExpress();
                break;
            case TAKE:
                takeMoney();
                break;
            case REMAINING:
                displayCoffeeMachineStats();
                break;
            case EXIT:
                return true;
        }
        return false;
    }

    private static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void fillExpress() {
        System.out.println("Write how many ml of water do you want to add: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee do you want to add: ");
        int coffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cups = scanner.nextInt();
        changeIngreddients(water, milk, coffee, cups, 0, false);
    }

    private static void displayCoffeeMachineStats() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffee + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                "$" + money + " of money");
    }

    private static boolean HaveEnoughResources(int water, int milk, int coffee) {
        if (water > CoffeeExpress.water) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (milk > CoffeeExpress.milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (coffee > CoffeeExpress.coffee) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (1 > disposableCups) {
            System.out.println("Sorry, not enough cups of coffee!");
            return false;
        }
        return true;
    }

    private static void makeCoffee(String typeOfCoffee) {
        boolean Enough;
        switch (typeOfCoffee) {
            case "1":
                Enough = HaveEnoughResources(250, 0, 16);
                if (Enough) {
                    changeIngreddients(250, 0, 16, 1, 4, true);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                Enough = HaveEnoughResources(350, 75, 20);
                if (Enough) {
                    changeIngreddients(350, 75, 20, 1, 7, true);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                Enough = HaveEnoughResources(200, 100, 12);
                if (Enough) {
                    changeIngreddients(200, 100, 12, 1, 6, true);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                break;
        }

    }

    private static void changeIngreddients(int water, int milk, int coffee, int cups, int money, boolean typeOfChange) {
        CoffeeExpress.water = typeOfChange ? CoffeeExpress.water - water : CoffeeExpress.water + water;
        CoffeeExpress.milk = typeOfChange ? CoffeeExpress.milk - milk : CoffeeExpress.milk + milk;
        CoffeeExpress.coffee = typeOfChange ? CoffeeExpress.coffee - coffee : CoffeeExpress.coffee + coffee;
        CoffeeExpress.disposableCups = typeOfChange ? CoffeeExpress.disposableCups - 1 : CoffeeExpress.disposableCups + cups;
        CoffeeExpress.money += money;
    }
}

enum ActionEnum {
    BUY,
    FILL,
    TAKE,
    REMAINING,
    EXIT
}

