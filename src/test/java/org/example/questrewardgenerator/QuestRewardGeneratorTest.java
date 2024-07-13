package org.example.questrewardgenerator;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class QuestRewardGeneratorTest {

    @Test
    public void testQuestRewardGeneratorTheSameInputN() {
        final String first = QuestRewardGenerator.generateRewards(100);
        final String second = QuestRewardGenerator.generateRewards(100);
        Assert.assertEquals(first, second);
    }

    @Test
    public void testQuestRewardGeneratorTheSameInputNForManyCalls() {
        final Set<String> testResults = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            testResults.add(QuestRewardGenerator.generateRewards(76));
        }
        Assert.assertEquals(1, testResults.size());
    }

    @Test
    public void testQuestRewardGeneratorView() {
        final String first = QuestRewardGenerator.generateRewards(155);
        System.out.println(first);
    }

    @Test
    public void testQuestRewardGeneratorPerformance() {
        final ZonedDateTime now = ZonedDateTime.now();
        QuestRewardGenerator.generateRewards(10000);
        final long millis = now.until(ZonedDateTime.now(), ChronoUnit.MILLIS);
        System.out.println("execution time whit millis: " + millis);
    }

    @Test
    @SuppressWarnings("all")
    public void testQuestRewardGeneratorInvalidParameters() {
        Assert.assertThrows(IllegalArgumentException.class,
                () -> QuestRewardGenerator.generateRewards(-1));

        Assert.assertThrows(IllegalArgumentException.class,
                () -> QuestRewardGenerator.generateRewards(10000 + 1));
    }

}
