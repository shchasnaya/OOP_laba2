package Lab2.store;

import Lab2.model.Timber;
import java.util.Arrays;

public class ProductStore {
    private Timber[] arr = new Timber[3];
    private int count = 0;

    //повертає копію масиву без пустих елементів
    public Timber[] getArr() {
        return Arrays.copyOf(arr,count);
    }

    public void add(Timber newTimber) {
        //запобігаємо переповненню масиву
        if(arr.length == count)
            arr = Arrays.copyOf(arr, count + count/2);
        //додаємоновий елемент
        arr[count++] = newTimber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог брусів:\n");
        for(int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}

