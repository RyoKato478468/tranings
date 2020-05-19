package models;

import javax.inject.Inject;

import io.ebean.DB;
import org.springframework.util.StringUtils;
import play.data.*;
import play.mvc.*;
import tables.T_User;
import tables.find.*;
import java.util.*;
import io.ebean.Finder;


public class UserForm {

    @Inject
    public FormFactory formFactory;

    public Form<SubmitData> submitDataForm;
    public SubmitData submitData;

    public UserForm(Http.Request request){
        this.submitDataForm = formFactory.form(SubmitData.class).bindFromRequest(request);
        this.submitData = submitDataForm.get();
    }
}