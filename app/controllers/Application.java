package controllers;

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
        Form<GetData> getDataForm= formFactory.form(GetData.class).bindFromRequest(request);
        GetData getData = getDataForm.get();

        List<T_User> t_user = Where.find(getData.input);
        return ok(views.html.index.render(t_user,getDataForm));
    }
}
