package sort;

import sort.ListSelectSort.Node;

public class Listmaopao {
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			Node next=null;
		}
	}
	public static Node listmaopaoSort(Node head) {
		Node end=null;
		while(end!=head) {
			boolean notChange=true;
			Node p=head;
			while(p.next!=end) {
				if(p.data>p.next.data) {
					int temp=p.data;
					p.data=p.next.data;
					p.next.data=temp;
					notChange=false;
				}
				p=p.next;
			}
			if(notChange) break;
			end=p;
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
		int[] arr= {1,3,2,4};
		Node head= creadList(arr);
		//printList(head);
		head=listmaopaoSort(head);
		printList(head);
	}
}
