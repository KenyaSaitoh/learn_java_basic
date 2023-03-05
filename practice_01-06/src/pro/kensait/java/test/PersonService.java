package pro.kensait.java.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ModelManager;

public class PersonService {
    @ConsoleMenu(order = 1, title = "すべてのPersonを取得する")
    public List<Person> getPerson() {
        List<Person> result = ModelManager.readAll();
        return result;
    }
    
    @ConsoleMenu(order = 2, title = "Personを登録する")
    public void putPerson(Person person) {
        List<Person> modelList = ModelManager.readAll();
        modelList.add(person);
        ModelManager.writeAll(modelList);
    }

    @ConsoleMenu(order = 3, title = "Personのマップを返す")
    public Map<Integer, Person> getPersonMap() {
        List<Person> modelList = ModelManager.readAll();
        Map<Integer, Person> modelMap = new HashMap<>();
        int id = 1;
        for (Person person : modelList) {
            modelMap.put(id, person);
            id++;
        }
        return modelMap;
    }
}
