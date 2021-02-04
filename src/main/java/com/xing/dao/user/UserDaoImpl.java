package com.xing.dao.user;

import com.xing.dao.BaseDao;
import com.xing.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    //得到登录的用户
    public User getLoginUser(Connection connection, String userCode) throws Exception {

        PreparedStatement pstm=null;
        ResultSet rs=null;
        User user=null;

        if(connection!=null){
            String sql="select * from smbms_user where userCode=?";
            Object[] params={userCode};


                rs = BaseDao.execute(connection, pstm, rs, sql, params);


                if (rs.next()){
                    user=new User();
                    user.setId(rs.getInt("id"));
                    user.setUserCode(rs.getString("userCode"));
                    user.setUserName(rs.getString("userName"));
                    user.setUserPassword(rs.getString("userPassword"));
                    user.setGender(rs.getInt("gender"));
                    user.setBirthday(rs.getDate("birthday"));
                    user.setPhone(rs.getString("phone"));
                    user.setAddress(rs.getString("address"));
                    user.setUserRole(rs.getInt("userRole"));
                    user.setCreatedBy(rs.getInt("createdBy"));
                    user.setCreationDate(rs.getDate("creationDate"));
                    user.setModifyBy(rs.getInt("modifyBy"));
                    user.setModifyDate(rs.getDate("modifyDate"));
                }
                BaseDao.closeResource(null,pstm,rs);
        }
        return user;




    }
}
