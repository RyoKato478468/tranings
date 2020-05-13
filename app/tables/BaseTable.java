package tables;

import java.util.*;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;

import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public abstract class BaseTable extends Model {

    @CreatedTimestamp
    public Date createdAt;

    @Version
    public Date updatedAt;

}
