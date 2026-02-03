package faang.school.godbless.The_Big_Bang_Theory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BigBangTheory {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Task("Sheldon", "Theory preparing"));
        executorService.execute(new Task("Leonard", "Experiment modelling"));
        executorService.execute(new Task("Howard", "Tools development"));
        executorService.execute(new Task("Rajesh", "Data analysing"));
        executorService.shutdown();
    }
}
