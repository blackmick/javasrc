package com.shawn.finance.fsmdemo.dao.typehandler;

import com.shawn.finance.fsmdemo.fsm.States;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shawn on 16/1/25.
 */
public class EnumStateTypeHandler implements TypeHandler<Object> {
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException{
        States s = (States)parameter;
        String value = Long.valueOf(s.getIdx()).toString();
        ps.setString(i, value);
    }

    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException{
        Long s = rs.getLong(columnName);
        return States.valueOf(s);
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException{
        Long s = rs.getLong(columnIndex);
        return States.valueOf(s);
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException{
        Long s = cs.getLong(columnIndex);
        return States.valueOf(s);
    }
}
