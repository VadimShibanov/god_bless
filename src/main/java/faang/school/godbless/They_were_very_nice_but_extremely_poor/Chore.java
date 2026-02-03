package faang.school.godbless.They_were_very_nice_but_extremely_poor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Chore implements Runnable {
    String chore;

    @Override
    public void run() {
        System.out.println(chore);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
