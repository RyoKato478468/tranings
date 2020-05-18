package tables;

import java.util.*;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;
import play.data.format.Formats;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseTable extends Model {

    @CreatedTimestamp
    public Date createdAt;

    @Version
    public Date updatedAt;

}
