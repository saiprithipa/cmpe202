Replaced Strategy pattern with lambda expressions and functions in the following way.

1. Added class LambdaFunction which contains two lambda functions namely receiptSlipLambda and packingSlipLambda. 
2. Added LambdaHelper which replaced methods originally implemented in AbstractSlipStrategy.
3. Replaced for loops with lambda expressions using java stream and filter.
4. Replaced logic for calculating total price of all components with lambdas collectors implementation.

So, I no longer need to use Strategy classes like ReceiptSlipStrategy and PackingSlipStrategy.

Comparison:

Strategy Pattern proves beneficial when it comes to giving a better design and it can be easily extended for any components added in the future.

Lambda Pattern on the other hand comes handy when it comes to writing shorter, cleaner and effective code along with using benefits provided by Java's Stream API.