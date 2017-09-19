package homework3.service;

import homework3.dao.GoodsDao;
import homework3.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public boolean checkForAMatchInDataBase(String name, double price) {
        List<Goods> goodsByName = goodsDao.getGoodsByName(name);
        for (Goods goods : goodsByName){
            if (price == goods.getPrice()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean dataValidation(Goods goods) {
        if (priceValidation(goods.getPrice()) && nameValidation(goods.getName()) && merchantValidation(goods.getMerchant())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean priceValidation(double price) {
        if (price>0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean nameValidation(String name) {
        if (name.length()<20){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merchantValidation(String merchant) {
        if (merchant.length()<20){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void save(Goods goods) {
        if (dataValidation(goods) == false){
            System.out.println("incorrect data entered");
            return;
        }
        if (checkForAMatchInDataBase(goods.getName(), goods.getPrice())){
            goodsDao.update(goods);
        } else {
            goodsDao.save(goods);
        }
    }

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public List<Goods> getByName(String name) {
        return goodsDao.getGoodsByName(name);
    }

    @Override
    public List<Goods> getByPrice(double price) {
        return goodsDao.getGoodsByPrice(price);
    }

    @Override
    public List<Goods> getByMerchant(String merchant) {
        return goodsDao.getGoodsByMerchant(merchant);
    }

    @Override
    public Goods update(Goods newGoods) {
        if (dataValidation(newGoods) == false){
            System.out.println("incorrect data entered");
            return null;
        }
        return goodsDao.update(newGoods);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(id);
    }

    @Override
    public void delete(String name) {
        goodsDao.delete(name);
    }
}
