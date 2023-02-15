package src;

class MainGame
{
    public static void main(String[] args) throws Exception
    {
        FileRead reader = new FileRead("00-example.txt");
        int[] stats = FileRead.ToInt(reader.ReadLine().split(" "));

        for(int i = 0; i < stats.length; i++)
            System.out.println(stats[i]);
    }
}
