package com.shawn.finance.fsmdemo.dao.typehandler;

import com.shawn.finance.fsmdemo.fsm.Events;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shawn on 16/1/25.
 */
public class EnumEventTypeHandler implements TypeHandler<Object> {
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        Events e = (Events) parameter;
        String value = Long.valueOf(e.getIdx()).toString();
        ps.setString(i, value);
    }

    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException{
        Long s = rs.getLong(columnName);
        return Events.valueOf(s);
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException{
        Long s = rs.getLong(columnIndex);
        return Events.valueOf(s);
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException{
        Long s = cs.getLong(columnIndex);
        return Events.valueOf(s);
    }
}
