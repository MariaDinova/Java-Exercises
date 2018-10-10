/*Part 1 – Greeting
First, you’ll want to greet your user and ask them their name. As you can see above the user types their response on the same line as the question. To do this you’ll want to use a System.out.print() statement instead of a System.out.println() statement. Once your user tells you their name use it to greet them! Then ask them where they would like to go. Finally, tell your user their destination sounds like a great trip. All the code to accomplish Part 1 should be in its own method.

HINT: Some names and destinations are more than 1 word! Plan accordingly.

Part 2 – Travel time and Budget
For this part, you’ll want to ask the user about how much time and money they are budgeting for their trip. Ask the user:

How many days are they going to spend in their destination?
What is their total budget for the trip in USD?
What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EU etc…
The conversion rate between 1 USD to however many of that destinations currency. For example, there are 0.9 euro to 1 usd, so the user would type in 0.9
Once you have all this info (stored in the correct variable types), use it to tell the user the following information:

How much time the user will spend at their destination in days, hours, minutes and seconds
Show the user their budget in USD for the whole trip and how much they can spend in USD per day
Show the user their budget in the travel destination’s currency for the total trip and per day
All the code to accomplish Part 2 should be in its own method.

HINT: keep in mind that if you divide integers you might lose some information when it truncates.

Part 3 – Time Difference
For this part, you’ll need to ask the user about the time difference between their home and where they are going. If the destination time zone is “behind” the user’s home time zone the user should enter a negative number. For example, the time difference between Seattle and Nairobi is 9 hours, and the time difference between New York and Mexico City is -1 hours.

Show the time it will be in the travel destination when it is midnight at home and when it is noon at home. You can report these in 24 format, where midnight is 0:00 and noon is 12:00.

HINT: Your answers might be greater than 24. Try using the % or mod operator to "wrap around" to 24-hour time format. For example, 12 % 24 is 12, but 25 % 24 is 1.

All the code to accomplish Part 3 should be in its own method.

Part 4 – Country Area
Only three countries in the world us the "imperial system", so most countries report their distances in kilometers. For this part, ask the user the area of their travel destination country in km^2. Then you’ll want to convert that to miles^2 and report those results back to the user.

All the code to accomplish Part 4 should be in its own method.*/

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

