///**
// * Author: hjw
// * Data: 2018/4/18 10:02
// * Description: 测试导出数据库到Excel
// */
//package easypoi.demo.template;
//
//import cn.afterturn.easypoi.excel.ExcelExportUtil;
//import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
//import easypoi.demo.test.BudgetAccountsEntity;
//import easypoi.demo.test.PayeeEntity;
//import easypoi.demo.test.TemplateExcelExportEntity;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.assertj.core.util.Lists;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class TemplateExcelExportTest {
//    @Test
//    public void fe_map() throws Exception{
//        TemplateExportParams exportParams = new TemplateExportParams(
//                "WEB-INF/doc/专项支出用款申请书.xls");
//        exportParams.setHeadingStartRow(3);
//        exportParams.setHeadingRows(2);
//        Map<String, Object> map = new HashMap<String, Object>();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = new Date();
//        map.put("date",sdf.format(date));
//        map.put("money", 20000000.00);
//        map.put("upperMoney", "贰仟万");
//        map.put("company", "中古公司");
//        map.put("bureau", "财政局");
//        map.put("person", "Ian");
//        map.put("phone", "136****8439");
//
//        List<TemplateExcelExportEntity> list = new ArrayList<TemplateExcelExportEntity>();
//        for (int i = 0; i < 4; i++){
//            TemplateExcelExportEntity excelExportEntity = new TemplateExcelExportEntity();
//            //写入
//            excelExportEntity.setIndex(i + 1 + "");
//            excelExportEntity.setAccountType("能源项目");
//            excelExportEntity.setProjectName("Easypoi"+ i + "期");
//            excelExportEntity.setAmountApplied(i * 10000 + "");
//            excelExportEntity.setApprovedAmount((i + 1) * 10000 - 100 + "");
//
//            List<BudgetAccountsEntity> budgetAccounts = Lists.newArrayList();
//            for (int j = 0; j < 1; j++){
//                BudgetAccountsEntity accountsEntity = new BudgetAccountsEntity();
//                accountsEntity.setCode("001");
//                accountsEntity.setName("开发");
//                budgetAccounts.add(accountsEntity);//添加
////                accountsEntity = new BudgetAccountsEntity();//创建一个新的对象
////                accountsEntity.setCode("002");
////                accountsEntity.setName("设计");
////                budgetAccounts.add(accountsEntity);
//            }
//            excelExportEntity.setBudgetAccounts(budgetAccounts);//写入
//
//            PayeeEntity payeeEntity = new PayeeEntity();
//            payeeEntity.setName("小黄");
//            payeeEntity.setBankName("光大银行");
//            payeeEntity.setBankAccount("6222 0000 1234 1234");
//            excelExportEntity.setPayee(payeeEntity);//写入
//            list.add(excelExportEntity);//添加所有写入
//        }
//
//        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, TemplateExcelExportEntity.class,
//                            list,map);
//        File savefile = new File("F:/excel/");
//        //如果没有新建文件
//        if(!savefile.exists()){
//            savefile.mkdirs();
//        }
//        FileOutputStream fos = new FileOutputStream("F:/excel/专项支出用款申请书.xls");
//        workbook.write(fos);
//        fos.close();
//    }
//    @Test
//    public void fe_map2() throws Exception {
//        TemplateExportParams params = new TemplateExportParams(
//                "WEB-INF/doc/专项支出用款申请书_map.xls");
//        Map<String, Object> map = new HashMap<String, Object>();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = new Date();
//        map.put("date",sdf.format(date));
//        map.put("money", 20000000.00);
//        map.put("upperMoney", "贰仟万");
//        map.put("company", "中古公司");
//        map.put("bureau", "财政局");
//        map.put("person", "Ian");
//        map.put("phone", "136****8439");
//
//        List<TemplateExcelExportEntity> list = new ArrayList<TemplateExcelExportEntity>();
//        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
//        for (int i = 0; i < 4; i++) {
//            Map<String, String> lm = new HashMap<String, String>();
//            lm.put("id", i + 1 + "");
//            lm.put("zijin", i * 10000 + "");
//            lm.put("accountType", "能源开发");
//            lm.put("bianma", "A001");
//            lm.put("mingcheng", "设计");
//            lm.put("xiangmumingcheng", "EasyPoi " + i + "期");
//            lm.put("quancheng", "hjw");
//            lm.put("yinhang", "6222 0000 1234 1234");
//            lm.put("kaihu", "建设银行");
//            lm.put("quancheng", "hjw");
//            lm.put("sqje", i * 10000 + "");
//            lm.put("hdje", (i + 1) * 10000 - 100  + "");
//
//            listMap.add(lm);
//        }
//        map.put("maplist", listMap);
//
//
//        Workbook workbook = ExcelExportUtil.exportExcel(params,TemplateExcelExportEntity.class,
//                list, map);
//        File savefile = new File("F:/excel/");
//        if (!savefile.exists()) {
//            savefile.mkdirs();
//        }
//        FileOutputStream fos = new FileOutputStream("F:/excel/专项支出用款申请书_map3.xls");
//        workbook.write(fos);
//        fos.close();
//    }
//}
