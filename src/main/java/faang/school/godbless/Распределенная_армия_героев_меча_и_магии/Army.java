package faang.school.godbless.–аспределенна€_арми€_героев_меча_и_магии;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class Army {
    static final List<Subdivisions> SUBDIVISIONS = new ArrayList<>();
    Integer result = 0;

    int calculateTotalPower() {
        ExecutorService executorService = Executors.newFixedThreadPool(SUBDIVISIONS.size());
        for (Subdivisions subdivision : SUBDIVISIONS) {
            executorService.submit(() -> result += subdivision.getPower());
        }
        executorService.shutdown();
        return result;
    }

    void addUnit(Subdivisions subdivision) {
        SUBDIVISIONS.add(subdivision);
    }
}
