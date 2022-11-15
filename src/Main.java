import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        ArrayList<String> list = new ArrayList<>();
        do
        {
            System.out.println(list);
            String action = SafeInput.getRegExString(in, "What Would you like to do? [A/D/P/Q]", "[AaDdPpQq]");
            if (action.equalsIgnoreCase("A"))
            {
                list.add(SafeInput.getRangedInt(in, "Enter the index", 0, list.size()), SafeInput.getNonZeroLength(in, "Enter a string"));
            }
            else if (action.equalsIgnoreCase("D"))
            {
                list.remove(SafeInput.getRangedInt(in, "Enter the index you want to delete", 0, list.size() - 1));
            }
            else if (action.equalsIgnoreCase("P"))
            {
                for (String i : list)
                    System.out.println(i);
            }
            else if (action.equalsIgnoreCase("Q"))
            {
                done = SafeInput.getYNConfirm(in, "Are you Sure? [Y/N]:");
                System.out.println(list);
            }

        }while (!done);
    }
}