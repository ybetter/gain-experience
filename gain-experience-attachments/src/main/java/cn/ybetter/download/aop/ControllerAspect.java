package cn.ybetter.download.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
@Slf4j
public class ControllerAspect {

    @Pointcut("execution(public * cn.ybetter.download.controller..*.*(..))")
    public void allController() {}

    @Before("allController()")
    public void beforeMethod() {
        System.out.println("方法调用前！");
    }


    @AfterThrowing(pointcut = "allController()", throwing = "ex")
    @ResponseBody
    public Map<String, Object> throwException(Throwable ex) {
        log.error(ex.getMessage());
        Map<String, Object> data = new HashMap<>();
        data.put("resCode", "faile");
        return data;
    }
}
