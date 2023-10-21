package scaler.lld2.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry implements Registry<String, Student> {

    private final Map<String, Student> map = new HashMap<>();

    @Override
    public Student getPrototype(String key) {
        return map.get(key);
    }

    @Override
    public void setPrototype(String key, Student value) {
        map.put(key, value);
    }

}
