# Evrete_Rule_Engine

In this project, we are calculating the Commission on transaction based on transaction count.

Rules for calculating Commission on a transaction is as follows :

1. transactionCount < 0 (Invalid transactionCount)
2. 0 <= transactionCount <= 10 (Commission percentage = 2 %)
3. 11 <= transactionCount <= 20 (Commission percentage = 4 %)
4. 21 <= transactionCount <= 30 (Commission percentage = 6 %)
5. 31 <= transactionCount <= 40 (Commission percentage = 8 %)
6. transactionCount > 40 (Commission percentage = 10 %)

All these rules are implemented using Evrete.
