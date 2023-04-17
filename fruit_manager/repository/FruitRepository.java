package fruit_manager.repository;

import fruit_manager.model.Fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FruitRepository implements IFruitRepository {
    Map<String, Fruit> fruitMap = new HashMap<>();

    @Override
    public Map<String, Fruit> displayListFruitRepository() {
//        fruitMap.forEach((s, fruit) -> System.out.printf(fruit.getCodeFruit() + ":" + fruit));
        return fruitMap;
    }

    @Override
    public void addFruitRepository(Fruit fruit) {
        fruitMap.put(fruit.getCodeFruit(), fruit);
    }


    @Override
    public void editFruitRepository(String key, Fruit fruit) {
        fruitMap.replace(key, fruit);
    }

    @Override
    public void deleteFruitRepository(String key) {
        fruitMap.remove(key);
    }

    @Override
    public Fruit findByCodeFruit(String codeFruit) {
        Set<String> set = fruitMap.keySet();
        String[] setArr = new String[set.size()];
        int count = 0;
        for (String key : set) {
            setArr[count++] = key;
        }
        for (int i = 0; i < setArr.length; i++) {
           if (codeFruit.equals(fruitMap.get(setArr[i]).getCodeFruit())) {
           return fruitMap.get(i);
           }
        }
        return null;
    }
}
