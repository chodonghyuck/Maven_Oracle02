package com.biz.oracle.exec;

import com.biz.oracle.service.StdService;
import com.biz.oracle.vo.StdVO;

public class OrExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdService ss = new StdService();

		ss.stdView(); // 학생 정보 전체를 보여주는 method

	//	ss.stdInsert();

	}

}
