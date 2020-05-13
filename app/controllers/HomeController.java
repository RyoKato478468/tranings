package controllers;

import play.mvc.*;
import tables.BoardInf;

import java.util.ArrayList;
import java.util.List;

import static play.mvc.Results.ok;

public class HomeController {

    public Result index() {

        System.out.println("suta-to");

        List<BoardInf> list1 = new ArrayList<>();

        System.out.println(list1);

        return ok(views.html.index.render());
    }

}
