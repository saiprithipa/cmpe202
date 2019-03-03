
---

***Class:*** Register

***Responsibilities:***

1.	Knows list of customers in line.
2.	Registers the customer information with customer information.
3.	Removes customer from the queue.

***Collaborators:***
- AssignHandler
- CustomerInfo
---
---
***Class:*** AssignHandler

***Responsibilities:***
1.	Decides on the best table size for the customer.
2.	Assigns table to the customer
3.	Assigns table to next customer in line.

***Collaborators:***
- TableObserver
- TableAvailability
- CustomerInfo

---
---

***Class:*** TableObserver

***Responsibilities:***
1.	Knows list of free tables.
2.	Observes the table availability.
3.	Provides free table to AssignHandler.

***Collaborators:***
- TableAvailability
- AssignHandler

---
---

***Class:*** TableAvailability

***Responsibilities:***
1.	Knows list of all tables.
2.	Notifies the TableObserver with table state.
3.	Updates the table availability on state change.

***Collaborators:***
- TableObserver

---
---

***Class:*** CustomerInfo

***Responsibilities:***
1.	Knows customer name.
2.	Knows customer phone number.
3.	Knows number of party.

***Collaborators:***
- Register
- AssignHandler

---
---

***Class:*** TableInfo

***Responsibilities:***
1.	Knows table id.
2.	Knows chair count.
3.	Knows table is free or not.

***Collaborators:***
- TableAvailability

---

### Design Pattern Used: 
***Observer pattern***
TableAvailability object notifies the TableObserver on the free tables available.And the TableObserver updates its state.
Participants: Here, the subject is TableAvailability and the observer is TableObserver.

***Chain of Responsibility pattern***
Register class gets the table to be assigned from the AssignHandler and matches it with the customer in line. If customer confirms, the table is assigned to them (first customer in line.) If the customer leaves or the table does not fit, Register class tries to match it with the next customer in line.
Participants: Here the Client is Customer and the Handler is Register.
