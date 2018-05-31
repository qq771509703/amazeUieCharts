package com.example.xxf.Listener;

import com.example.xxf.bean.Forsalecarbase;
import com.example.xxf.bean.ForsalecarbaseExample;
import com.example.xxf.bean.Forsalecardetail;
import com.example.xxf.bean.ForsalecardetailExample;
import com.example.xxf.comms.Config;
import com.example.xxf.service.ForsalecarbaseService;
import com.example.xxf.service.ForsalecardetailService;
import com.example.xxf.task.DataSyncToLocal;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

public class ContextListener implements ServletContextListener {

    @Autowired
    ForsalecarbaseService forsalecarbaseService;

    @Autowired
    ForsalecardetailService forsalecardetailService;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
       int count = forsalecarbaseService.countByExample(new ForsalecarbaseExample());
        if (count==0){
            insetForsalecarbase();
        }
        count = forsalecardetailService.countByExample(new ForsalecardetailExample());
        if (count==0){
            insetForsalecardetail();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
    public  boolean insetForsalecarbase(){
        boolean res = false;
        int insertCount = 0;
        try{

            forsalecarbaseService.deleteByExample(new ForsalecarbaseExample());
            System.out.println("删除数据表forSaleCarBase - 成功");
            int limit = 50;
            int count = forsalecarbaseService.getForsalecarbaseCountByXXFDB();
            int index = count/limit+1;
            int offset = 0;
            int end = 0;
            for (int j = 0; j < index; j++) {
                offset = (j+1-1)*limit+1;
                end = limit*(j+1);
                List<Forsalecarbase> list = forsalecarbaseService.getForsalecarbaseByXXFDB(offset,end);
                insertCount = insertCount + forsalecarbaseService.batchInsert(list);
                System.out.println("insertCount:"+insertCount);
            }
            if (insertCount != count){
                res = true;
            }

        }catch(Exception e){
            res = true;
            e.printStackTrace();
        }
        return res;
    }

    public  boolean insetForsalecardetail(){
        boolean res = false;
        int insertCount = 0;
        try{

            forsalecardetailService.deleteForsalecardetail();
            System.out.println("删除数据表 - 成功");
            int limit = 50;
            int count = forsalecardetailService.getForsalecardetailCountByXXFDB("");
            int index = count/limit+1;
            int offset = 0;
            int end = 0;
            for (int j = 0; j < index; j++) {
                offset = (j+1-1)*limit+1;
                end = limit*(j+1);
                List<Forsalecardetail> list = forsalecardetailService.getForsalecardetailByXXFDB("",offset,end);
                insertCount = insertCount + forsalecardetailService.batchInsert(list);
                System.out.println("insertCount:"+insertCount);
            }
            if (insertCount != count){
                res = true;
            }

        }catch(Exception e){
            res = true;
            e.printStackTrace();
        }
        return res;
    }

}