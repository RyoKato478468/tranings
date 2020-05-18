package models;

import javax.inject.Inject;

import play.data.*;
import play.mvc.*;

import tables.find.GetData;

public class UserForm {

    @Inject
    public FormFactory formFactory;

    public Form<GetData> getDataForm;
    public GetData getData;

    public UserForm(Http.Request request){
        this.getDataForm = formFactory.form(GetData.class).bindFromRequest(request);
        this.getData = getDataForm.get();
    }

}