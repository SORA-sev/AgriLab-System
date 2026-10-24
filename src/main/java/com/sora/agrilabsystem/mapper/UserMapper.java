package com.sora.agrilabsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sora.agrilabsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}