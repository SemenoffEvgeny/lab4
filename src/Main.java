import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way = reader.readLine();
        System.out.println("Введите путь к файлу, в который будет скопировано содержимое.");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String way2 = reader2.readLine();
        file fileWork;
        try {
            fileWork = new file();
            System.out.println("Содержимое успешно скопировано со скоростью прогресса " + fileWork.copy(way, way2) + " c");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
