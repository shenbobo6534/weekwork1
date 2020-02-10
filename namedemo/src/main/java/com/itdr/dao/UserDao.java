
package com.itdr.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public String selectUsername(String username) {
        String sql = "SELECT username FROM user WHERE username=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, username);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                return (String) map.get(u);
            }
        }
        return null;
    }

    public String selectUsernameByPassword(String username, String password) {
        String sql = "SELECT username,password FROM user WHERE username=? AND password=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, username, password);
        for (Map<String, Object> map : maps) {
            for (String u : map.keySet()) {
                return (String) map.get(u);
            }
        }
        return null;
    }

    public String ming(String ming){
        if (ming.equals("鸡")){
            return "苏";
        }
        if (ming.equals("马")){
            return "顾";
        }
        if (ming.equals("羊")){
            return "夏";
        }
        if (ming.equals("兔")){
            return "陌";
        }
        if (ming.equals("龙")){
            return "夜";
        }
        if (ming.equals("鼠")){
            return "上官";
        }
        if (ming.equals("猪")){
            return "慕";
        }
        if (ming.equals("猴")){
            return "楚";
        }
        if (ming.equals("蛇")){
            return "陆";
        }
        if (ming.equals("狗")){
            return "程";
        }
        if (ming.equals("牛")){
            return "浴";
        }
        if (ming.equals("虎")){
            return "玉";
        }
        return null;
    }
    public String yue(String yue){
        if (yue.equals("1")){
            return "小";
        }
        if (yue.equals("2")){
            return "棂";
        }
        if (yue.equals("3")){
            return "玥";
        }
        if (yue.equals("4")){
            return "浅";
        }
        if (yue.equals("5")){
            return "瑾";
        }
        if (yue.equals("6")){
            return "颜";
        }
        if (yue.equals("7")){
            return "曦";
        }
        if (yue.equals("8")){
            return "夭";
        }
        if (yue.equals("9")){
            return "眠";
        }
        if (yue.equals("10")){
            return "晴";
        }
        if (yue.equals("11")){
            return "莹";
        }
        if (yue.equals("12")){
            return "瑶";
        }
        return null;
    }
    public String dong(String dong){
        if (dong.equals("白羊座")){
            return "浅";
        }
        if (dong.equals("金牛座")){
            return "姬";
        }
        if (dong.equals("巨蟹座")){
            return "盈";
        }
        if (dong.equals("天蝎座")){
            return "晞";
        }
        if (dong.equals("双子座")){
            return "儿";
        }
        if (dong.equals("射手座")){
            return "璃";
        }
        if (dong.equals("狮子座")){
            return "衣";
        }
        if (dong.equals("处女座")){
            return "仪";
        }
        if (dong.equals("天秤座")){
            return "之";
        }
        if (dong.equals("双鱼座")){
            return "绯";
        }
        if (dong.equals("水瓶座")){
            return "色";
        }
        if (dong.equals("摩羯座")){
            return "蓉";
        }
        return null;
    }
}

