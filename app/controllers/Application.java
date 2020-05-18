package controllers;

import models.UserItem;
import org.h2.engine.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import tables.T_User;
import tables.find.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Application extends Controller{

    @Inject
    FormFactory formFactory;

    public Result index(Http.Request request) {
        Form<PostData> postDataForm= formFactory.form(PostData.class).bindFromRequest(request);
        PostData postData = postDataForm.get();

        List<T_User> t_user = Where.find(postData.input);
        return ok(views.html.index.render(t_user,postDataForm));
    }
}
