package tables.find;

import io.ebean.*;
import tables.BoardInf;

import java.util.HashMap;
import java.util.List;
im


public class All extends BoardInf{

    //test用　list
    public static List<BoardInf> selectList(){
        List<BoardInf> list1 = BoardInf.finder.all();
        BoardInf(list1);
        return list1;
    }

    //本番はこっちで
    public static HashMap<String,BoardInf> selectMap(){
        List<BoardInf> list1 = BoardInf.finder.all();
        HashMap<String,BoardInf> map1 = new HashMap<String,BoardInf>();
        return map1;
    }

    public HashMap<String,BoardInf> select() {



        HashMap<String, BoardInf> map1 = new HashMap<String, BoardInf>();


        return map1;
    }


}
