package faang.school.godbless.Турнир_в_Королевской_гавани;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

@Getter
public class Knight {

    private String name;

    private List<Trial> trials = new ArrayList<>();

    public Knight(String name) {
        this.name = name;
    }

    public void addTrial(Trial trial) {
        trials.add(trial);
    }

    public void startTrials(ExecutorService executorService) {
        executorService.execute(() -> {
                    for (Trial trial : trials) {
                        trial.run();
                    }
                }
        );
    }
}
