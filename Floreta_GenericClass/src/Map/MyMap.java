package Map;

import java.util.ArrayList;

public class MyMap<KeyType, ValueType> {
    private ArrayList<KeyType> keysList;
    private ArrayList<ValueType> valuesList;

    public MyMap() {
        keysList = new ArrayList<>();
        valuesList = new ArrayList<>();

    }

    public void put(KeyType key, ValueType value) {
        boolean found = false;
        for (int i = 0; i < keysList.size(); i++) {
            if (keysList.get(i).equals(key)) {
                valuesList.set(i, value);
                found = true;
                break;

            }
        }
        if (!found) {
            keysList.add(key);
            valuesList.add(value);

        }
    }

    public ValueType get(KeyType key) {
        for (int i = 0; i < keysList.size(); i++) {
            if (keysList.get(i).equals(key)) {

                return valuesList.get(i);
            }
        }
        return null;
    }

    public ValueType remove(KeyType key) {
        for (int i = 0; i < keysList.size(); i++) {
            if (keysList.get(i).equals(key)) {
                keysList.remove(i);
                return valuesList.remove(i);

            }
        }

        return null;
    }
}