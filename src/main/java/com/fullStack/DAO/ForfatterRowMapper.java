package com.fullStack.DAO;

import com.fullStack.Entities.Bok;
import com.fullStack.Entities.Forfatter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ForfatterRowMapper implements RowMapper<Forfatter> {

    @Override
    public Forfatter mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Forfatter forfatter = new Forfatter();

        forfatter.setNavn(rs.getString("navn"));
        forfatter.setID(rs.getInt("id"));
        forfatter.setFoedselsAar(rs.getInt("foedselsAar"));
        return forfatter;

    }
}
