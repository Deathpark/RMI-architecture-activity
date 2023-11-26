# RMI-architecture-activity
Activity developed for the subject Software Architecture at the institution PUC - Minas

For running this application, you need to do a few steps:

# Step 1: Compiling all files

To compile all files, you just need to go to /client/ and /server/ in your terminal and run the following command in the terminal:

```
javac *.java
```

# Step 2: Running the client-side

To run the server-side of this application, you need to go to /client/ and run the following command on terminal:

```
rmiregistry 9400
```

If everything goes right, your terminal will be listening until you kill the proccess

# Step 3: Running the server-side

To run the server-side of this application, you need to go to /server/ and run the following command on terminal:

```
java Server
```

If everything goes right, you must see a message: Server ready
and your terminal will be listening until you kill the proccess


# Step 4: Using the application

Now, to use the application, open a terminal on the folder /client/.
To use the calculator functions created on this project, you just need to type "java Client" followed for the options that you want to use.


The avaible functions are:
1 - Add Function - Requires 2 numbers
2 - Subtraction Function - Requires 2 numbers 
3 - Multiply Function - Requires 2 numbers
4 - Divide Function - Requires 2 numbers
5 - Square Root Function - Requires 1 number
6 - Elevate Function - Requires 2 numbers

For example, if we want to use the Multiply Function, multiplying 5 by 100, we need to type in the terminal:
```
java Client 3 5 100
```

and we will have the answer in the terminal like this:
<br />
![readMeExample](https://github.com/Deathpark/RMI-architecture-activity/assets/41022890/92110eaf-1352-473f-af39-0058226f324d)
