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

    public Result init(int id){
        boolean isEdit = false;
        if(id != 0){
            isEdit = true;
        }
        return ok(views.html.user.render(id,isEdit));
    }

    public Result insertOrUpdate(Http.Request request,boolean isEdit,int id) {

        Form<SubmitData> submitDataForm = formFactory.form(SubmitData.class).bindFromRequest(request);
        SubmitData submitData = submitDataForm.get();

        Where wh = new Where();
        wh.insertOrUpdate(submitData,isEdit);

        return redirect(routes.Application.index());
    }

    public Result delete(Http.Request request,int id){
        Where wh = new Where();
        wh.delete(id);

        return redirect(routes.Application.index());
    }
}