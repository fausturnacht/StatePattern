# Bank Account State Management Using the State Pattern

This project demonstrates how to refactor a bank account system using the **State Design Pattern** to manage different account states without relying on `if-else` or `switch` statements.  
Each account state encapsulates its own behavior, making the system easier to maintain and extend.

---

## Problem Overview

A bank account can be in one of the following states:

- **Active**
  - Allows deposits and withdrawals
  - Can be suspended or closed

- **Suspended**
  - Disallows deposits and withdrawals
  - Allows viewing account information
  - Can be activated or closed

- **Closed**
  - Disallows all transactions
  - Disallows viewing account information
  - Cannot be activated or suspended

The original approach used conditional logic inside the `Account` class, which becomes error-prone as the number of states grows.  
The **State Pattern** removes this complexity by delegating state-specific behavior to separate classes.

---

## Design Overview

### Composition of `Account`

- `accountNumber : String`
- `balance : Double`
- `accountState : AccountState`

### Supported Operations

- `deposit(Double amount)`
- `withdraw(Double amount)`
- `activate()`
- `suspend()`
- `close()`
- `toString()` – displays account number and balance

---

## State Pattern Structure

- **AccountState (interface)**  
  Declares all operations an account can perform.

- **Concrete States**
  - `ActiveState`
  - `SuspendedState`
  - `ClosedState`

Each concrete state defines how the account behaves in that state and whether transitions to other states are allowed.
