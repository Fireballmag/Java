package dao;

import java.util.concurrent.ConcurrentHashMap;

public class CollectionSearchDAOImpl implements CollectionSearchDAO {

    private ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
    {
        concurrentHashMap.put("1", "Human1");
        concurrentHashMap.put("2", "Human2");
        concurrentHashMap.put("3", "Human3");
        concurrentHashMap.put("4", "Human4");
    }
    @Override
    public String findInfo(String key) {
        return concurrentHashMap.get(key);
    }

    @Override
    public void changeInfo(String key, String info) {
        concurrentHashMap.replace(key, info);
    }
}