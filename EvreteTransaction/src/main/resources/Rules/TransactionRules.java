import com.EvreteTransaction.EvreteTransaction.Commission;
import com.EvreteTransaction.EvreteTransaction.Transaction;
import org.evrete.dsl.annotation.Rule;
import org.evrete.dsl.annotation.Where;

public class TransactionRules {

    @Rule
    @Where(value = { "$t.transactionCount < 0"})
    public void ruleRangeVoid(Transaction $t, Commission $c)
    {
        $c.setCommissionAmount(0);
        $c.setCommissionPercentage(0);
        $c.setResponseMessage("Transaction Count is invalid");
    }

    @Rule
    @Where(value = { "$t.transactionCount >= 0", "$t.transactionCount <= 10"})
    public void ruleRangeOne(Transaction $t, Commission $c)
    {
        $c.setCommissionPercentage(2);
        int commissionAmount = ($t.getTransactionAmount()*2)/100;
        $c.setCommissionAmount(commissionAmount);
        $c.setResponseMessage("Congratulations on your successful commission generation.");
    }

    @Rule
    @Where(value = { "$t.transactionCount >= 11", "$t.transactionCount <= 20"})
    public void ruleRangeTwo(Transaction $t, Commission $c)
    {
        $c.setCommissionPercentage(4);
        int commissionAmount = ($t.getTransactionAmount()*4)/100;
        $c.setCommissionAmount(commissionAmount);
        $c.setResponseMessage("Congratulations on your successful commission generation.");
    }

    @Rule
    @Where(value = { "$t.transactionCount >= 21", "$t.transactionCount <= 30"})
    public void ruleRangeThree(Transaction $t, Commission $c)
    {
        $c.setCommissionPercentage(6);
        int commissionAmount = ($t.getTransactionAmount()*6)/100;
        $c.setCommissionAmount(commissionAmount);
        $c.setResponseMessage("Congratulations on your successful commission generation.");
    }

    @Rule
    @Where(value = { "$t.transactionCount >= 31", "$t.transactionCount <= 40" })
    public void ruleRangeFour(Transaction $t, Commission $c)
    {
        $c.setCommissionPercentage(8);
        int commissionAmount = ($t.getTransactionAmount()*8)/100;
        $c.setCommissionAmount(commissionAmount);
        $c.setResponseMessage("Congratulations on your successful commission generation.");
    }

    @Rule
    @Where(value = {"$t.transactionCount > 40"})
    public void ruleRangeAll(Transaction $t, Commission $c)
    {
        $c.setCommissionPercentage(10);
        int commissionAmount = ($t.getTransactionAmount()*10)/100;
        $c.setCommissionAmount(commissionAmount);
        $c.setResponseMessage("Congratulations on your successful commission generation.");
    }
}