//三门问题
public class ThreeGatesExperiment {
    private int N;
    public ThreeGatesExperiment(int N){
        if(N <= 0)
            throw new IllegalArgumentException("N must be larget than 0");
        this.N = N;
    }

    public void run(boolean changeDoor){
        int wins = 0;
        for(int i = 0 ; i < N ; i++)
            if(play(changeDoor))
                wins++;
        System.out.println(changeDoor ? "change" : "not change");
        System.out.println("winnig rate:"+(double)wins/N);
    }

    private boolean play(boolean changeDoor){
        int prizeDoor = (int)(Math.random() * 3);
        int playerChoice = (int)(Math.random() * 3);
        if(playerChoice == prizeDoor)
            return changeDoor ? false : true;
        else
            return changeDoor ? true : false;
    }

    public static void main(String[] args){
        int N = 10000000;
        ThreeGatesExperiment exp = new ThreeGatesExperiment(N);
        exp.run(true);
        System.out.println();
        exp.run(false);
    }
}
