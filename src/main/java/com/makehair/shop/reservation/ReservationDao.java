package com.makehair.shop.reservation;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.makehair.shop.common.constants.DayOffVo;
import com.makehair.shop.common.constants.ReservationVo;
import com.makehair.shop.common.constants.ServiceVo;


@Repository
public interface ReservationDao {
	
	public List<DayOffVo> checkDayOff(ReservationVo reservationVo);

	public List<ServiceVo> allService();
	
	public int checkReservation(ReservationVo reservationVo);

	public int checkDuplicateReservation(ReservationVo reservationVo);
	
	public int insertReservation(ReservationVo reservationVo);
	
	public int deleteReservation(ReservationVo reservationVo);
}
