Given a pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes.

Examples: 

Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL

Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL


Input: NULL 
Output: NULL

Input: 1->NULL 
Output: 1->NULL 

Reverse a linked list by Iterative Method:
The idea is to use three pointers curr, prev, and next to keep track of nodes to update reverse links.

Illustration:

https://media.geeksforgeeks.org/wp-content/cdn-uploads/RGIF2.gif
