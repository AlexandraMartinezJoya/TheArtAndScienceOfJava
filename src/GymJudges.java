import acm.program.ConsoleProgram;

public class GymJudges  extends ConsoleProgram {

    //lol this is the view count in yt :D
    public void run() {
        int nJudges = readInt("Enter the number of judges: ");
        double[] scores = new double[nJudges];
        for (int i= 0; i < nJudges; i++){
            scores[i] = readDouble("Scores for judge "+ i + " : " );
            double total = 0;
            for (int j = 0; j < nJudges; j ++) {
                total += scores[j];

            }
            double averageScore = total / nJudges;
            println("The average score is: " + averageScore );
        }

    }
}
