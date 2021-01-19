# Luhn Algorithm

###Overview
Luhn formula is used to validate credit card numbers, sim card numbers, IMEI numbers and certain countries ID numbers (South Africa being one of those countries).
This is not a final measure because there are a lot of number that may escape the sift,  but at least it can be a low-cost, quick validation on a convenient system.
You may read more about Luhn's algorithm on Wikipedia.

###Motivation
I have just learned about the Luhn formula from participating in the IBM's MTM2020 contest and I have decided to try and implement it in Java.

###Project Structure
This is a Maven project.  Created and tested only from the terminal.  The classes in the target folder are generated by Maven's compilation command.
The tests run are for Junit 5 and might need tweaking to work with Junit 4 and below.

