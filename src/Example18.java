import java.util.Scanner;
class Example18 {
    public static void main(String argv[]) {
        float pricePerHour, numberOfHours;
        float grossPay;
        float netPay;
        final int first500 = 500;
        final int second400 = 400;
        final int total900 = 900;
        final int first35 = 35;
        float extraHours;
        float extraMoney = 0;
        float firstRest;
        float secondRest;
        float tax25;
        float tax45;
        System.out.println("");
        System.out.println("~ ... .. . The lovely LEADER loves you too . .. ... ~");
        System.out.println(". Calculate the life level that leader let you live .");
        System.out.println(". .  How many bread will you can eat this month?  . .");
        System.out.println("");
        System.out.println("Enter price per hour: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        pricePerHour = inputValue.nextFloat();

        System.out.println("Enter worked hours: ");

        inputValue = new Scanner(System.in);
        numberOfHours = inputValue.nextFloat();

        if (numberOfHours > first35) {
            extraHours = numberOfHours - first35;
            numberOfHours = numberOfHours - extraHours;
            extraMoney = extraHours * (pricePerHour * 1.5f);
        }

        grossPay = pricePerHour * numberOfHours + extraMoney;

        if (grossPay <= first500) {
            System.out.println("Net pay is " + grossPay + ", tax free.");
        } else if (grossPay > first500 && grossPay <= total900) {
            firstRest = grossPay - first500;
            tax25 = firstRest * 0.25f;
            netPay = grossPay - tax25;
            System.out.println("Gross pay is " + grossPay + ". Net pay is " + netPay + ", applied " + tax25 + " of 25% tax.");
        } else if (grossPay > total900) {
            secondRest = grossPay - total900;
            tax25 = second400 * 0.25f;
            tax45 = secondRest * 0.45f;
            netPay = grossPay - tax25 - tax45;
            System.out.println("Gross pay is " + grossPay + ". Net pay is " + netPay + ", applied " + tax25 + " of 25% tax and " + tax45 + " of 45% tax.");
        }
        System.out.println("");
        System.out.println("Congrats. This month you'll can buy " + grossPay / 0.5 + " bread bars.");
        System.out.println("Say thanks to the leader.");
    }
}