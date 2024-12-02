import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class hw1 {
    public static List<Integer> q1(int x, int y) {
        Random num = new Random();
        List<Integer> numbers = new ArrayList<>(); // יצירת רשימה ריקה

        for (int i=0; i < 20; i++) {
            numbers.add(num.nextInt(y-x+1)+x); // הוספת מספר אקראי לתחום
        }
        return numbers; // החזרת הרשימה

    }
    public static int q2(List<Integer> h, int x) {
        int count = 0;
        for (int i = 0; i < h.size(); i++) {
            if (h.get(i) == x) { // השוואה בין המספר ברשימה למספר הנתון
                count++;
            }
        }

        return count; // החזרת הספירה
    }
}
