package tables.find;

import java.util.*;
import io.ebean.Finder;
import tables.*;

public class Where {

    T_User createUser = new T_User();

    public void createUser(GetData list){

        this.createUser.id = list.id;
        this.createUser.name = list.name;
        this.createUser.schoolYear = list.schoolYear;
        this.createUser.height = list.height;
        this.createUser.likeFood = list.likeFood;

        createUser.save();
    }

    public static Finder<Long, T_User> finder = new Finder<Long, T_User>(T_User.class);

    //取得用
    public static List<T_User> find(String str) {
        if (str != null) {
            return finder.query().where().ilike("name", "%" + str + "%").findList();
        } else {
            return finder.all();
        }
    }
}
