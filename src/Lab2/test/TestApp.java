package Lab2.test;

import Lab2.store.ProductStore;
import Lab2.store.WoodDirectory;
import Lab2.model.Timber;

public class TestApp {
    private WoodDirectory wd = new WoodDirectory();
    private ProductStore ps = new ProductStore();
    public static void main (String[] args){
        TestApp app = new TestApp();
        app.startApp();
    }

    private void startApp(){
        //Наповнюємо сховище брусів
        ps.add(new Timber(wd.get(0), 5f, 0.5f, 0.4f));
        ps.add(new Timber(wd.get(1), 10f, 0.5f, 0.4f));
        //додаємо перелік продуктів
        System.out.println(wd);
        System.out.println(ps);
        //Обчислюємо вагу продуктів
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight(){
        float fullWeight = 0;
        for(Timber timber : ps.getArr()){
            fullWeight += timber.weight();
        }
        return fullWeight;
    }
}
