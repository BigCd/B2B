package com.imooc.o2o.dao;


import com.imooc.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * 通过shop id 查询店铺
	 * 
	 * @param shopId
	 * @return shop
	 */
	Shop queryByShopId(long shopId);


}
