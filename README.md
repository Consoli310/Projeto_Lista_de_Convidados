# Event Attendance Management System

This program is a system for managing the attendance of an event, allowing users to add guests (either "paying" or "non-paying"), remove guests, view the complete list, view the "non-paying" list, and calculate a cost for excess guests based on a specified party package size and cost per excess guest.

## ⚠️ Recommended Terminal
It is highly recommended to use a terminal compatible with **ANSI Escape Codes** for the best experience.

## 📌 Features

1. **Add guests to the list**
   - Enter names one by one, pressing "enter" after each name.
   - Mark a guest as "non-paying" by adding a minus sign (`-`) before or after the name.
   - Type `exit` to return to the main menu.

2. **Remove guests from the list**
   - Specify the guest number to remove (check the complete list first).
   - Type `exit` to cancel and return to the main menu.

3. **Show complete list**
   - Displays all guests in a numbered format.

4. **Show non-paying guests list**
   - Displays only the "non-paying" guests in a numbered format.

5. **Calculate excess guests**
   - Input the allowed number of guests for the party package.
   - Specify the cost per excess guest.
   - Non-paying guests are excluded from the total count.
   - Example Calculation:
     - 60 guests in total, 5 non-paying → 55 paying guests.
     - Party package allows 50 guests → 5 excess guests.
     - If each excess guest costs 50 currency units → Total excess cost: 250.
   - Type `exit` to cancel and return to the main menu.

### 🚪 Exit the Program
To exit the program:
- Be in the main menu and type **`EXIT`** in uppercase letters.
- Confirm exit by typing **`s`**.
- To cancel, type **`n`**.
- This option is hidden for security reasons to prevent accidental data loss.
