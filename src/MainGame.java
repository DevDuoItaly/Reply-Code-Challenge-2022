import java.util.ArrayList;
import java.util.Arrays;

class MainGame
{
    private static Pandora pandora;
    private static ArrayList<Demon> demons = new ArrayList<Demon>();

    private static int turns;

    public static void main(String[] args) throws Exception
    {
        FileRead reader = new FileRead("../res/00-example.txt");
        int[] stats = FileRead.ToInt(reader.ReadLine().split(" "));

        pandora = new Pandora(stats[0], stats[1]);

        turns = stats[2];

        for(int i = 0; i < stats[3]; i++)
        {
            int[] demon = FileRead.ToInt(reader.ReadLine().split(" "));
            demons.add(new Demon(demon[0], demon[1], demon[2], demon[3], Arrays.copyOfRange(demon, 4, demon.length)));
        }

        // Sc - Tr - EndTurn

        int selected = 0, cost;

        cost = demons.get(0).CalculateCost(0, turns);

        for(int i = 1; i < demons.size(); i++)
        {
            int subCost = demons.get(i).CalculateCost(0, turns);
            if(subCost > cost)
            {
                selected = i;
                cost = subCost;
            }
        }

        System.out.println("Selected " + selected + " cost: " + cost);

        // System.out.println(demons[selected].Sc + " " + demons[selected].EarnCostTurn() + " " + demons[selected].Sr + " " + demons[selected].EarnTurn(0, turns));
        demons.remove(selected);
    }
}
