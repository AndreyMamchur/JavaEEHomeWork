package homework3.service;

import homework3.dao.GoodsDao;
import homework3.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }
}
