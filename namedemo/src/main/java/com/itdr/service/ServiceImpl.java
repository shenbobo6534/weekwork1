package com.itdr.service;

import com.itdr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl{

    @Autowired
    private UserDao userDao;



    public String dengLu(String username, String password) {
        if (username == null || "".equals(username)){
            return null;
        }

        if (password == null || "".equals(password)){
            return null;

        }

        String s = userDao.selectUsername(username);
        if (!s.equals(username)){
            return null;
        }

        String u = userDao.selectUsernameByPassword(username, password);
        if (u != null){
            return "登录成功";
        }
        return null;
    }

    public String jieGuo(String ming,String yue,String dong){
        if (ming == null || "".equals(ming)){
            return null;
        }
        if (yue == null || "".equals(yue)){
            return null;
        }
        if (dong == null || "".equals(dong)){
            return null;
        }

        String ming1 = userDao.ming(ming);
        String yue1 = userDao.yue(yue);
        String dong1 = userDao.dong(dong);
        if (ming1 == null || "".equals(ming1)){
            return null;
        }
        if (yue1 == null || "".equals(yue1)){
            return null;
        }
        if (dong1 == null || "".equals(dong1)){
            return null;
        }
        String jie = ming1+yue1+dong1;
        return jie;
    }
}
