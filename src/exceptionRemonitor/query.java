package exceptionRemonitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 

public class query {
	public static  String getCustOrderId(String Order){
		Connection conn =dbconnect.getconnect();
		String list = new String();
        String sql="SELECT ECS_ORDER_ID,CUST_ORDER_ID,substr(eo.common_region_id,0,3) FROM ESS_APP_PUB.ECS_ORDER EO WHERE EO.EXT_CUST_ORDER_ID=? ";
	    try
	    {
	PreparedStatement pre = conn.prepareStatement(sql);// 实例化预编译语句
	pre.setString(1, Order);
	ResultSet result = pre.executeQuery();
	while (result.next()){
		list=result.getString(3)+","+result.getString(2)+","+result.getString(1);
	}
	conn.close();
	    }catch (SQLException e1)
	    {e1.printStackTrace();  }
	    return list;
	}
}

