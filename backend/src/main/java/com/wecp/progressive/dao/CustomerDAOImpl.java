package com.wecp.progressive.dao;

import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public int addCustomer(Customers customers) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
        return -1;
    }

    @Override
    public Customers getCustomerById(int customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
        return null;
    }

    @Override
    public void updateCustomer(Customers customers) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
        return null;
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerAccountInfo'");
        return null;
    }

}
