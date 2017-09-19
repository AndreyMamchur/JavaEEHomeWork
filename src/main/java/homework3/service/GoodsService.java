package homework3.service;

import homework3.entity.Goods;

import java.util.List;

public interface GoodsService {

    int checkForAMatchInDataBase(String name, double price);

    boolean dataValidation (Goods goods);

    boolean priceValidation(double price);

    boolean nameValidation(String name);

    boolean merchantValidation(String merchant);

    void save(Goods goods);

    Goods getById (int id);

    List<Goods> getByName(String name);

    List<Goods> getByPrice(double price);

    List<Goods> getByMerchant(String merchant);

    Goods update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);
}
