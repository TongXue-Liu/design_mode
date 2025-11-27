package cc.igaa.demo3;

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
         */
        BankUser bankUser = new BankUser();
        bankUser.setType("存款");
        BankStuff bankStuff = new BankStuff();
        bankStuff.handleProcess(bankUser);
    }
}
