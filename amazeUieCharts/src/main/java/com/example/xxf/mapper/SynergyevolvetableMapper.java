package com.example.xxf.mapper;

import com.example.xxf.bean.Synergyevolvetable;
import com.example.xxf.bean.SynergyevolvetableExample;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.example.xxf.bean.synergyEvolvePlug;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface SynergyevolvetableMapper {
    int countByExample(SynergyevolvetableExample example);

    int deleteByExample(SynergyevolvetableExample example);

    int insert(Synergyevolvetable record);

    int insertSelective(Synergyevolvetable record);

    List<Synergyevolvetable> selectByExample(SynergyevolvetableExample example);

    int updateByExampleSelective(@Param("record") Synergyevolvetable record, @Param("example") SynergyevolvetableExample example);

    int updateByExample(@Param("record") Synergyevolvetable record, @Param("example") SynergyevolvetableExample example);

    int batchSave(List<Synergyevolvetable> list);

    @Delete("delete from dbo.synergyEvolveTable")
    int deleteSynergyevolvetable();

    List<Synergyevolvetable> selectByExampleAndPage(Map<String,Object> map);
    int selectByExampleAndPageCount(Map<String,Object> map);

    synergyEvolvePlug pluginsBtn(Map<String,Object> map);

    /**
     * 导出Excel时获取数据的借口
     * @param map
     * @return
     */
    List<LinkedHashMap<String,Object>> getSynergyevolvetableExportExcel(Map<String,Object> map);

}