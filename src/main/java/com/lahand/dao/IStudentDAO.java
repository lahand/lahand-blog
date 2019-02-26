/**
 * @author ws
 * @date 2019-02-26
 */
package com.lahand.dao;

import java.util.List;

import com.lahand.dao.model.Student;

public interface IStudentDAO {
    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 插入
     */
    int insert(Student record);

    /**
     * 查询
     */
    Student selectById(Integer id);

    /**
     * 查询
     */
    List<Student> selectByList(Student record);

    /**
     * 修改
     */
    int updateById(Student record);
}