Welcome to **KhumoChatApp**, a simple Java-based chat app project built as part 1 of the **RROG5121** module Portfolio of Evidence (PoE).

This project application shows the fundamentals of Java programming fundamentals, including:

- Variables and scope
- Data types
- Classes and methods
- Decisions and loops
- Arrays
- Validation logic
- Unit testing with JUnit

  ---

Features include:

1. User Registration
- **Username** must contain an underscore `_` and be no more than 5 characters long.
- **Password** must:
  - Be at least 8 characters
  - Include a capital letter
  - Include a number
  - Include a special character
- **Cellphone number** must start with `+` (international format) and be at least 11 digits long.

  2. Login Functionality
- Users can log in using registered credentials.
- Feedback is provided for success or failure.

---

3. Validation Methods

| Method                  | Description                                                  |
| `checkUserName()`            - Validates username format                      
| `checkPasswordComplexity()`  - Validates password against complexity rules 
| `checkCellPhoneNumber()`     - Validates the format of cellphone number   
| `registerUser()`             - Handles full registration validation and feedback 
| `loginUser()`                - Verifies login credentials 
| `returnLoginStatus()`        - Returns appropriate message based on login result  

---

KhumoChatApp/
│
├── src/
│   └── khumochatapp/
│       ├── ChatUser.java        # Core logic class
│       └── KhumoChatApp.java    # Main app class
│
└── test/
    └── khumochatapp/
        └── ChatUserTest.java    # Unit tests using JUnit 5
