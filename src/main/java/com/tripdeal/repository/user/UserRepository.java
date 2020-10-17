package com.tripdeal.repository.user;

import com.tripdeal.models.User;
import com.tripdeal.repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("insert into user (firstName, lastName, email, password, city, country, phoneNum) values(?,?,?,?,?,?,?)",
                user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getCity(), user.getCountry(), user.getPhoneNum());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("update user set firstName =?, lastName =?, password = ?, city =?, country=?, phoneNum =? where id = ?", user.getFirstName(), user.getLastName(), user.getPassword(), user.getCity(), user.getCountry(), user.getPhoneNum(), user.getId());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from user where id = ?", id);
    }

    @Override
    public List findAll() {
        return jdbcTemplate.query("select * from user",
                (rs, rowNum) -> new User(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("city"),
                        rs.getString("country"),
                        rs.getString("phoneNum")));
    }

    @Override
    public Optional findById(Long id) {
        return jdbcTemplate.queryForObject("select * from user where id = ?", new Object[]{id}, (rs, rowNum) ->
                Optional.of(new User(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("city"),
                        rs.getString("country"),
                        rs.getString("phoneNum"))));
    }
}
