package sort;

public class ListMergeSort {
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			Node next=null;
		}
	}
	public static Node divide(Node head) {
		Node fast=head;
		Node slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static Node merge(Node left,Node right) {
		Node head=new Node(-1);
		Node tail =head;
		while(left!=null&&right!=null) {
			if(left.data<right.data) {
				tail.next=left;
				left=left.next;
			}else {
				tail.next=right;
				right=right.next;
			}
			tail=tail.next;
		}
		while(right!=null) {
			tail.next=right;
			right=right.next;
			tail=tail.next;
		}
		while(left!=null) {
			tail.next=left;
			left=left.next;
			tail=tail.next;
		}
		return head.next;
	}
	public static Node listmergeSort(Node head) {
		if(head.next==null) return head;
		Node mid=divide(head);
		Node left=head;
		Node right=mid.next;
		mid.next=null;
		left=listmergeSort(left);
		right=listmergeSort(right);
		return merge(left,right);
		
	}
	public static Node creadList(int[] arr) {
		Node head=new Node(arr[0]);
		Node tail=head;
		for(int i=1;i<arr.length;i++) {
			Node newnode=new Node(arr[i]);
			tail.next=newnode;
			tail=newnode;
		}
		return head;
	}
	public static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,6,3,5,3,3,6,7,5,4};
		Node head= creadList(arr);
		//printList(head);
		head=listmergeSort(head);
		printList(head);
	}
}
