package MTVA.listener;

import MTVA.Event.UserEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener implements ApplicationListener<UserEvent> {

    @Override
    public void onApplicationEvent(UserEvent userEvent) {
        System.out.println(userEvent.getRemark());
    }
}
