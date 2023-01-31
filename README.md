# Exercise 1: Class Diagrams
Read and study the following business requirement and acceptance criteria.
### Business Requirement:
We’ve just had a request from a school and they would like to track student grades for the Mathematics class. It’s the end of the school term and
the teacher would like to input the student grades into a system. They would like your help to design and code up a class to represent a student.
You can find the business acceptance criteria below:<br />

#### Business Acceptance Criteria:<br />

Your program must have a Student class<br />
A Student must have a name<br />
A Student must have a single grade<br />
The value for grade must be one of the following: A, B, C, D, E, F<br />
A Student must have a single group<br />
The value for group must be one of the following: 1, 2, 3, 4, 5<br />
A Student has a secretNickName and is set to “MySecretNickName”<br />

The school should be able to initialise the Student Class with an initial value for name, grade and group.<br />
The school should be able to get the Student’s grade securely<br />
The school should be able to get the Student’s name securely<br />
The school should NOT be able to get the Student’s secretNickName<br />
The school should be able to call methods to upgrade and downgrade the Student’s grade.<br />
For example, if the Student has a current grade of “B”, an upgrade will result in the grade being set to “A”.
If the Student has a current grade of “C”, a downgrade will result in the grade being set to “D”.

1.1 Using your understanding of access modifiers, getters and setters, draw a well-encapsulated class diagram to satisfy the business
acceptance criteria.



Top Tip: Have a think about your class name, the attributes you want to capture and also the methods you will need. Don’t forget to consider the
data types, as well as how you can make your class well-encapsulated through the use of Access Modifiers, Getters and Setters.
A suggested tool you can use for your Class Diagram is https://app.diagrams.net/ , but feel free to use pen & paper or Microsoft Powerpoint if you
wish!

<br />
Exercise 2: Translate the Class Diagram into Code
2.1 Using your understanding of access modifiers, getters and setters, translate your class diagram from Exercise 1 into working code.