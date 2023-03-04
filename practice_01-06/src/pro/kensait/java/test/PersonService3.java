package pro.kensait.java.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ModelManager;

public class PersonService3 {
    @ConsoleMenu(order = 1, name = "すべてのPersonを取得する")
    public List<Person3> getPerson() {
        List<Person3> result = ModelManager.readAll();
        return result;
    }
    
    @ConsoleMenu(order = 2, name = "Personを登録する")
    public void putPerson(Person3 person) {
        List<Person3> modelList = ModelManager.readAll();
        modelList.add(person);
        ModelManager.writeAll(modelList);
    }

    @ConsoleMenu(order = 3, name = "Personのマップを返す")
    public Map<Integer, Person3> getPersonMap() {
        List<Person3> modelList = ModelManager.readAll();
        Map<Integer, Person3> modelMap = new HashMap<>();
        int id = 1;
        for (Person3 person : modelList) {
            modelMap.put(id, person);
            id++;
        }
        return modelMap;
    }
}