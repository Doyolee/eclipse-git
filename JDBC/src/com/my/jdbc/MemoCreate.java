package com.my.jdbc;
import java.sql.*;
//JDBC : Java Database Connectivity
//java 언어 <=== Driver[통역] ===>DB sql 언어
//JDBC Driver를 다운 받아야 한다. => DBMS마다 제공 드라이버 다름
//xxx.jar 파일로 제공됨

//프로젝트 선택-build path-configure-libraries
//-classpath- add libraries - external
public class MemoCreate {

	public static void main(String[] args) {
		//1. 드라이버 로딩
		try {
			// 예전버전 Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
		//2.DB 연결
			String url="jdbc:mysql://localhost:3306/schooldb?characterEncoding=UTF-8";
					//프로토콜:dbms유형://host:port/database
			String user="root", pwd="multi123";
			
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("DB연결 성공");
		//3. query문 작성하기	
			String sql="create table if not exists memo("
					+"idx int auto_increment primary key,"
					+"name varchar(20) not null,"
					+"msg varchar(100),"
					+"wdate datetime default now() )";
		//4. Statement 객체 얻어오기
			Statement stmt=con.createStatement();
		//5. sql 문 실행시키기
			stmt.execute(sql);
			System.out.println("Memo테이블 생성 성공(테이블은 1회만 생성 가능)");
		//6. db연결자원 해제
			stmt.close();
			con.close();

		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: "+e);		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
