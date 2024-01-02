import java.util.*;

public class HighAccessEmployees {
    public static List<String> findHighAccessEmployees(List<List<String>> accessTimes) {
        Map<String, List<String>> employeeAccessMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        // Populate the map with employee names and their access times
        for (List<String> access : accessTimes) {
            String name = access.get(0);
            String time = access.get(1);
            
            if (!employeeAccessMap.containsKey(name)) {
                employeeAccessMap.put(name, new ArrayList<>());
            }

            employeeAccessMap.get(name).add(time);
        }

        // Check for high access employees
        for (Map.Entry<String, List<String>> entry : employeeAccessMap.entrySet()) {
            List<String> times = entry.getValue();
            times.sort(String::compareTo);

            for (int i = 0; i < times.size() - 2; i++) {
                if (Integer.parseInt(times.get(i + 2)) - Integer.parseInt(times.get(i)) <= 99) {
                    result.add(entry.getKey());
                    break;
                }
            }
        }

        return new ArrayList<>(new HashSet<>(result));
    }
    public static void main(String[] args) {
        List<List<String>> accessTimes = new ArrayList<>();

        accessTimes.add(List.of("d", "0002"));
        accessTimes.add(List.of("c", "0808"));
        accessTimes.add(List.of("c", "0829"));
        accessTimes.add(List.of("e", "0215"));
        accessTimes.add(List.of("d", "1508"));
        accessTimes.add(List.of("d", "1444"));
        accessTimes.add(List.of("d", "1410"));
        accessTimes.add(List.of("c", "0809"));

        System.out.println(findHighAccessEmployees(accessTimes));
    }
}
