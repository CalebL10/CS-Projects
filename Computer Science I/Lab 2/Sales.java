
/**
 * Write a description of class Sales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sales
{
    public static void main(String[] args)
    {
        System.out.println("Enter a purchase amount: ");
        double purchaseAmount=Given.getDouble();
        double stateTax=purchaseAmount*.05;
        double countyTax=purchaseAmount*.03;
        double totalTax=purchaseAmount*.08;
        double totalPrice=purchaseAmount+totalTax;
        System.out.println("Amount of Purchase:\t $"+purchaseAmount);
        System.out.println("State Sales Tax Paid:\t $"+stateTax);
        System.out.println("County Sales Tax Paid:\t $"+countyTax);
        System.out.println("Total Sales Tax Paid:\t $"+totalTax);
        System.out.println("Total Sales Price:\t $"+totalPrice);
    }
}
