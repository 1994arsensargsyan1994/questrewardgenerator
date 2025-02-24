package org.example.questrewardgenerator;

public final class QuestRewardGenerator {

    private static final char BRONZE = 'b';
    private static final char SILVER = 's';

    public static String generateRewards(final int N) {
        if (N < 1 || N > 10000) {
            throw new IllegalArgumentException("N must be between 1 and 10000 inclusive");
        }
        final Probability probability = new Probability(N);
        final StringBuilder rewardString = new StringBuilder("b");

        for (int i = 1; i < N; i++) {
            final int number = probability.generateProbability(N, i + 1);
            if (number < N / 2) {
                rewardString.append(BRONZE);
            } else {
                rewardString.append(SILVER);
            }
        }
        return rewardString.toString();
    }

    private QuestRewardGenerator() {
        throw new UnsupportedOperationException();
    }
}
