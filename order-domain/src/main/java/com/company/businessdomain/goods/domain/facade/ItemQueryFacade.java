package com.company.businessdomain.goods.domain.facade;

import com.company.businessdomain.goods.domain.model.Goods;
import com.company.businessdomain.goods.domain.repository.GoodsRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 商品查询器
 *
 * @author only
 * @since 2020-05-22
 */
@Component
public class ItemQueryFacade {
    /** 商品资源库 */
    @Resource
    private GoodsRepository goodsRepository;

    @Cacheable
    public Goods requireGoods(Long goodsId) {
        return goodsRepository.acquireGoods(goodsId);
    }
}
