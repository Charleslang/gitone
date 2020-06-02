package service;

import entity.Goods;
import mapper.GoodsMapper;

import java.util.ArrayList;
import java.util.List;

public class GoodsService {
    private GoodsMapper goodsMapper;

    public List<Goods> getAllGoods() {
        List<Goods> goodsList = new ArrayList<>();
        return goodsList;
    }

}
