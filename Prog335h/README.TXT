Program 335h-Final 2003
(fatuous dice function)

Program Description:  A certain game requires that two dice be rolled, one at a time.  If p and q are the numbers rolled on the first and second die, respectively the value of the roll in the game is determined as follows:

	P	Q	Rule (value of the roll and condition)
	Even	Odd	2P + Q
	Odd 	Even	P + 2Q
	Even	Even	P + Q	When P not = Q
			3P	when P = Q
	odd	Odd	P + Q	when P not  =Q
			3Q	when P = Q

Write a program that will receive a pair of values P and Q that computes the value of the roll.
