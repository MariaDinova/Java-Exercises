import java.util.Scanner;

public class ModuleProjectTripPlanner {
    public static void main(String[] args) {

        greeting();
        travelTimeAndBudget();
        timeDifference();
        countryArea();

    }

    private static void countryArea() {
        Scanner console = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2?");
        double areaKm = console.nextDouble();
        double areaMiles = areaKm * 0.386102;
        System.out.printf("In miles2 that is %.1f", areaMiles);
    }

    private static void timeDifference() {
        Scanner console = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int timeDiff = console.nextInt();
        int newTime = timeDiff + 12;
        System.out.println("That means that when it is midnight at home it will be " + timeDiff +
                ":00 in your travel destination and when it is noon at home it will be " + newTime + ":00" );

    }

    private static void travelTimeAndBudget() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int daysInTravelling = console.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double moneyUSD = console.nextDouble();
        System.out.print("What is the tree letter currency symbol for your travel destination?");
        String currencySymbol = console.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD?");
        double currencyInUSD = Double.parseDouble(console.next());
        int hoursInTravelling = daysInTravelling * 24;
        int minutesInTravelling = hoursInTravelling * 60;
        System.out.println("If you are travelling for " + daysInTravelling +
                " days that is the same as " + hoursInTravelling + " hours or "
                + minutesInTravelling + " minutes");
        double moneyPerDay = (double)moneyUSD / (double)daysInTravelling;
        System.out.printf("If you are going to spend %.2f USD that means per day you can spend up to $%.2f USD", moneyUSD, moneyPerDay);
        System.out.println();
        double otherCurrency = (double) moneyUSD * (double)currencyInUSD;
        double otherCurrencyPerDay = otherCurrency / (double)daysInTravelling;
        System.out.printf("Your total budget in %s is %.2f %s, which per day is %.2f %s", currencySymbol, otherCurrency,
                currencySymbol, otherCurrencyPerDay, currencySymbol);
        System.out.println();
    }

    private static void greeting() {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = console.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String travelDestination = console.nextLine();
        System.out.println("Great! " + travelDestination + " sounds like a great trip");
    }
}

