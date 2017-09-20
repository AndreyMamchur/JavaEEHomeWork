package homework3_4.dao;

import homework3_4.entity.Goods;

import java.util.List;

public interface GoodsDao {
    void save(Goods goods);

    Goods getGoodsById(int id);

    List<Goods> getGoodsByName(String name);

    List<Goods> getGoodsByPrice(double price);

    List<Goods> getGoodsByMerchant(String merchant);

    Goods update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);
}
