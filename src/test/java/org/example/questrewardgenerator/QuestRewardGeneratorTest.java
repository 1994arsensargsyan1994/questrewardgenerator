package org.example.questrewardgenerator;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class QuestRewardGeneratorTest {

    @Test
    public void testQuestRewardGenerator() {
        String first = QuestRewardGenerator.generateRewards(100);
        String second = QuestRewardGenerator.generateRewards(100);
        Assert.assertEquals(first, second);
    }

    @Test
    public void testQuestRewardGeneratorView() {
        String first = QuestRewardGenerator.generateRewards(155);
        System.out.println(first);
    }

    @Test
    public void testQuestRewardGeneratorPerformance() {
        ZonedDateTime now = ZonedDateTime.now();
        QuestRewardGenerator.generateRewards(10000);
        long millis = now.until(ZonedDateTime.now(), ChronoUnit.MILLIS);
        System.out.println("execution time whit millis: " + millis);
    }
}
