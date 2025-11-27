package cc.igaa.demo2;

import cc.igaa.demo2.service.IDrawMoneyService;
import cc.igaa.demo2.service.ITransferService;
import cc.igaa.demo2.service.IDepositService;

/**
 *   @author JuRan
 *   @date 27/11/2025 上午 9:53
 *   @description: 银行柜员
 *
 *  在这个例子中，BankStuff类作为银行柜员，负责处理存款、取款和转账等操作。
 *      将功能进行抽象处理，使其能够满足开闭原则中的“对扩展开放，对修改关闭”。
 *
 *      同时转账、存款、取款操作也能够满足单一职责原则，
 *      因为每个功能都被单独抽象成接口，并由具体的实现类来完成各自的职责。
 */
public class BankProcess {

    private IDepositService iDepositService;

    private IDrawMoneyService iDrawMoneyService;

    private ITransferService iTransferService;

    //存款
    public void depositFunc(){
        this.iDepositService.deposit();
    }

    //取款
    public void drawMoneyFunc(){
        this.iDrawMoneyService.drawMoney();
    }

    //转账
    public void transferFunc(){
        this.iTransferService.transfer();
    }


    public IDepositService getiDepositService() {
        return iDepositService;
    }

    public void setiDepositService(IDepositService iDepositService) {
        this.iDepositService = iDepositService;
    }

    public IDrawMoneyService getiDrawMoneyService() {
        return iDrawMoneyService;
    }

    public void setiDrawMoneyService(IDrawMoneyService iDrawMoneyService) {
        this.iDrawMoneyService = iDrawMoneyService;
    }

    public ITransferService getiTransferService() {
        return iTransferService;
    }

    public void setiTransferService(ITransferService iTransferService) {
        this.iTransferService = iTransferService;
    }
}
