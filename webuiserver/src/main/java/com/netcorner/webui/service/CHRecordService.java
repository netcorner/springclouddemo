package com.netcorner.webui.service;


import com.netcorner.webui.aop.MultiTransactional;
import com.netcorner.sqlmapper.SQLMap;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by shijiufeng on 2019/3/2.
 */
@Service
public class CHRecordService {

    @MultiTransactional
    //@Transactional(rollbackFor = Exception.class)
    public void test(){





        Map<String, Object> hash = new HashMap();
        SQLMap map;
        hash.put("a", "1");
        map = SQLMap.getMap("test.b");
        map.execute("add", hash);


        hash = new HashMap();
        hash.put("a", "aaa423a");
        hash.put("b", "12");
        map = SQLMap.getMap("test.a");
        map.execute("add", hash);

        hash = new HashMap();
        hash.put("a", "123");
        hash.put("b", "12");
        map = SQLMap.getMap("test.a");
        map.execute("add", hash);

        map = SQLMap.getMap("test.b");
        map.execute("add", hash);







//        Stack<DataSourceTransactionManager> dataSourceTransactionManagerStack = new Stack<DataSourceTransactionManager>();
//        Stack<TransactionStatus> transactionStatuStack = new Stack<TransactionStatus>();
//
//
//        DataSource testDataSource=(DataSource)SpringTools.getBean("testDataSource");
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(testDataSource);
//        dataSourceTransactionManagerStack.push(dataSourceTransactionManager);
//        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
//        TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(defaultTransactionDefinition);
//        transactionStatuStack.push(transactionStatus);
//
//        DataSource test1DataSource=(DataSource)SpringTools.getBean("test1DataSource");
//        dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(test1DataSource);
//        dataSourceTransactionManagerStack.push(dataSourceTransactionManager);
//        defaultTransactionDefinition = new DefaultTransactionDefinition();
//        transactionStatus = dataSourceTransactionManager.getTransaction(defaultTransactionDefinition);
//        transactionStatuStack.push(transactionStatus);
//
//
//        try {
//
//
//
//
//            Map<String, Object> hash = new HashMap();
//            SQLMap map;
//            hash.put("a", "1");
//            map = SQLMap.getMap("test.b");
//            map.execute("add", hash);
//
//
//            hash = new HashMap();
//            hash.put("a", "aaa423a");
//            hash.put("b", "12");
//            map = SQLMap.getMap("test.a");
//            map.execute("add", hash);
//
//            hash = new HashMap();
//            hash.put("a", "123");
//            hash.put("b", "89111111111111111111111111111189");
//            map = SQLMap.getMap("test.a");
//            map.execute("add", hash);
//
//            map = SQLMap.getMap("test.b");
//            map.execute("add1", hash);
//
//
//
////            JdbcTemplate jdbcTemplate = (JdbcTemplate) SpringTools.getObject("test");
////            jdbcTemplate.execute("insert into a(a) values('1212')");
////            JdbcTemplate jdbcTemplate2 = (JdbcTemplate) SpringTools.getObject("test1");
////            jdbcTemplate2.execute("insert into a(a) values('1111111111111111111111111111111111111')");
//
//
//            while (!dataSourceTransactionManagerStack.isEmpty()) {
//                dataSourceTransactionManagerStack.pop().commit(
//                        transactionStatuStack.pop());
//            }
//
//        }catch (Exception e){
//            while (!transactionStatuStack.isEmpty()) {
//                dataSourceTransactionManagerStack.pop().rollback(
//                        transactionStatuStack.pop());
//            }
//        }









    }
//    @Autowired
//    private CHRecordMapper chRecordMapper;
//    public List<Map<String,Object>>  weekSignalTimeRoomStat(Map<String,Object> params){
//        List<Map<String,Object>> list= chRecordMapper.weekSignalTimeRoomStat(params);
//        return list;
//    }
//    public PageInfo<Map<String,Object>>  finder(Map<String,Object> params){
//        PageHelper.startPage(1,2);
//        List<Map<String,Object>> list= chRecordMapper.finder(params);
//        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>(list);
//        return pageInfo;
//    }

}
