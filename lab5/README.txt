Added Customer, Counter, Kitchen (cook who grills veggies and patties), Kitchen(Assembler) and Kitchen(Fries Maker)
There are 6 swimlanes.

Responsibilities:

Customer:
Confirm order: Customer places the order, waits for the order, receives order from the Fries guy.
Cancel Order:  Customer places the order, waits for the order amd then decides to cancel the order.

Guy1:
Order placement: Counter guy takes the order, decides whether custom order or not and passes on the order to the kitchen.

Guy2:
Milkshake Maker: Makes milkshakes and passes on to the Fries Guy for packing.

Guy3:
Cook: Grill guy receives the order, grills the veggies and patties and passes on to the assembler.

Guy4:
Assemble with normal order: Assembler guy works on the custom options, receives the grilled veggies and patties, assembles on the bun and passes on to the Fries guy.
Assemble with custom order: Assembler guy receives the grilled veggies and patties, assembles on the bun and passes on to the Fries guy.

Guy5:
Cook and pack: Fries guy receives the order, makes fries, receives the burger and packs the burger, fries and completes the order to the customer.


