package com.person.study.factory;import com.person.study.factory.abstractfactory.EarthFactory;import com.person.study.factory.abstractfactory.HairTail;import com.person.study.factory.abstractfactory.MarsFactory;import com.person.study.factory.normalfactory.ChickenFactory;import com.person.study.factory.normalfactory.IFactory;import com.person.study.factory.simplefactory.Bird;import com.person.study.factory.simplefactory.BirdFactory;import com.person.study.factory.simplefactory.Chicken;import com.person.study.factory.simplefactory.Piegon;public class FactoyDesign {    public static void main(String [] args){        // 简单工厂：创建多对象时，都需要修改        Bird chicken1 = BirdFactory.createBird(Chicken.class);        Bird chicken2 = BirdFactory.createBird(Chicken.class);        Bird piegon1 = BirdFactory.createBird(Piegon.class);        Bird piegon2 = BirdFactory.createBird(Piegon.class);                chicken1.egg();        chicken2.egg();        piegon1.egg();        piegon2.egg();                //工厂方法:创建多个对象时，追需要修改一处        IFactory factory = new ChickenFactory();        com.person.study.factory.normalfactory.Bird chicken11 = factory.createChicken();        com.person.study.factory.normalfactory.Bird chicken12 = factory.createChicken();        chicken11.egg();        chicken12.egg();        //抽象工厂        EarthFactory earthFactory = new EarthFactory();        com.person.study.factory.abstractfactory.Chicken chicken21 = earthFactory.createChicken();        HairTail hairTail = earthFactory.createHairTail();        chicken21.egg();        hairTail.swim();        MarsFactory marsFactory = new MarsFactory();        com.person.study.factory.abstractfactory.Chicken chicken22 = marsFactory.createChicken();        HairTail hairTail1 = marsFactory.createHairTail();        chicken22.egg();        hairTail1.swim();    }}