package exceptionRemonitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class cust4Gquery {
	public static void update(String orderlist){
		Connection jdbc_Connect_Oracle = null; 
		String msi_id=null;
		  String dbNbr=null;
		  if (orderlist.startsWith("844")){
			  jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
			  dbNbr="1";}
		  else if (orderlist.startsWith("832")){
			  jdbc_Connect_Oracle=db4Gconnection.getCrm0102GdJsDbConnection();
			  dbNbr="2";}
		  else if (orderlist.startsWith("851")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
			  dbNbr="3";}
		  else if (orderlist.startsWith("833")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0304ScZjDbConnection();
			  dbNbr="4";}
		  else if (orderlist.startsWith("834")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
			  dbNbr="5";}
		  else if (orderlist.startsWith("861")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0506AhSxDbConnection();
			  dbNbr="6";}
		  else if (orderlist.startsWith("835")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
			  dbNbr="7";}
		  else if (orderlist.startsWith("831")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm0708FjShDbConnection();
			  dbNbr="8";}
		  else if (orderlist.startsWith("813")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm09HbDbConnection();
			  dbNbr="9";}
		  else if (orderlist.startsWith("815")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm10NmDbConnection();
			  dbNbr="10";}
		  else if (orderlist.startsWith("843")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
			  dbNbr="11";}
		  else if (orderlist.startsWith("821")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1112HnLnDbConnection();
			  dbNbr="12";}
		  else if (orderlist.startsWith("842")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
			  dbNbr="13";}
		  else if (orderlist.startsWith("852")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1314HbGzDbConnection();
			  dbNbr="14";}
		  else if (orderlist.startsWith("837")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
			  dbNbr="15";}
		  else if (orderlist.startsWith("850")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1516SdCqDbConnection();
			  dbNbr="16";}
		  else if (orderlist.startsWith("865")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
			  dbNbr="17";}
		  else if (orderlist.startsWith("811")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1718XjBjDbConnection();
			  dbNbr="18";}
		  else if (orderlist.startsWith("812")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
			  dbNbr="19";}
		  else if (orderlist.startsWith("836")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm1920TjJxDbConnection();
			  dbNbr="20";}
		  else if (orderlist.startsWith("863")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
			  dbNbr="21";}
		  else if (orderlist.startsWith("862")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2122QhGsDbConnection();
			  dbNbr="22";}
		  else if (orderlist.startsWith("822")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
			  dbNbr="23";}
		  else if (orderlist.startsWith("841")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2324JlHnDbConnection();
			  dbNbr="24";}
		  else if (orderlist.startsWith("823")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
			  dbNbr="25";}
		  else if (orderlist.startsWith("853")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2526HlYnDbConnection();
			  dbNbr="26";}
		  else if (orderlist.startsWith("845")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
			  dbNbr="27";}
		  else if (orderlist.startsWith("814")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm2728GxSxDbConnection();
			  dbNbr="28";}
		  else if (orderlist.startsWith("846")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();
			  dbNbr="29";}
		  else if (orderlist.startsWith("864")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();
			  dbNbr="30";}
		  else if (orderlist.startsWith("854")){
			  jdbc_Connect_Oracle = db4Gconnection.getCrm293031HnNxXzDbConnection();
			  dbNbr="31";}
		 String EcsCustOrderId=orderlist.split(",")[2];
		try{
        String sql00="select msg_id  from ess_app_"+dbNbr+".ecs_order_2_msg a,ess_app_"+dbNbr+".ecs_const b,ess_app_"+dbNbr+".const_type c where a.msg_type_cd = b.value and b.const_type_cd = c.const_type_cd and c.type_code = 'MsgType' and a.msg_type_cd ='160' and a.ecs_order_id= '"+EcsCustOrderId+"' order by msg_id desc ";
        PreparedStatement pstmtX00 = jdbc_Connect_Oracle.prepareStatement(sql00);
    	//pstmtX00.setString(1, EcsCustOrderId);
    	ResultSet result00 = pstmtX00.executeQuery();
    	while(result00.next()){
    	msi_id=result00.getString(1);}
    	String sql1="insert into ess_app_"+dbNbr+".ecs_feedback_msg t (select * from ess_app_"+dbNbr+".ecs_feedback_msg_his a where a.msg_id =? ) ";
    	String sql2="delete from ess_app_"+dbNbr+".ecs_feedback_msg_his t where t.msg_id =? ";
    	String sql3="update ess_app_"+dbNbr+".ecs_feedback_msg t set t.deal_flag='Q' where t.msg_id=? ";
        PreparedStatement pstmtX1 = jdbc_Connect_Oracle.prepareStatement(sql1);
        pstmtX1.setString(1, msi_id);
        pstmtX1.executeUpdate();
        PreparedStatement pstmtX2 = jdbc_Connect_Oracle.prepareStatement(sql2);
        pstmtX2.setString(1, msi_id);
        pstmtX2.executeUpdate();
        PreparedStatement pstmtX3 = jdbc_Connect_Oracle.prepareStatement(sql3);
        pstmtX3.setString(1, msi_id);
        pstmtX3.executeUpdate();
		jdbc_Connect_Oracle.close();
		} catch (SQLException e1)
	    {e1.printStackTrace();   }  
        
	}
	
}

