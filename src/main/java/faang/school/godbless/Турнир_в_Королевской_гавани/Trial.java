package faang.school.godbless.Турнир_в_Королевской_гавани;

import lombok.AllArgsConstructor;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class Trial implements Runnable {

    private String knightName;

    private String trialName;

    @Override
    public void run() {
        System.out.println("Trial "+ trialName + " of " + knightName + " is started");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
