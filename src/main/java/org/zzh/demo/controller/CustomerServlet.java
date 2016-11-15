package org.zzh.demo.controller;

import org.zzh.demo.model.Customer;
import org.zzh.demo.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 25162 on 2016/11/6.
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService;

    public void init() throws ServletException {
        customerService=new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        List<Customer> customerList = customerService.getCustomerList();
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
