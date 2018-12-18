package MTVA.Aspect;


import MTVA.Entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class UserAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * MTVA.Controller.UserController.add(..))")
    private void addUserPoint() {
        // 添加新用户的切入点
    }

    @Pointcut("execution(public * MTVA.Controller.UserController.findAll(..))")
    private void findUserAll() {
        // 查询全部用户
    }

    @Before("findUserAll()")
    private void findUserAlldoBefore(JoinPoint point) {

        logger.info("记录----查询全部用户");
    }

    @Before("addUserPoint()")
    private void doBefore(JoinPoint point) {
        logger.info("记录----添加新用户之前");
    }

    @AfterReturning(returning = "user", pointcut = "addUserPoint()")
    public void afterAddUser(JoinPoint point,User user) {
        logger.info("记录----添加新用户"+user.getName());
    }
}
