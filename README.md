# DuckGame
Homework of design pattern: Strategy
![UML_Diagram](/doc/DuckGame.png)

## Spec
### Requirements Statement
* There are four types of ducks in the game: MallardDuck, RedheadDuck, RubberDuck, and DecoyDuck. 
* All types of the ducks have the same swim behavior but are with different displays. 
* Some ducks can fly with wings, but some cannot fly. 
* A duck can quack, squeak, or be silent. 
* A duck can change its fly or quack behavior at run time. 
* New fly or quack behaviors can be added, and the existing behaviors can be modified at compile time.

### Input
```
#Six types of command
duck [DuckType] [FlyMode] [QuackMode]
changeFly [DuckType] [FlyMode]
changeQuack [DuckType] [QuackMode]
swim [DuckType]
fly [DuckType]
quack [DuckType]
```

### Output
```
After swim command: 
	Print("[DuckType] is swimming")

After fly command:
	if FlyMode=="CanFly" => Print("duck is flying")
	if FlyMode=="CannotFly" => Print("duck cannot fly")

After quack command:
	if QuackMode=="Quack" => Print("quack quack quack")
	if QuackMode=="Squeak" => Print("squeak squeak squeak")
	if QuackMode=="Silent" => Print("(silent)")
```

### Comments
[DuckType] is limited to "MallardDuck", "RedheadDuck", "RubberDuck" and "DecoyDuck".
[FlyMode] is limited to "CanFly" and "CannotFly".
[QuackMode] is limited to "Quack", "Squeak" and "Silent".

Please implement your main function in Class Main.
We'll test your program through "java Main inputFile"
e.g java Main sampleInput

Do not read input from System.in or hard code input file, or your program won’t pass any test case.

### Upload
Please zip your source code and upload it.
The file name should be Team[teamID].zip. e.g. Team7.zip
The folder structure should be:
```
   unzip Team7.zip
=> [dir] Team7
=>       Team7/*.java
```
You won’t receive any point if you didn’t follow the directory structure or main class name or compressed format!

## How to run
```
cd Team1
javac ./*.java
java Main ../tests/sampleInput
```
