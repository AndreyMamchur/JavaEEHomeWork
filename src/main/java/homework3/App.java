package homework3;

import homework3.config.SpringConfig;
import homework3.entity.Goods;
import homework3.service.GoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        GoodsService goodsService = context.getBean(GoodsService.class);
        Goods goods = new Goods();
        goods.setName("iPhone 7");
        goods.setPrice(18999);
        goods.setMerchant("APPLE");
        goodsService.save(goods);
     //   goodsService.delete(10);
        List<Goods> allGoods = goodsService.getAll();
        allGoods.forEach(System.out::println);
        System.out.println();

        System.out.println(goodsService.getById(5));
        System.out.println();
        System.out.println(goodsService.getByMerchant("Samsung"));
        System.out.println(goodsService.getByName("MOTO G4 (XT1622)"));
        System.out.println(goodsService.getByPrice(2899));
    }
}
