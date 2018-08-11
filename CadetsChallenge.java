package myprograms;
/*
Sam wants to join Negoil army. The head of cadets have given a question to all who are coming for interview and who ever clears the challenge, he is taking in job. The question is a logical challenge: There are cadets with multiple heights. Sam have to identify Cadets who are matching with specific height and find a specific positioned Cadet from them. You have to help sam to clear this challenge and get the job.

The challenge is given in multiple lines: 
first line contains number of Cadets
next line contains different numbers indicating heights of different Cadets
next line contains number of queries
next lines contians queries with x, y as numbers.

X decides the min height to be considered in given heights. You have to consider Cadets who have height greater then equal to X in their given order. Then you need to print yth height from selecgted candidates. If you dont find yth number, print -1.

Input:				Output:
7
6 7 3 4 2 1 5
6
3 4				4
7 2				-1	
4 1				6
5 2				7
6 1				6
1 4				4
*/
import java.util.ArrayList;
import java.util.List;

public class CadetsChallenge {
public static int a[]= {6,7,3,4,2,1,5};
static int challenge(int x,int y)
{
	
	List<Integer> condition=new ArrayList<Integer>();
	for(int i=0;i<7;i++)
	{
		if(a[i]>=x)
		{
			condition.add(a[i]);
		}
	}
	//System.out.println(condition);
	if(condition.size()<y)
	return -1;
	else
		return condition.get((y-1));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(challenge(3,4));		
		System.out.println(challenge(7,2));		
		System.out.println(challenge(4,1));		
		System.out.println(challenge(5,2));		
		System.out.println(challenge(6,1));		
		System.out.println(challenge(1,4));	
}

}
