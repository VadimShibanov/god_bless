package faang.school.godbless.Турнир_в_Королевской_гавани;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class King {
    public static void main(String[] args) {
        Knight knightOne = new Knight("Vadim");
        Knight knightTwo = new Knight("John");

        knightOne.addTrial(new Trial(knightOne.getName(), "One"));
        knightOne.addTrial(new Trial(knightOne.getName(), "Two"));

        knightTwo.addTrial(new Trial(knightTwo.getName(), "Three"));
        knightTwo.addTrial(new Trial(knightTwo.getName(), "For"));

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        knightOne.startTrials(executorService);
        knightTwo.startTrials(executorService);

        executorService.shutdown();
    }
}
