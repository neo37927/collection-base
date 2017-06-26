package list;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by xiaolin  on 2017/6/24.
 */
public class ArrayListTest {
    final ArrayList<BaseObject> baseObjects;

    public ArrayListTest(ArrayList<BaseObject> baseObjects) {
        this.baseObjects = baseObjects;
    }

    public ArrayList<BaseObject> getBaseObjects() {
        return baseObjects;
    }

    public static void main(String[] args) {
        //构造基础数据
        ArrayList<BaseObject> baseObjects = new ArrayList<BaseObject>(10);
        for (int i=0;i<10;i++){
            baseObjects.add(new BaseObject("KEY"+":"+i));
        }
        ArrayListTest arrayListTest = new ArrayListTest(baseObjects);

        if (arrayListTest.getBaseObjects().contains(new BaseObject("KEY"+":"+1))){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }
    }
}