package com.tripdeal.repository.guide;

import com.tripdeal.models.Guide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class GuideRepository implements  IGuideRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int save(int id, Guide guide) {
        return jdbcTemplate.update("insert into guide(user_id, idCertificate, descriptionGuide, rate) values(?,?,?,?)",
              id, guide.getIdCertificate(), guide.getDescriptionGuide(), guide.getRate());
    }

    @Override
    public int update(Guide guide) {
        return jdbcTemplate.update("update guide set rate = ? where user_id = ?", guide.getRate() ,guide.getUser_id()
                );
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from guide where user_id = ?", id);
    }

    @Override
    public List findAll() {
        return jdbcTemplate.query(
                "select * from user, guide where user.id = guide.user_id",
                (rs, rowNum) -> new Guide(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("city"),
                        rs.getString("country"),
                        rs.getString("phoneNum"),
                        rs.getString("idCertificate"),
                        rs.getString("descriptionGuide"),
                        rs.getInt("rate")));
    }

    @Override
    public Optional findById(Long id) {
           return jdbcTemplate.queryForObject("SELECT * FROM guide WHERE user_id = ?", new Object[]{id},(rs, rowNum) ->
                Optional.of(new Guide(
                        rs.getInt("user_id"),
                        rs.getString("idCertificate"),
                        rs.getString("descriptionGuide"),
                        rs.getInt("rate"))));
    }
    }
