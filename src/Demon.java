
public class Demon
{
    public int Sc; //stamina lost by Pandora after defeating the demon
    public int Tr; //number of turns needed to recover stamina after the fight
    public int Sr; //amount of stamina recovered Tr turns after the fight
    public int Na; //number of turns in which you’ll earn fragments for defeating the demon

    public int[] Frags;

    public Demon(int sc, int tr, int sr, int na, int[] frags)
    {
        Sc = sc;
        Tr = tr;
        Sr = sr;
        Na = na;
        Frags = frags;
    }

    public int CalculateCost(int turn, int maxTurn)
    {
        return Sc * 30 + EarnCostTurn() * 20 + EarnTurn(turn, maxTurn) * 10;
    }

    public int EarnCostTurn()
    {
        return Sr - Sc;
    }

    public int EarnTurn(int turn, int maxTurn)
    {
        int n = 0;
        for(int i = turn; i < Math.min(Frags.length, maxTurn); i++)
        {
            n += Frags[i];
        }
        return n;
    }
}
