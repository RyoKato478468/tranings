package tables;

import io.ebean.*;
import io.ebean.Finder;
import io.ebean.annotation.*;

import javax.persistence.*;
import javax.persistence.Version;

import play.db.ebean.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
public class BoardInf extends BaseTable{

    @Id
    @NotNull
    public int id;

    @NotNull
    public String name;

    @NotNull
    public String title;

    @NotNull
    public String message;

    @CreatedTimestamp
    public Date createdAt;

    @Version
    public Date updatedAt;

    public BoardInf(ArrayList<BoardInf> list1){
        this.id = list1.get(0);
    }

    public static Finder<Long, BoardInf> finder = new Finder<Long, BoardInf>(BoardInf.class);

    /*public String toString(){
        return "BoardInf [id="+id+",name="+name+",title"+title+",message"+message+",createdAt"+createdAt+",updatedAt"+updatedAt+"]";
    }*/


}
