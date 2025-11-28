package cc.igaa.demo2;

/**
 *   @author JuRan
 *   @date 27/11/2025 上午 9:46
 *   @description:
 */
public class App {
    public static void main(String[] args) {
        /**
         * 面向接口或者面向抽象编程核心："把可能进行变化的地方用抽象进行封装"。
         *
         * 因为demo1中，银行业务并没有满足我们的单一职责，所以对BankProcess进行改造
         * 把不同的业务进行拆分，分别用不同的接口进行封装。
         * 使其能够满足单一职责、开放封闭原则。
         */
        BankUser bankUser = new BankUser();
        bankUser.setType("存款");
        BankStuff bankStuff = new BankStuff();
        bankStuff.handleProcess(bankUser);
    }
}
