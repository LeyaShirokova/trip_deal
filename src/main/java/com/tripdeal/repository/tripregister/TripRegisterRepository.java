package com.tripdeal.repository.tripregister;

import com.tripdeal.models.TripRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TripRegisterRepository implements ITripRegisterRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int save(TripRegister tripRegister) {
        return jdbcTemplate.update("insert into trip_register(id,trip_id,nameTrip,dateOfTrip,levelOfDifficulty) values(?,?,?,?,?)",
                tripRegister.getId(),tripRegister.getTrip_id(),tripRegister.getNameTrip(), tripRegister.getDateOfTrip(), tripRegister.getLevelOfTrip());
    }

    @Override
    public int update(TripRegister tripRegister) {
        return jdbcTemplate.update("update trip_register set dateOfTrip =? where id = ?",tripRegister.getDateOfTrip(),tripRegister.getId());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from trip_register where trip_id =?",id);
    }

    @Override
    public List findAll() {
        return jdbcTemplate.query("select * from trip_register",
                (rs, rowNum) -> new TripRegister(
                        rs.getInt("trip_id"),
                        rs.getInt("id"),
                        rs.getString("nameTrip"),
                        rs.getDate("dateOfTrip"),
                        rs.getInt("levelOfDifficulty")
                ));
    }

    @Override
    public Optional findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM trip_register WHERE trip_id = ?", new Object[]{id},(rs, rowNum) ->
                Optional.of(new TripRegister(
                        rs.getInt("id"),
                        rs.getInt("trip_id"),
                        rs.getString("nameTrip"),
                        rs.getDate("dateOfTrip"),
                        rs.getInt("levelOfDifficulty"))));
    }
}
