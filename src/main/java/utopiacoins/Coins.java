package utopiacoins;

public class Coins {
    private int[] typesOfCoins;

    public Coins(){
        typesOfCoins = new int[]{22, 10, 7, 1};
    }

    public int iDontLikeCoins(int N){
        int listOfSolutions[] = new int[N + 1];
        listOfSolutions[0] = 0;

        for (int i = 1; i <= N; i++) {
            //initialize to a value that will be above the any possible answer
            listOfSolutions[i] = 1000000000;
        }

        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j < typesOfCoins.length; j++)
                if (typesOfCoins[j] <= i)
                {
                    int sub = listOfSolutions[i - typesOfCoins[j]];
                    if (sub + 1 < listOfSolutions[i])
                        listOfSolutions[i] = sub + 1;
                }
        }
        return listOfSolutions[N];
    }


    double getSmallest(int a, int b){
        if(a <= b){
            return a;
        }
        else{
            return b;
        }
    }
}


