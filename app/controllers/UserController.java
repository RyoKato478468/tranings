package controllers;

import play.mvc.*;
import play.data.Form;
import play.data.FormFactory;
import tables.T_User;
import tables.find.*;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result init(Http.Request request){
        //postデータ用に空のインスタンス生成
        Form<T_User> t_userForm = formFactory.form(T_User.class).bindFromRequest(request);

        return ok(views.html.user.render());
    }

    public Result create(Http.Request request){
        Form<GetData> GetDataForm = formFactory.form(GetData.class).bindFromRequest(request);
        GetData GetData = GetDataForm.get();

        Where wh = new Where();
        wh.createUser(GetData);

        return redirect(routes.Application.index());
    }
}