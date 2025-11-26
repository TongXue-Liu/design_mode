package cc.igaa.demo1;

public class App {
    /**
     * 开放封闭原则
     * 1、
     *  ocp 是面向对象所有原则的核心。
     * 2、
     *  对功能扩展开发
     *  面向修改代码封闭。
     * 3、
     *  需求改变时不改变我们的代码，通过扩展就能对功能
     *  进行实现。
     * @param args
     */
    public static void main(String[] args) {
        /*
        使用代码，描述不同需求的用户去办理不同的业务。
        
         根据上面已知的条件，思考。
           在这个程序之间会出现多少个对象？
           每个对象的行为或者属性分别是什么？
         */
        
        /**
         * 对象一：用户。属性：记录不同的用户类型(存款、取款、转载)  BankUser
         * 对象二：银行柜员。帮助用户处理不同的需求。  BankStuff
         * 对象三：银行业务系统。处理(存款、取款、转载)等操作。  BankProcess
         */
        BankUser bankUser = new BankUser();
        bankUser.setType("转账");
        BankStuff bankStuff = new BankStuff();
        bankStuff.handleProcess(bankUser);
        
        
        /**
         * 基础知识
         *  开闭原则：针对扩展进行开发，修改封闭。
         *  单一职责：一个类只做一件事。
         *对案例思考：
         *  上述案例之中，看似已经符合开闭原则之中的 ”扩展“ 原则，但是因为银行系统
         *  并不符合我们的单一职责，不符合单一职责必然不符合开闭原则。
         */
    }
}
