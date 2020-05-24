package sort;

import sort.ListMergeSort.Node;

public class ListSelectSort {
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			Node next=null;
		}
	}
	public static Node listselectSort(Node head) {
		Node p1=head;
		while(p1!=null) {
			Node min=p1;
			for(Node i=p1;i!=null;i=i.next) {
				if(i.data<min.data)
					min=i;
			}
			int temp=p1.data;
			p1.data=min.data;
			min.data=temp;
			p1=p1.next;
		}
		return head;
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
		int[] arr= {1,3,2,4,3,4,2,7,4,6,4,7,2};
		Node head= creadList(arr);
		//printList(head);
		head=listselectSort(head);
		printList(head);
	}
}
