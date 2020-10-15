package com.tripdeal.repository.customer;

import com.tripdeal.models.Customer;
import com.tripdeal.models.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CustomerRepository implements ICustomerRepository{
    @Autowired
   JdbcTemplate jdbcTemplate;
    @Override
    public int save(int id, Customer customer) {
        return jdbcTemplate.update("insert into customer(customer_id, dateofBirth) values (?,?)",
                customer.getCustomer_id(), customer.getDateOfBirth());
    }

    @Override
    public int update(Customer customer) {
        return jdbcTemplate.update("update customer set dateOfBirth = ? where customer_id =?",customer.getDateOfBirth(), customer.getCustomer_id());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from customer where customer_id =?", id);
    }

    @Override
    public List findAll() {
        return jdbcTemplate.query("select * from user,customer where user.id = customer.customer_id",
                (rs, rowNum) ->new Customer(rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("city"),
                        rs.getString("country"),
                        rs.getString("phoneNum"),
                        rs.getDate("dateOfBirthday")));
    }

    @Override
    public Optional findById(Long id) {
        return  jdbcTemplate.queryForObject("SELECT * FROM customer WHERE customer_id = ?", new Object[]{id},(rs, rowNum) ->
                Optional.of(new Customer(
                        rs.getInt("customerId"),
                        rs.getDate("dateOfBirth"))));
    }
}
