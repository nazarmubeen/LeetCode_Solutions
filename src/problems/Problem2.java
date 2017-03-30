package problems;

import DSDesign.ListNode;
import DSDesign.Node;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class Problem2 {
	
	public static void main(String[] args)
	{
		ListNode l1=new ListNode();
		ListNode l2=new ListNode();
		
		l1.createNodeatEnd(2);
		l1.createNodeatEnd(4);
		l1.createNodeatEnd(3);
		l1.createNodeatEnd(9);
		l2.createNodeatEnd(5);
		l2.createNodeatEnd(6);
		l2.createNodeatEnd(6);
		l1.printList(l1.head);
		l2.printList(l2.head);
		ListNode newlist=addTwoNumbers(l1,l2);
		newlist.printList(newlist.head);
	}

public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		ListNode newlist=new ListNode();
		
		int sum=0,carry=0;
		
		Node temp1=l1.head;
		Node temp2=l2.head;
		
		if(temp1==null)
		{
			return l2;
		}
		
		if(temp2==null)
		{
			return l1;
		}
		
		while(temp1!=null && temp2!=null)
		{
			sum=temp1.data+temp2.data+carry;
			if(sum>=10)
			{
				newlist.createNodeatEnd((sum%10));
				carry=sum/10;
			}
			else{
				newlist.createNodeatEnd(sum);
				carry=0;
			}
		temp1=temp1.next;
		temp2=temp2.next;
		}
		
		if(temp1!=null)
		{
			while(temp1!=null)
			{
				sum=temp1.data+carry;
				if(sum>=10)
				{
					newlist.createNodeatEnd((sum%10));
					carry=sum/10;
				}
				else{
					newlist.createNodeatEnd(sum);
					carry=0;
				}
				
				temp1=temp1.next;
			}
		}
		if(temp2!=null)
		{
			while(temp2!=null)
			{
				sum=temp2.data+carry;
				if(sum>=10)
				{
					newlist.createNodeatEnd((sum%10));
					carry=sum/10;
				}
				else{
					newlist.createNodeatEnd(sum);
					carry=0;
				}
				temp2=temp2.next;
			}
		}
		if(carry!=0)
		{
			newlist.createNodeatEnd(carry);
			carry=0;
		}
		
		
        return newlist;
    }
	
}
