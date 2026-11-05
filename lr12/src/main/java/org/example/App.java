
package org.example;

import java.util.Map;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {

        Map<String, Film> films = new LinkedHashMap<>();

        films.put("Мстители", new Action("Мстители", 1, 180, 25));
        films.put("Терминатор", new Action("Терминатор", 2, 107, 15));
        films.put("Джон Уик", new Action("Джон Уик", 3, 101, 20));

        films.put("Маска", new Comedy("Маска", 4, 101, 9));
        films.put("Один дома", new Comedy("Один дома", 5, 103, 10));
        films.put("Джуманджи", new Comedy("Джуманджи", 6, 104, 8));

        films.put("Титаник", new Drama("Титаник", 7, 195, 11));
        films.put("Зелёная миля", new Drama("Зелёная миля", 8, 189, 0));

        for (Map.Entry<String, Film> entry : films.entrySet()) {
            System.out.println("\nКлюч: " + entry.getKey());
            entry.getValue().displayInfo();
        }
    }
}
