package com.fk.gxwm.common.util.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.fk.gxwm.common.util.exception.ServiceException;
/**
 * 
* <p>Title:ServiceLogAop </p>
* <p>Description:Service层异常日志处理 </p>
* <p>Company: </p> 
* @author fangkun
* @date 2017年7月13日
 */
@Component
@Aspect
public class ServiceLogAop {
    private static Logger logger = Logger.getLogger(ServiceLogAop.class);
    
    @AfterThrowing(value="execution(* com.fk.gxwm.system.service.*.*(..))",throwing="ex")
    public void afterThrowing(JoinPoint joinPoint,ServiceException ex){
        //方法名
        String methodName = joinPoint.getSignature().getName();
        //System.out.println("method "+methodName+" occurs:"+ex);
        logger.error(ex.toString()+"-"+methodName);
    }

}
