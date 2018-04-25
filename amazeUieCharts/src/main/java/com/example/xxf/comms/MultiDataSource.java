package com.example.xxf.comms;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

	public class MultiDataSource extends AbstractRoutingDataSource  
	{

		@Override
		protected Object determineCurrentLookupKey() {
			// TODO Auto-generated method stub
			return DbContextHolder.getDbType();
		}  
	  
//		 private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();
//
//		    public static void setDataSourceKey(String dataSource) {
//		    	if (dataSource.equals("")) {
//		    		dataSourceKey.set("ds");
//				}else {
//					dataSourceKey.set(dataSource);
//				}
//		        
//		    }
//
//		    @Override
//		    protected Object determineCurrentLookupKey() {
//		    	System.out.println("查看数据源--------------------");
//		        return dataSourceKey.get();
//		    }
//		
		
}

