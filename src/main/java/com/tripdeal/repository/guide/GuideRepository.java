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
    public int save( Guide guide) {
        return jdbcTemplate.update("insert into guide(guide_id, idCertificate, descriptionGuide, rate) values(?,?,?,?)",
              guide.getGuide_id(), guide.getIdCertificate(), guide.getDescriptionGuide(), guide.getRate());
    }

    @Override
    public int update(Guide guide) {
        return jdbcTemplate.update("update guide set rate = ? where guide_id = ?", guide.getRate() ,guide.getGuide_id()
                );
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from guide where guide_id = ?", id);
    }

    @Override
    public List findAll() {
        return jdbcTemplate.query(
                "select * from guide",
                (rs, rowNum) -> new Guide(
                        rs.getInt("guide_id"),
                        rs.getString("idCertificate"),
                        rs.getString("descriptionGuide"),
                        rs.getInt("rate")));
    }

    @Override
    public Optional findById(Long id) {
           return jdbcTemplate.queryForObject("SELECT * FROM guide WHERE guide_id = ?", new Object[]{id},(rs, rowNum) ->
                Optional.of(new Guide(
                        rs.getInt("guide_id"),
                        rs.getString("idCertificate"),
                        rs.getString("descriptionGuide"),
                        rs.getInt("rate"))));
    }
    }
