**Demo Run Output - ReceiptSlip and PackingSlip**

![Demo Run Output - ReceiptSlip](https://github.com/saiprithipa/cmpe202/blob/master/lab6/output/receiptslip.png)
![Demo Run Output - PackingSlip](https://github.com/saiprithipa/cmpe202/blob/master/lab6/output/packingslip.png)

---

***Design Pattern Used:*** Strategy Pattern, Factory Pattern

***Design Approach:***
The packing and reciept display logic is abstracted out in strategy classes - ReceiptSlipStrategy and PackingSlipStrategy which implements an interface ISlipStrategy. The strategy classes's screenContents() method is invoked by application by passing the order model to the constructor. The ordering of items are decided in each strategy class. For Receipt slip the order of display is changed according to the requirement in the screenContent() method. Same is true of packing slip too. However, these two strategy classes uses same order request from the user. This way I take advantage of strategy pattern while using same order request from the user.

***Strategy Pattern:*** ReceiptSlipStrategy.java, PackingSlipStrategy.java

---
