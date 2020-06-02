package controller;

import entity.Goods;
import service.GoodsService;

import java.util.ArrayList;
import java.util.List;

public class GoodsController {

    private GoodsService goodsService;

    public List<Goods> getAllGoods() {
        List<Goods> goodsList = new ArrayList<>();
        return goodsList;
    }
}
