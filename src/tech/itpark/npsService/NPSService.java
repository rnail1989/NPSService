package tech.itpark.npsService;

public class NPSService {
    public double nps(int[] votes) {

        int promoters = 0;
        int enemy = 0;
        int count = 0;

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > 8 && votes[i] <= 10) {
                promoters++;
            }
            if (votes[i] >= 0 && votes[i] < 7) {
                enemy++;
            }
            if (votes[i] >= 0 && votes[i] <= 10) {
                count++;
            }
        }
        double nps = promoters * 100.0 / count - enemy * 100.0 / count;
        return nps;


    }


}
