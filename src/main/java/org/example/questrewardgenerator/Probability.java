package org.example.questrewardgenerator;

public class Probability {

    private long seed; // Seed for the PRNG (for each dif N start seed)

    // Linear Congruential Generator (LCG) parameters
    private static final long MULTIPLIER = 1664525;
    private static final long INCREMENTER = 1013904223;
    private static final long MODULATOR = (long) Math.pow(2, 32);

    /**
     * Constructs a new Probability instance with a deterministic seed based on the input value N.
     *
     * @param N An integer value used to initialize the seed for pseudo number generation.
     */
    public Probability(final int N) {
        this.seed = Integer.hashCode(N);
    }

    /**
     * Generates a pseudo integer between 0 (inclusive) and bound (exclusive) using
     * a custom implementation of the Linear Congruential Generator (LCG).
     *
     * @param bound The upper bound (exclusive) for the generated number.
     * @return A pseudo integer within the range [0, bound).
     */
    public int number(final int bound) {
        seed = (MULTIPLIER * seed + INCREMENTER) % MODULATOR;
        return (int) (seed % bound);
    }

    /**
     * Generates a probability integer within a specified range, using a probability distribution.
     * The probability distribution divides the range into two parts:
     * - 75% probability for numbers between 0 and (maxValueExclusive - rangeStart - 1)
     * - 25% probability for numbers between (rangeStart) and maxValueExclusive
     *
     * @param maxValueExclusive The maximum value (exclusive) for the range of numbers.
     * @param rangeStart        The starting point of the range within which weighted probabilities are applied.
     * @return A probability (number) integer within the specified range.
     */
    public int generateProbability(final int maxValueExclusive, final int rangeStart) {
        final int number = number(maxValueExclusive);

        if (number < maxValueExclusive - rangeStart) {
            return number(rangeStart);
        } else {
            return rangeStart + number(maxValueExclusive - rangeStart + 1);
        }
    }
}
