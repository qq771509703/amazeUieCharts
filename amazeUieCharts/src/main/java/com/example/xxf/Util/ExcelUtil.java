package com.example.xxf.Util;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class ExcelUtil {
    /**
     * 导出Excel
     * @param listMap 需要导出的数据
     * @param titles  excel第一行
     * @param s_type  excel文件名
     * @param response
     */
    public static void exportExcel (List < LinkedHashMap < String, Object >> listMap, String[]titles, String
                                        s_type, HttpServletResponse response) throws Exception {
            synchronized (ExcelUtil.class) {

                //创建HSSFWorkbook对象(excel的文档对象)
                HSSFWorkbook wb = new HSSFWorkbook();
                //建立新的sheet对象（excel的表单）
                HSSFSheet sheet = wb.createSheet("sheet1");
                for (int i = 0; i < 9; i++) {
                    sheet.setColumnWidth(i, 5000);
                }
                //在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
//		HSSFRow row1=sheet.createRow(0);
//		row1.setHeightInPoints(30);
                //row1.setHeightInPoints(30);
                //创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//		HSSFCell cell=row1.createCell(0);
//		      //设置单元格内容
//		cell.setCellValue("奖励金额");
//		//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
//		sheet.addMergedRegion(new CellRangeAddress(0,0,0,10));

                HSSFRow row2 = sheet.createRow(0);
                row2.setHeightInPoints(30);

                for (int i = 0; i < titles.length; i++) {
                    row2.createCell(i).setCellValue(titles[i]);
                }

                Map<String, Object> map = new HashMap<>();
                String key = "";
                Object val = "";

                for (int i = 0; i < listMap.size(); i++) {
                    HSSFRow hRow = sheet.createRow(i + 1);


                    Map<String, Object> valMap = new HashMap<>();
                    map = listMap.get(i);
                    if (map != null) {
                        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                        int c = 0;
                        int d = 0;
                        while (it.hasNext()) {
                            Map.Entry<String, Object> entry = it.next();
                            key = entry.getKey();
                            val = entry.getValue();
//                    if (i==0){
////                        System.out.println("key----->"+key);
////                        System.out.println("c----->"+c);
//                        row2.createCell(c).setCellValue(key);
//                        c = c+1;
//                    }
                            hRow.createCell(d).setCellValue(val == null ? "" : val.toString());
                            d = d + 1;

                        }
                    }
                }

                //输出Excel文件
                OutputStream output;
                try {
                    String fileName = "";
                    output = response.getOutputStream();

                    fileName = s_type + DatetimeUtil.parseToString(
                            new Date(), DatetimeUtil.DATETIME_FORMAT) + ".xls";
                    response.reset();

                    response.setHeader("Content-disposition", "attachment; filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
                    response.setContentType("application/msexcel");
                    wb.write(output);
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

}