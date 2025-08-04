package JavaSE05;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Option;

        ArrayList<Simcard> simcards = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1_Add simcard");
            System.out.println("2_find by operator");
            System.out.println("3_sum of owner");
            System.out.println("4_show list");
            System.out.println("5_exit");
            System.out.println("Enter your Option:");
            Option = Integer.parseInt(input.nextLine());

            System.out.println("---------------------------");

            if (Option == 0) {
                break;
            } else if (Option == 1) {
                Simcard s1 = new Simcard();
                System.out.println("Enter your Id:");
                s1.Id = Integer.parseInt(input.nextLine());
                System.out.println("Enter your Operaror:");
                s1.Operaror = input.next();
                System.out.println("Enter your Number:");
                s1.Number = input.nextLine();
                System.out.println("Enter your Owner:");
                s1.Owner = input.nextLine();
                simcards.add(s1);
                System.out.println("simcard added successfully");
            }
            else if (Option == 2) {
                System.out.println("it is being bild");
                System.out.println("----------------------------");
            }
            else if (Option == 3) {
                System.out.println("it is being bild");
                System.out.println("----------------------------");
            }
            else if (Option == 4) {
                if (simcards.isEmpty()) {
                    System.out.println("simcards is empty");
                    System.out.println("------------------------");
                }
                else{
                    System.out.println("simcards is empty");
                for(Simcard s:simcards){
                        System.out.printf("%4s %10s %10s\n",s.Id,s.Operaror,s.Number,s.Owner);
                    }
                    System.out.println("------------------------");
                }
            }
            else if (Option == 5) {
                break;
            }
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
