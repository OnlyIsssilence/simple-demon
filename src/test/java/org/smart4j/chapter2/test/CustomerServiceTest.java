package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:
 */
public class CustomerServiceTest {

    private final CustomerService customerService;
    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        // TODO: 2016/8/24 初始化数据库
    }

    @Test
    public void getCustomerList()throws Exception{
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }

    @Test
    public void getCustomerTest()throws Exception{

        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest()throws Exception{
        Map<String,Object> fieldMap = new HashMap<String,Object>();

        fieldMap.put("name", "xiaoxiao");
        fieldMap.put("contact","john");
        fieldMap.put("telephone","15926213333");

        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest()throws Exception{
        long id = 1;
        Map<String,Object> fieldMap = new HashMap<>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest()throws Exception{
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}






























