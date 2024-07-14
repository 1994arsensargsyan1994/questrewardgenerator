# Quest Reward Generator

## Overview

The Quest Reward Generator is a Java utility that generates reward strings based on given parameters.
This README provides an overview of how to use the generator and its capabilities.

## Getting Started

To integrate the Quest Reward Generator into your project, follow these steps:

1. **Clone the Repository:**
     Clone the repository to your local machine using Git:

2. **Import into Your IDE:**
     Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. **Usage:**

The `QuestRewardGenerator` class provides methods to generate reward strings based on a specified integer parameter `N`.

```java
public class QuestRewardGenerator {

    /**
     * Generates a reward string based on the specified parameter N.
     *
     * @param N The parameter used to generate the reward string.
     * @return A string representing the generated rewards.
     */
    public static String generateRewards(int N) {
        // Implementation details...
    }

}
```

## Tests
   The project includes JUnit tests to verify the functionality and performance of the QuestRewardGenerator.

1. Running Tests
   To run the tests:

Open the project in your IDE.


Navigate to the `QuestRewardGeneratorTest` class located in `src/test/java`.
Right-click on the class name and select "Run `QuestRewardGeneratorTest`" or use the IDE's test runner.


## Test Cases
1. `testQuestRewardGenerator`
Verifies that generating rewards with the same parameter yields identical results.

2. `testQuestRewardGeneratorView`
Demonstrates generating rewards for a specific parameter (N = 155) and printing the result.

3.  `testQuestRewardGeneratorPerformance`
Measures the execution time for generating rewards with a large parameter (N = 10000).
Performance