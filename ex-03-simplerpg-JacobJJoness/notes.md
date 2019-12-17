# Objects: Instances of Classes

## Classes and Objects
* A **class** describes the attributes and behaviors of an **object**.
* An **object** is a specific instance of a **class**.

## Creating and Storing Objects (Instantiation)
* A class contains constructors that are invoked to create objects. They have the same name as the class.
* Existing classes and class libraries can be utilized as appropriate to create objects.
* Parameters allow values to be passed to the constructor to establish the initial state of the object.
* A **signature** consists of a **constructor** name and **parameter** list.
* The **parameter list**, in the header of a constructor, lists the types of the values that are passed and their variable names. These are often referred to as *formal* parameters.
* A **parameter** is a value that is passed into a constructor. These are often referred to as *actual* parameters.
* Constructors are said to be **overloaded** when there are multiple constructors with the *same name but a different signature*.
* The actual parameters passed to a constructor must be compatible with the types identified in the formal parameter list.
* Parameters are passed using call by value. Call by value initializes the formal parameters with copies of the actual parameters. 
* Every object is created using the keyword `new` followed by a call to one of the class’s constructors.

## Calling a void method
* An object’s behavior refers to what the object can do (or what can be done to it) and is defined by methods.
* *Procedural abstraction* allows a programmer to use a method by knowing what the method does even if they do not know how the method was written. 
* A method signature for a method without parameters consists of the method name and an empty parameter list. 
* A method or constructor call interrupts the sequential execution of statements, causing the program to first execute the statements in the method or constructor before continuing. Once the last statement in the method or constructor has executed or a return statement is executed, flow of control is returned to the point immediately following where the method or constructor was called. 
* Non-static methods are called through objects of the class.
* The dot operator is used along with the object name to call non-static methods.
* Void methods do not have return values and are therefore not called as part of an expression.

## Calling a void method with parameters
* A method signature for a method with parameters consists of the method name and the ordered list of parameter types. 
* Values provided in the parameter list need to correspond to the order and type in the method signature. 
* Methods are said to be overloaded when there are multiple methods with the same name but a different signature.

## Calling a Non-void method
* Non-void methods return a value that is the same type as the return type in the signature. To use the return value when calling a non-void method, it must be stored in a variable or used as part of an expression.