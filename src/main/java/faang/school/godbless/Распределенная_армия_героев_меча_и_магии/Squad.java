package faang.school.godbless.–аспределенна€_арми€_героев_меча_и_магии;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
class Squad {

    String typeOfSquad;

    List<Subdivisions> warriors;

    int calculateSquadPower() {
        int result = 0;
        Iterator iterator = warriors.iterator();
        while (iterator.hasNext()) {
            Subdivisions subdivisions = (Subdivisions) iterator.next();
            result += subdivisions.getPower();
        }
        return result;
    }
}
