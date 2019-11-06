package com.damon.payment.mapper;

import com.damon.payment.model.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;



@Mapper
public interface PaymentMapper {
	
	
	@Insert("insert into payment(courseId,userName,mentorName) values(#{courseId},#{userName},#{mentorName})")
	@SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
	void addPayment(Payment payment);

}
