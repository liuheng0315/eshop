package com.roncoo.eshop.inventory.service;

import com.roncoo.eshop.inventory.model.ProductInventory;

public interface ProductInventoryService {
    /**
     * 更新商品库存
     */
    void updateProductInventory(ProductInventory productInventory);
    /**
     * 删除Redis中商品库存的缓存
     */
    void removeProductInventoryCache(ProductInventory productInventory);
    /**
     * 根据商品id查询商品库存
     */
    ProductInventory findProductInventory(Integer productId);
    /**
     * 设置商品库存中的缓存
     */
    void setProductInventoryCache(ProductInventory productInventory);

    /**
     * 获取商品库存的缓存
     * @param productId
     * @return
     */
    ProductInventory getProductInventoryCache(Integer productId);
}
