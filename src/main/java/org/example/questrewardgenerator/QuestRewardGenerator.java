package org.example.questrewardgenerator;

public final class QuestRewardGenerator {

    private static final char BRONZE = 'b';
    private static final char SILVER = 's';

    public static String generateRewards(int N) {
        if (N < 1 || N > 10000) {
            throw new IllegalArgumentException("N must be between 1 and 10000 inclusive");
        }
        Probability probability = new Probability(N);
        StringBuilder rewardString = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                rewardString.append('b');
            } else if (i == N - 1) {
                rewardString.append('s');
            } else {
                int number = probability.generateProbability(N, i + 1);
                if (number < N / 2) {
                    rewardString.append(BRONZE);
                } else {
                    rewardString.append(SILVER);
                }
            }
        }

        return rewardString.toString();
    }

    private QuestRewardGenerator() {
        throw new UnsupportedOperationException();
    }
}
