package hard;

// https://www.codeeval.com/open_challenges/85/
/*
 
 FIND MIN
CHALLENGE DESCRIPTION:

Credits: This problem appeared in the Facebook Hacker Cup 2013 Hackathon. 

After sending smileys, John decided to play with arrays. Did you know that hackers enjoy playing with arrays?
John has a zero-based index array, m, which contains n non-negative integers. However, only the first k
values of the array are known to him, and he wants to figure out the rest. 

John knows the following: for each index i, where k <= i < n, m is the minimum non-negative integer which
is *not* contained in the previous *k* values of m. 

For example, if k = 3, n = 4 and the known values of m are [2, 3, 0], he can figure out that m[3] = 1.
John is very busy making the world more open and connected, as such, he doesn't have time to figure out
the rest of the array. It is your task to help him. Given the first k values of m, calculate the nth
value of this array. (i.e. m[n - 1]).Because the values of n and k can be very large, we use a 
pseudo-random number generator to calculate the first k values of m. Given positive integers a, b, c and r,
the known values of m can be calculated as follows: 



m[0] = a 
m = (b * m[i - 1] + c) % r, 0 < i < k 
 
 
Your program should accept as its first argument a path to a filename. Each line in this file contains 6
comma separated positive integers which are the values of n,k,a,b,c,r in order. E.g. k <= i < n

Examples
 N K  A B C   R
78,51,3,5,5,51230 , and where I is the next index so presumably n-1
	K <= I < N
	51 <= I < 78
	m = (b * m[i - 1] + c) % r, 0 < i < k 
	m = ( 5 * m[i -1] + 5) % 51230, 0 < i < 51
	
Exampels

M =  [2, 3, 0]
N	K	A	B	C	R
4	3	2	3	0	1
	K <=i <n
	3 <=i <4
	i=3
	
	m = (b * m[i - 1] + c) % r, 0 < i < k 
	m = (3 * m[3 - 1] + 0) % r, 0 < i < k 
	
78,51,3,5,5,51230
186,75,68,16,539,312
137,135,48,17,461,512
98,22,6,30,524,100
46,18,7,11,9,46

Print out the nth element of m for each test case e.g.

26
34
1
6
12
 
 */
public class FIND_MIN {

}