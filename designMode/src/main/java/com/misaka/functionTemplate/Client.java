package com.misaka.functionTemplate;

public class Client {
    public static void main(String[] args) {
        TemplateFactory milk = new Milk();
        milk.make();
        TemplateFactory soya = new SoyaMilk();
        soya.make();
    }
}
