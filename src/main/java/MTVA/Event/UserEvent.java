package MTVA.Event;

import MTVA.Entity.User;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class UserEvent extends ApplicationEvent {
    String remark;

    public UserEvent(User source, String remark) {
        super(source);
        this.remark = remark;
    }
}
