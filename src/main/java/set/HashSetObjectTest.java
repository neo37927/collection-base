package set;

import list.BaseObject;

import java.util.HashSet;

/**
 * Created by xiaolin  on 2017/6/24.
 */
public class HashSetObjectTest {
    final HashSet<BaseObject> baseObjects;

    public HashSetObjectTest(HashSet<BaseObject> baseObjects) {
        this.baseObjects = baseObjects;
    }

    public HashSet<BaseObject> getBaseObjects() {
        return baseObjects;
    }

    public static void main(String[] args) {
        HashSet<BaseObject> baseObjects = new HashSet<BaseObject>(10);
        for (int i = 0; i < 7; i++) {
            baseObjects.add(new BaseObject("KEY" + ":" + i));
        }

        HashSetObjectTest hashSetTest = new HashSetObjectTest(baseObjects);

        if (hashSetTest.getBaseObjects().contains(new BaseObject("KEY" + ":" + 1))){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }
    }
}
