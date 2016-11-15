package org.zzh.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zzh.demo.helper.DatabaseHelper;
import org.zzh.demo.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 25162 on 2016/10/19.
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList(){
            String sql = "select * from customer";
            return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    public Customer getCustomer(long id){
        return null;
    }

    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
