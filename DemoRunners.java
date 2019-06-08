/*
Autor: Adrian Matyszczak 25.05.2019
 */
import java.util.Scanner;

public class DemoRunners
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
    System.out.println("Who Running? (Athlete, Machine, PoliticalCandidate)");
    String type = input.next();
    switch(type) {
        case "Athlete": {
            Athlete athlete = new Athlete();
            athlete.run;
            break;
        }
        case "Machine": {
            Machine machine = new Machine();
            machine.run;
            break;
        }
        case "PoliticalCandidate": {
            PoliticalCandidate politicalCandidate = new PoliticalCandidate();
            politicalCandidate.run;
            break;
        }
        default: {
            System.out.println("Who Running?? Choise a type one more time");
            break;
        }
    }
    input.close();
    }
}
