package MTVA.Controller;

import MTVA.Entity.User;
import MTVA.Event.UserEvent;
import MTVA.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public Object findAll(){
        return userRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Object findById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @RequestMapping("/add")
    public User add(){
        User user = User.builder().name("jiangbo").email("798341797@qq.com").build();
        userRepository.save(user);
        applicationContext.publishEvent(new UserEvent(user,"添加新的用户"));
        return user;
    }

}
