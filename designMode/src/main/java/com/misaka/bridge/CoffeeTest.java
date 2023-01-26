package com.misaka.bridge;
/*
* 在讲策略模式的时候，王二狗和牛翠花不是要到天津之眼去约炮，不，约会嘛，两人到那后先去星巴克喝咖啡了
* ，星巴克提供了多种选择，从容量上说有大杯，中杯，小杯，从口味上说有原味，加糖，这可难为了有选择恐惧症的牛翠花，
* 半天点不出来，后面的人都开始骂娘了，王二狗也只能陪着笑脸道歉。 其实被难为的除了牛翠花，还有给星巴克做订单系统的外包公司的程序员林蛋大。
* 一开始提需求的时候星巴克说我们只有正常杯（中杯），原味和加糖这几种选择，人家林蛋大也是有两年工作经验的码农，这需求不在话下，蛋大还想到了要面对抽象编程。
*
* 首先 看咖啡这个需求有几个状态 有口味 和大小
* 则 可以抽象口味 实现大小
* */
public class CoffeeTest {
    public static void main(String[] args) {
//        加糖 并且大杯 并且符合OCP原则 提供者修改 使用者关闭
        CoffeeTaste coffeeTaste = new CoffeeWithSuger(new MidSize());
coffeeTaste.taste();
    }
}

abstract class CoffeeTaste{
//        聚合
   protected CoffeeSize coffeeSize ;
   protected String sorm ;
    void taste(){
        System.out.println(this.sorm+coffeeSize.size());
    }

 }
 class CoffeeWithSuger extends CoffeeTaste{
     public CoffeeWithSuger(CoffeeSize coffeeSize) {
         this.coffeeSize = coffeeSize;
         this.sorm = "糖";
     }
 }
 class CoffeeWithMilk extends CoffeeTaste{
     public CoffeeWithMilk(CoffeeSize coffeeSize) {
         this.coffeeSize = coffeeSize;
         this.sorm = "奶";

     }
 }

 interface  CoffeeSize{
   String size();
 }

 class LargeSize implements CoffeeSize{
     @Override
     public String size() {
         return "Large";
     }
 }
class MidSize implements CoffeeSize{
    @Override
    public String size() {
        return "Mid";
    }
}