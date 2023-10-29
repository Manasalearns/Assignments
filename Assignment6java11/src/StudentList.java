import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList 
{
    public static void main(String[] args) {
        List<String> names = null;
        try {
            Path path = Paths.get("C:\\Users\\User\\OneDrive\\Desktop\\StudentsList.txt");
            names = Files.readAllLines(path)
                    .stream()
                    .filter(line -> !line.isEmpty() && line.matches("^[a-zA-Z]+$"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (names != null) {
            names.forEach(System.out::println);
            System.out.println("Total count of students: " + names.size());
        }
    }
}