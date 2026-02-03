package faang.school.godbless.–аспределенна€_арми€_героев_меча_и_магии;

import java.util.ArrayList;
import java.util.List;


class Army {
    private List<Squad> squads = new ArrayList<>();
    private int result = 0;

    int calculateTotalPower() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (Squad squad : squads) {
            Thread thread = new Thread(() -> result += squad.calculateSquadPower());
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }
        return result;
    }

    void addSquad(Squad squad) {
        squads.add(squad);
    }
}
