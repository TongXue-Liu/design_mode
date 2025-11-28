package cc.igaa.demo4;

import cc.igaa.demo4.service.IBankUserService;
import cc.igaa.demo4.service.impl.UserDepositServiceImpl;

/**
 *   @author JuRan
 *   @date 27/11/2025 上午 10:16
 *   @description:
 */
public class App {
    public static void main(String[] args) {
        /**
         * demo2中，对银行业务进行了进一步的改造，使其更加符合开放封闭原则。
         * 但是依然会存在一些问题，对每一个方法都进行接口的抽象，比较的极端，所以，还是要根据实际业务的业务情况，减少接口的封装。
         *
         *
         * demo3中
         *  通过一个BankProcess接口，抽象出了存款、取款、转账等操作。
         *
         * demo4中
         *  对原有BankUser中具有变化的switch内容进行抽象。
         *
         *  封装、抽象不是目的，目的是封装变化。
         *      只有把变化进行封装，我们的程序，才能够做到单一，才能做到开放封闭，
         *      才能做高内聚(模块的单一性)、低耦合(模块之间的依赖程度)。
         */
        //BankUser bankUser = new BankUser();
        //bankUser.setType("存款");
        //BankStuff bankStuff = new BankStuff();
        //bankStuff.handleProcess(bankUser);
        

        UserDepositServiceImpl userDepositService = new UserDepositServiceImpl();
        BankStuff bankStuff = new BankStuff();
        bankStuff.handleProcess(userDepositService);
    }
}
