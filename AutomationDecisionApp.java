import java.util.Scanner;

public class AutomationDecisionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("              Automation Feasibility Calculator");

        // Input like hours, cost, and cost
        System.out.print("manual hours per week: ");
        int hoursPerWeek = sc.nextInt();

        System.out.print("cost per hour: ");
        int costPerHour = sc.nextInt();

        System.out.print("one-time automation cost: ");
        int automationCost = sc.nextInt();

        // Calculate manual cost and after profit in automation
        int weeklyManualCost = hoursPerWeek * costPerHour;
        int breakEvenWeeks = automationCost / weeklyManualCost;

        // Output as worth automating or not
        System.out.println("\n       Result ");
        System.out.println("Manual cost per week: " + weeklyManualCost);
        System.out.println("Automation cost recovery time: " + breakEvenWeeks + " weeks");

        if (breakEvenWeeks <= 20) {
            System.out.println("Decision: Worth Automating");
        } else {
            System.out.println("Decision: Not Worth Automating");
        }

    }
}