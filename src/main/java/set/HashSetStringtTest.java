package set;

import java.util.HashSet;

/**
 * Created by xiaolin  on 2017/6/24.
 */
public class HashSetStringtTest {
    final HashSet<String> baseObjects;

    public HashSetStringtTest(HashSet<String> baseObjects) {
        this.baseObjects = baseObjects;
    }

    public HashSet<String> getBaseObjects() {
        return baseObjects;
    }

    public static void main(String[] args) {
        HashSet<String> baseObjects = new HashSet<String>(10);
        for (int i = 0; i < 7; i++) {
            baseObjects.add("KEY" + ":" + i);
        }

        HashSetStringtTest hashSetTest = new HashSetStringtTest(baseObjects);

        if (hashSetTest.getBaseObjects().contains("KEY" + ":" + 1)){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }
    }
}
