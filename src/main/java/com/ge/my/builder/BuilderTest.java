package com.ge.my.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/11 0011
 */
public class BuilderTest {

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        // 创建指挥者
        Director director = new Director();
        // 华为构造者
        AbstractBuilder huaWeiComputerBuilder = new HuaWeiComputerBuilder();
        // 构造华为电脑
        Computer huaWeiComputer = director.construct(huaWeiComputerBuilder);
        // 打印清单
        huaWeiComputer.show();
        System.out.println();
        // 小米构造者
        Computer xiaoMiComputer = director.construct(new XiaoMiComputerBuilder());
        // 打印清单
        xiaoMiComputer.show();
    }
}

/**
 * 要建造的产品类
 */
class Computer{

    public Computer(){
    }

    /**
     * 电脑组件集合
     */
    private List<String> parts = new ArrayList<String>();

    /**
     * 把单个组件添加到电脑组件集合中
     *
     * @param part
     */
    public void add(String part) {
        this.parts.add(part);
    }

    /**
     * 遍历输出组件
     */
    public void show(){
        parts.forEach(System.out::println);
    }
}

/**
 * 抽象的建造者，定义具体建造者要造什么
 */
abstract class AbstractBuilder{

    /**
     * 装CPU
     */
    public abstract void buildPartCPU();

    /**
     * 装主板
     */
    public abstract void buildPartMainBoard();

    /**
     * 获得组装好的电脑
     */
    public abstract Computer getComputer();
}

/**
 * 华为电脑建造者
 */
class HuaWeiComputerBuilder extends AbstractBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildPartCPU() {
        this.computer.add("huaWei Cpu");
    }

    @Override
    public void buildPartMainBoard() {
        this.computer.add("huaWei partMainBoard");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}

/**
 * 小米电脑建造者
 */
class XiaoMiComputerBuilder extends AbstractBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildPartCPU() {
        this.computer.add("xiaoMi Cpu");
    }

    @Override
    public void buildPartMainBoard() {
        this.computer.add("xiaoMi partMainBoard");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}

/**
 * 指挥者，可以是单例
 */
class Director{

    public Director(){}

    /**
     *
     * @param abstractBuilder 建造者抽象类
     */
    public Computer construct(AbstractBuilder abstractBuilder){
        abstractBuilder.buildPartCPU();
        abstractBuilder.buildPartMainBoard();
        return abstractBuilder.getComputer();
    }

    public Computer getProduct(AbstractBuilder abstractBuilder){
        return abstractBuilder == null ? null : abstractBuilder.getComputer();
    }
}
