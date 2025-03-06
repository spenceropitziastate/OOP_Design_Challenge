# OOP_Design_Challenge
This repository contains the code for problem 4 of assignment 1 in CPRE416
Car and Motorcycle inherit Vehicle and override the abstract methods
Vehicle implements the drivable interface ensuring that the methods startEngine and accelerate are defined
There is method overloading with Car's honk allowing either no input or an integer input for the amount of beeps
There is data coupling between Car's setSpeed and adjustSpeed, where the primitive speed is passed between them
There is stamp coupling with Garage's parkVehicle, where a Vehicle object is passed through
