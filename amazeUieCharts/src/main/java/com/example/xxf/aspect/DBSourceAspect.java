package com.example.xxf.aspect;


import com.example.xxf.annotation.DBSource;
import com.example.xxf.comms.DbContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DBSourceAspect {


    @Around("execution(* com.example.xxf.service.*.*(..)) && @annotation(dbs)")
    public Object around(ProceedingJoinPoint pjp, DBSource dbs)throws Throwable{
        Object ret = null;
        try {
            //Method method = ((MethodSignature)pjp.getSignature()).getMethod();
            //DBSource dbSource =  method.getAnnotation(DBSource.class);
            //DBSource dbSource  = pjp.getTarget().getClass().getAnnotation(DBSource.class);//获取类上面的注解
            String dataSourceKey = dbs.source();
            System.out.println("-------@Around切换数据源----"+dataSourceKey+"---");
            DbContextHolder.setDbType(dataSourceKey);
            ret = pjp.proceed();
        } catch (Exception e) {

            throw e;
        }finally{
            DbContextHolder.setDbType(null);
            System.out.println("-------@Around恢复数据源-------");
        }
        return ret;

    }
}