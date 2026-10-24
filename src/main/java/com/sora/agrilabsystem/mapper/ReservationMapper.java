package com.sora.agrilabsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sora.agrilabsystem.entity.Reservation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper extends BaseMapper<Reservation> {
}