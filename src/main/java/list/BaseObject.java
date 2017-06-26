package list;

/**
 * Created by xiaolin  on 2017/6/24.
 */
public class BaseObject {
    private String name;

    public BaseObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseObject){
            return this.name.equals(((BaseObject)obj).getName());
        }
        return super.equals(obj);
    }
}
