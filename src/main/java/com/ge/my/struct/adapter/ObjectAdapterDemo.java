package com.ge.my.struct.adapter;

/**
 * 对象适配器样例
 *
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/12 0012
 */
public class ObjectAdapterDemo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Motor electricAdapter = new ElectricAdapter();
        electricAdapter.drive();

        Motor opticalMotor = new OpticalAdapter();
        opticalMotor.drive();
    }
}

// 目标：发动机
interface Motor {

    /**
     * 发动机驱动
     */
    void drive();
}

// 适配者1：电能发动机
class ElectricMotor {

    public void electricDrive() {
        System.out.println("电能发动机驱动汽车！");
    }
}

// 适配者2：光能发动机
class OpticalMotor {
    public void opticalDrive() {
        System.out.println("光能发动机驱动汽车！");
    }
}

// 电能适配器
class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}

// 光能适配器
class OpticalAdapter implements Motor {
    private OpticalMotor opticalDrive;
    public OpticalAdapter() {
        opticalDrive = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalDrive.opticalDrive();
    }
}
