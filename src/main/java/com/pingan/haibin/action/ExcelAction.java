package com.pingan.haibin.action;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ExcelAction {
	
    //创建Excel
    @RequestMapping("/excel")
    public String createExcel(HttpServletResponse response) throws IOException {

        //创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();
//建立新的sheet对象（excel的表单）
        HSSFSheet sheet=wb.createSheet("成绩表");
//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
        HSSFRow row1=sheet.createRow(0);
//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        HSSFCell cell=row1.createCell(0);
        //设置单元格内容
        cell.setCellValue("学员考试成绩一览表");
//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
//在sheet里创建第二行
        HSSFRow row2=sheet.createRow(1);
        //创建单元格并设置单元格内容
        row2.createCell(0).setCellValue("姓名");
        row2.createCell(1).setCellValue("班级");
        row2.createCell(2).setCellValue("笔试成绩");
        row2.createCell(3).setCellValue("机试成绩");
        
        HSSFCellStyle hssfCellStyleDouble = wb.createCellStyle();
        HSSFDataFormat df = wb.createDataFormat(); // 此处设置数据格式
       // hssfCellStyleDouble.setDataFormat(df.getBuiltinFormat("#,##0.00"));
        hssfCellStyleDouble.setDataFormat(df.getBuiltinFormat("0.00"));
        
        
        //在sheet里创建第三行
        HSSFRow row3=sheet.createRow(2);
        row3.createCell(0).setCellValue("李明");
        row3.createCell(1).setCellValue("As178");
        
        HSSFCell cell2 = row3.createCell(2);
        cell2.setCellValue(536000000);
        cell2.setCellStyle(hssfCellStyleDouble);
        
       HSSFCell cell3 = row3.createCell(3);
       cell3.setCellStyle(hssfCellStyleDouble);
       cell3.setCellValue(536000000.1);
      

        //.....省略部分代码


//输出Excel文件
        OutputStream output=response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment; filename=details.xls");
        response.setContentType("application/msexcel");
        wb.write(output);
        output.close();
        return null;
    }
    
    
    
    //创建Excel
    @RequestMapping("/excel2")
    public String createExcel2(HttpServletResponse response) throws IOException {

        //创建HSSFWorkbook对象(excel的文档对象)
        SXSSFWorkbook wb = new SXSSFWorkbook();
//建立新的sheet对象（excel的表单）
        SXSSFSheet sheet=(SXSSFSheet) wb.createSheet("成绩表");
//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
        SXSSFRow row1=(SXSSFRow) sheet.createRow(0);
//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        SXSSFCell cell=(SXSSFCell) row1.createCell(0);
        //设置单元格内容
        cell.setCellValue("学员考试成绩一览表");
//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
//在sheet里创建第二行
        SXSSFRow row2=(SXSSFRow) sheet.createRow(1);
        //创建单元格并设置单元格内容
        row2.createCell(0).setCellValue("姓名");
        row2.createCell(1).setCellValue("班级");
        row2.createCell(2).setCellValue("笔试成绩");
        row2.createCell(3).setCellValue("机试成绩");
        
        CellStyle hssfCellStyleDouble = wb.createCellStyle();
        DataFormat df = wb.createDataFormat(); // 此处设置数据格式
       // hssfCellStyleDouble.setDataFormat(df.getBuiltinFormat("#,##0.00"));
        hssfCellStyleDouble.setDataFormat(df.getFormat("0.00"));
        
        
        //在sheet里创建第三行
        SXSSFRow row3=(SXSSFRow) sheet.createRow(2);
        row3.createCell(0).setCellValue("李明");
        row3.createCell(1).setCellValue("As178");
        
        SXSSFCell cell2 = (SXSSFCell) row3.createCell(2);
        cell2.setCellValue(536000001);
        cell2.setCellStyle(hssfCellStyleDouble);
        
       SXSSFCell cell3 = (SXSSFCell) row3.createCell(3);
       cell3.setCellStyle(hssfCellStyleDouble);
       cell3.setCellValue(536000020.1);
      

        //.....省略部分代码


//输出Excel文件
        OutputStream output=response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment; filename=details.xlsx");
        response.setContentType("application/ms-excel");
        wb.write(output);
        output.flush();
        output.close();
        return null;
    }
    
    
}
