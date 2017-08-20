import java.util.ArrayList;
import java.util.List;


public class Hero {
private String mName;
private String mPower;
private String mWeakness;
private static List<Hero> instances=new ArrayList<Hero>();
private int mId;
private String mImage;
public Hero(String name,String power,String weakness,String image){
        mName=name;
        mPower=power;
        mWeakness=weakness;
        instances.add(this);
        mId=instances.size();
        mImage=image;
}
public String getName(){
        return mName;
}
public String getPower(){
        return mPower;
}
public String getWeakness(){
        return mWeakness;
}
public static List<Hero> all(){
        return instances;
}
public static void clear() {
        instances.clear();
}
public int getId(){
        return mId;
}
public static Hero find(int id){
  return instances.get(id - 1);
}
public String getImage(){
  return mImage;
}
}
