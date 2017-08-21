import java.util.List;
import java.util.ArrayList;

public class Squad {
private String mTitle;
private static List<Squad> instances=new ArrayList<Squad>();
private int mId;
private List<Hero> mHero;
public Squad(String title){
        mTitle=title;
        instances.add(this);
        mId=instances.size();
        mHero=new ArrayList<Hero>();

}
public String getTitle(){
        return mTitle;
}
public static List<Squad> all(){
        return instances;
}
public static void clear() {
        instances.clear();
}
public int getId(){
        return mId;
}
public static Squad find(int id) {
        return instances.get(id - 1);
}
public List<Hero> getHero(){
        return mHero;
}
public void addHero(Hero hero){
  mHero.add(hero);
}

}

