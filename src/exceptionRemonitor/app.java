package exceptionRemonitor;


public class app {
	public static void main(String[] args) {
	 String[] order=readtxt.Readfile();
	  for (int i=0;i<order.length;i++){
		  System.out.println(order[i]); 
		  String orderlist= query.getCustOrderId(order[i]);
		  System.out.println(orderlist); 
		  cust4Gquery.update(orderlist);
		  System.out.println("已重推门户完毕！");
	  }
}
}
