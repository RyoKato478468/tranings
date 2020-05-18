package models;

import java.util.*;
import play.data.format.Formats;
import tables.T_User;

public class UserItem {

    Long id;
    String name;
    int schoolYear;
    int height;
    String likeFood;

    @Formats.DateTime(pattern = "yyyy/MM/dd HH:mm:SS")
    Date createdAt;

    @Formats.DateTime(pattern = "yyyy/MM/dd HH:mm:SS")
    Date updatedAt;

    public UserItem(T_User user){
        this.id = user.id;
        this.name = user.name;
        this.schoolYear = user.schoolYear ;
        this.height = user.height;
        this.likeFood = user.likeFood;
        this.createdAt = user.createdAt;
        this.updatedAt = user.updatedAt;
    }

}
