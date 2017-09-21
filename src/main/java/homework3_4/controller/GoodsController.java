package homework3_4.controller;

import homework3_4.entity.Goods;
import homework3_4.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goods/{id}")
    public String getGoods(@PathVariable("id") int id, Model model){
        Goods goodsById = goodsService.getById(id);
        model.addAttribute("goods", goodsById);
        return "goods";
    }

    @GetMapping("/allGoods")
    public String showAllGoods(Model model){
        model.addAttribute("allGoods", goodsService.getAll());
        return "allGoods";
    }

    @GetMapping("/goods")
    public String addGoods(@RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("merchant") String merchant){
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        goods.setMerchant(merchant);
        goodsService.save(goods);
        return "redirect:allGoods";
    }

    @PostMapping("/newGoods")
    public String newGoods(@ModelAttribute Goods goods){
        goodsService.save(goods);
        return "redirect:allGoods";
    }

    @PostMapping("/deleteGoods")
    public String deleteGoods(@ModelAttribute("id") int id){
        goodsService.delete(id);
        return "redirect:/allGoods";
    }
}
