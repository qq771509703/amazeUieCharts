package com.example.xxf.task;

import com.example.xxf.bean.*;
import com.example.xxf.comms.Config;
import com.example.xxf.service.ForsalecarbaseService;
import com.example.xxf.service.ForsalecardetailService;
import com.example.xxf.service.PerCapitaCapacityService;
import com.example.xxf.service.SynergyEvolveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class DataSyncToLocal {

    @Autowired
    SynergyEvolveService synergyEvolveService;

    @Autowired
    PerCapitaCapacityService perCapitaCapacityService;

    @Autowired
    ForsalecarbaseService forsalecarbaseService;

    @Autowired
    ForsalecardetailService forsalecardetailService;


    @Scheduled(cron = "0 */50 * * * ?")
    public void work1(){
        if (2==1){
            return;
        }
       boolean re = insertSynergyevolvetable();

        if (re){
            insertSynergyevolvetable();
        }else {
            System.out.println("插入数据表Synergyevolvetable - 成功");
            Config.synergyevolvetable_status = 1;
        }
    }

    @Scheduled(cron = "0 */53 * * * ?")
    public void work2(){
        if (2==1){
            return;
        }
        boolean re = insertperCapitaCapacityTable();
        if (re){
            insertperCapitaCapacityTable();
        }else {
            System.out.println("插入数据表perCapitaCapacityTable - 成功");
            Config.perCapitaCapacityetable_status = 1;
        }
    }

    @Scheduled(cron = "0 */54 * * * ?")
    public void work3(){
        if (1==2){
            return;
        }
        boolean re = insetForsalecarbase();
        if (re){
            insetForsalecarbase();
        }else {
            System.out.println("插入数据表forSaleCarBase - 成功");
            Config.forsalecarbasetable_status = 1;
        }
    }

    @Scheduled(cron = "0 */55 * * * ?")
    public void work4(){
        if (1==2){
            return;
        }
        boolean re = insetForsalecardetail();
        if (re){
            insetForsalecardetail();
        }else {
            System.out.println("插入数据表 - 成功");
            Config.forsalecardetailtable_status = 1;
        }
    }

    public  boolean  insertSynergyevolvetable(){
        SynergyevolvetableExample example = new SynergyevolvetableExample();
        boolean res = false;
        int insertCount = 0;
        try{
            Config.synergyevolvetable_status = 0;
            synergyEvolveService.deleteByExample(example);
            System.out.println("删除数据表Synergyevolvetable - 成功");
            int limit = 50;
            int count = (int)synergyEvolveService.getSynergyEvolveTableByBaseCount();
            int index = count/limit+1;
            int offset = 0;
            int end = 0;
            for (int j = 0; j < index; j++) {
                offset = (j+1-1)*limit+1;
                System.out.println("offset="+offset);
                System.out.println("end="+limit*(j+1));
                end = limit*(j+1);
                List<Synergyevolvetable> list = synergyEvolveService.getSynergyEvolveTableByBase(offset,end);
                insertCount = insertCount + synergyEvolveService.batchSave(list);
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

    public  boolean insertperCapitaCapacityTable(){
        boolean res = false;
        int insertCount = 0;
        try{
            Config.perCapitaCapacityetable_status = 0;
            perCapitaCapacityService.deletePerCapitaCapacity();
            System.out.println("删除数据表perCapitaCapacityTable - 成功");
            int limit = 50;
            int count = perCapitaCapacityService.getPerCapitaCapacityListByBaseCount();
            int index = count/limit+1;
            int offset = 0;
            int end = 0;
            for (int j = 0; j < index; j++) {
                offset = (j+1-1)*limit+1;
                end = limit*(j+1);
                List<perCapitaCapacity> list = perCapitaCapacityService.getPerCapitaCapacityListByBase(offset,end);
                insertCount = insertCount + perCapitaCapacityService.batchSave(list);
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

    public  boolean insetForsalecarbase(){
        boolean res = false;
        int insertCount = 0;
        try{
            Config.forsalecarbasetable_status = 0;
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
            Config.forsalecardetailtable_status = 0;
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