import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChecker {
    public static <T> boolean hasDuplicates (List<T> list) {  //проверяем наличие дубликатов
        Set<T> uniqueElements = new HashSet<>();
        for (T element : list) {
            if (!uniqueElements.add(element)) {  //добавляем элемент
                return true;  // нашёл дубликат
            }
        }
        return false;   // все элементы уникальны
    }
}
