package fruit_manager.repository;

import fruit_manager.model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    public Map<String,Fruit> displayListFruitRepository();
    public void addFruitRepository(Fruit fruit);
    public void editFruitRepository(String key,Fruit fruit);
    public void deleteFruitRepository(String key);
    public Fruit findByCodeFruit(String codeFruit);

}
