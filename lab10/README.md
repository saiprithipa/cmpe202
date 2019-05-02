# Lab 10 

**Feature Oriented Programming**

**GumballMachineV1**
**Configuration**

![alt Image of config in FeatureIDE(GumballMachineV1](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV1_QTR50_config.png)

**Output of the above configuration**

![alt Output](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV1_QTR50_output.png)


**GumballMachineV2**
**Crank Model Configuration**

![alt Image of config in FeatureIDE(GumballMachineV2](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_COST25_CRANKMODEL_config.png)


**Model Tree**

![alt Model](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_COST25_CRANKMODEL_model.png)

**Output of the above configuration**

![alt Output](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_COST25_CRANKMODEL_output.png)

**GumballMachineV2**
**Slot Model Configuration**

![alt Image of config in FeatureIDE(GumballMachineV2 Slot_Model](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_SlotModel_COST50_config.png)

**Model Tree**

![alt Model](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_SlotModel_COST50_model.png)

**Output of the above configuration**
![alt Output](https://github.com/saiprithipa/cmpe202/blob/master/lab10/output/GumballMachineV2_SlotModel_COST50_Outputfull.png)

# Comparison of GumballMachine(Lab1) and GumballMachineV1(Lab10) - Object Oriented vs Feature Oriented

Object Oriented Programming (Lab1)

Using BlueJ, I was able to implement the Lab1 to allow three gumball machine models "QuarterGumballMachine", "TwoQuarterGumballMachine" and "AllCoinGumballMachine"
In this way, I used a "Coin" enum to allow three kinds of coins (Quarter, Dime and Nickel)
In this object oriented programming model, there was no way to configure the type of gumball machine we wished to use. All the gumball machines were available at all times and depending on the test method in main, different gumball machines were being called and utilized.


Feature Oriented Programming (Lab10)
Using Eclipse with Feature IDE, I was able to run the gumballmachines GumballMachineV1 and  GumballMachineV2. 
Using AspectJ, the weaving of point cuts in the source code was possible and useful information regarding method calls are available.

GumballMachineV1:
Using the default.config,
I was able to change the config from QTR25 to QTR50 and vide versa.
The model.xml shows the tree structure of which features are optional or alternative or mandatory.
Whenever changes were made to the config, the .aj file was added to the default package or moved from the default package.

GumballMachineV2:
Using the default.config,
I was able to change the config from CrankModel to SlotModel and vide versa.
The model.xml shows the tree structure of which features are optional or alternative or mandatory.
In CrankModel configuration could be changed between ONEQTR and TWOQTR.
Whenever changes were made to the config, the .aj file was added to the default package or moved from the default package. (like CRANKMODEL.aj was kept inside default package for crankmodel config and SLOTMODEL.aj was kept out of the default package)

Object Oriented Programming treats data and its behavior as a single thing called object.
Feature Oriented Programming treats data and behavior as different things and this is done for clarity.
