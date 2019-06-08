/*
Autor: Adrian Matyszczak 25.05.2019
 */

import java.util.Scanner;

public class UseInsurance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choise Life or Health?");
        String typ = input.next();
        switch (typ)
        {
            case "Life":
            {
                Life life = new Life();
                life.setCost();
                life.display();
                break;
            }
            case "Health":
            {
                Health health = new Health();
                health.setCost();
                health.display();
                break;
            }
            default
            {
                System.out.println("Wrong type!! Choise Life or Health");
                break;
            }
        }
        input.close();
    }
}
